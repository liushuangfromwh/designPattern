package com.unit.shop;

import javax.transaction.InvalidTransactionException;

/**
 * @author: liushuang26
 * @Date: 2021/6/3 11:30
 * Description: 改造之前的代码
 */
public class TransactionOld {


    public class Transaction {
        private String id;
        private Long buyerId;
        private Long sellerId;
        private Long productId;
        private String orderId;
        private Long createTimestamp;
        private Double amount;
        private Integer status;
        private String walletTransactionId;

        // ...get() methods...

        public Transaction(String preAssignedId, Long buyerId, Long sellerId, Long productId, String orderId) {
            if (preAssignedId != null && !preAssignedId.isEmpty()) {
                this.id = preAssignedId;
            } else {
                this.id = IdGenerator.generateTransactionId();
            }
            if (!this.id.startsWith("t_")) {
                this.id = "t_" + preAssignedId;
            }
            this.buyerId = buyerId;
            this.sellerId = sellerId;
            this.productId = productId;
            this.orderId = orderId;
            this.status = STATUS.TO_BE_EXECUTD;
            this.createTimestamp = System.currentTimeMillis();
        }

        public boolean execute() throws InvalidTransactionException {
            if ((buyerId == null || (sellerId == null || amount < 0.0))) {
//                throw new InvalidTransactionException(...);
            }
            if (status == STATUS.EXECUTED) return true;
            boolean isLocked = false;
            try {
                isLocked = RedisDistributedLock.getSingletonIntance().lockTransction(id);
                if (!isLocked) {
                    return false; // 锁定未成功，返回false，job兜底执行
                }
                if (status == STATUS.EXECUTED) return true; // double check
                long executionInvokedTimestamp = System.currentTimeMillis();
                //todo
                if (executionInvokedTimestamp  > 14){
                    this.status = STATUS.EXPIRED;
                    return false;
                }
                //todo
                WalletRpcService walletRpcService = new WalletRpcService();
                String walletTransactionId = walletRpcService.moveMoney(id, buyerId, sellerId, amount);
                if (walletTransactionId != null) {
                    this.walletTransactionId = walletTransactionId;
                    this.status = STATUS.EXECUTED;
                    return true;
                } else {
                    this.status = STATUS.FAILED;
                    return false;
                }
            } finally {
                if (isLocked) {
                    //todo
                    RedisDistributedLock.getSingletonIntance().unlockTransction(id);
                }
            }
        }
    }
}
