package com.unit.shop;

import org.junit.Assert;
import org.junit.Test;

import javax.transaction.InvalidTransactionException;

/**
 * @author: liushuang26
 * @Date: 2021/6/3 11:05
 * Description:
 * 1.正常情况下，交易执行成功，回填用于对账（交易与钱包的交易流水）用的 walletTransactionId，交易状态设置为 EXECUTED，函数返回 true。
 * 2.buyerId、sellerId 为 null、amount 小于 0，返回 InvalidTransactionException。
 * 3.交易已过期（createTimestamp 超过 14 天），交易状态设置为 EXPIRED，返回 false。
 * 4.交易已经执行了（status==EXECUTED），不再重复执行转钱逻辑，返回 true.
 * 5.钱包（WalletRpcService）转钱失败，交易状态设置为 FAILED，函数返回 false。
 * 6.交易正在执行着，不会被重复执行，函数直接返回 false。
 */
public class TransactionTest {

    /**
     * @Description: 1的代码实现
     * @author: liushuang26
     * @Param: []
     * @return:
     */
    @Test
    public void testExecute() throws InvalidTransactionException {
        Long buyerId = 123L;
        Long sellerId = 234L;
        Long productId = 345L;
        String orderId = "456";

        TransactionLock mockLock = new TransactionLock() {
            public boolean lock(String id) {
                return true;
            }

            public void unlock(String id) {
            }
        };


        Transaction transaction = new Transaction(null, buyerId, sellerId, productId, orderId);
        // 使用mock对象来替代真正的RPC服务
        transaction.setWalletRpcService(new MockWalletRpcServiceOne());
        //mock 锁
        transaction.setTransactionLock(mockLock);
        boolean executedResult = transaction.execute();
        Assert.assertTrue(executedResult);
    }

    /**
     * @Description: 3的实现
     * @author: liushuang26
     * @Param: []
     * @return:
     */
    @Test
    public void testExecute_with_TransactionIsExpired() throws InvalidTransactionException {
        Long buyerId = 123L;
        Long sellerId = 234L;
        Long productId = 345L;
        String orderId = "456";
//        Transaction transaction = new Transaction(null, buyerId, sellerId, productId, orderId);

        Transaction transaction = new Transaction(null, buyerId, sellerId, productId, orderId) {
            protected boolean isExpired() {
                return true;
            }
        };
        transaction.setCreateTimestamp(System.currentTimeMillis() - 14);
        boolean actualResult = transaction.execute();
        Assert.assertFalse(actualResult);
        Assert.assertEquals(STATUS.EXPIRED, transaction.getStatus());
    }
}
