package com.wallet.mvc.mapper;

import com.wallet.mvc.entity.VirtualWalletEntity;

import java.math.BigDecimal;

/**
 * @author: liushuang26
 * @Date: 2021/6/2 16:38
 * Description:
 */
public interface VirtualWalletRepository {
    VirtualWalletEntity getWalletEntity(Long walletId);

    BigDecimal getBalance(Long walletId);

    void updateBalance(Long walletId, BigDecimal subtract);
}
