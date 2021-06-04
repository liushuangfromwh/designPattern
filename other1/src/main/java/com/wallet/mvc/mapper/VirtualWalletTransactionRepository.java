package com.wallet.mvc.mapper;

import com.wallet.mvc.entity.VirtualWalletTransactionEntity;

/**
 * @author: liushuang26
 * @Date: 2021/6/2 16:39
 * Description:
 */
public interface VirtualWalletTransactionRepository {
    void saveTransaction(VirtualWalletTransactionEntity transactionEntity);
}
