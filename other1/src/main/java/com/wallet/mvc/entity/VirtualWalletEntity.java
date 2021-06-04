package com.wallet.mvc.entity;

import java.math.BigDecimal;

/**
 * @author: liushuang26
 * @Date: 2021/6/2 16:42
 * Description:
 */
public class VirtualWalletEntity {
    private Long id;
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

    public BigDecimal getBalance() {
        return null;
    }
}
