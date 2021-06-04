package com.wallet.mvc.entity;

import com.wallet.mvc.enums.TransactionType;

import java.math.BigDecimal;

/**
 * @author: liushuang26
 * @Date: 2021/6/2 16:43
 * Description:
 */
public class VirtualWalletTransactionEntity {
    private Long id;
    private Long fromWalletId;
    private Long toWalletId;
    private BigDecimal amount;
    private Long createTime = System.currentTimeMillis();
    private BigDecimal balance = BigDecimal.ZERO;
    private boolean isAllowedOverdraft = true;
    private BigDecimal overdraftAmount = BigDecimal.ZERO;
    private BigDecimal frozenAmount = BigDecimal.ZERO;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public boolean isAllowedOverdraft() {
        return isAllowedOverdraft;
    }

    public void setAllowedOverdraft(boolean allowedOverdraft) {
        isAllowedOverdraft = allowedOverdraft;
    }

    public BigDecimal getOverdraftAmount() {
        return overdraftAmount;
    }

    public void setOverdraftAmount(BigDecimal overdraftAmount) {
        this.overdraftAmount = overdraftAmount;
    }

    public BigDecimal getFrozenAmount() {
        return frozenAmount;
    }

    public void setFrozenAmount(BigDecimal frozenAmount) {
        this.frozenAmount = frozenAmount;
    }

    public Long getFromWalletId() {
        return fromWalletId;
    }

    public void setFromWalletId(Long fromWalletId) {
        this.fromWalletId = fromWalletId;
    }

    public Long getToWalletId() {
        return toWalletId;
    }

    public void setToWalletId(Long toWalletId) {
        this.toWalletId = toWalletId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setType(TransactionType credit) {
    }
}
