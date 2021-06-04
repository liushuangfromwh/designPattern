package com.wallet.ddd.domain;

import java.math.BigDecimal;

/**
 * @author: liushuang26
 * @Date: 2021/6/2 16:57
 * Description:
 */
public class VirtualWallet {
    // Domain领域模型(充血模型) 将业务移动到domain中，service类变得很薄
    /**
     * 1.Service 类负责与 Repository 交流。在我的设计与代码实现中，VirtualWalletService 类负责与 Repository 层打交道，调用 Respository 类的方法，
     * 获取数据库中的数据，转化成领域模型 VirtualWallet，然后由领域模型 VirtualWallet 来完成业务逻辑，最后调用 Repository 类的方法，将数据存回数据库。
     * VirtualWallet 不与 Repository（mapper）交互，是因为我们想保持领域模型的独立性，不与任何其他层的代码（Repository 层的代码）
     * 或开发框架（比如 Spring、MyBatis）耦合在一起，将流程性的代码逻辑（比如从 DB 中取数据、映射数据）与领域模型的业务逻辑解耦，让领域模型更加可复用。
     * 2.Service 类负责跨领域模型的业务聚合功能。VirtualWalletService 类中的 transfer() 转账函数会涉及两个钱包的操作，因此这部分业务逻辑无法放到
     * VirtualWallet 类中，所以，我们暂且把转账业务放到 VirtualWalletService 类中了。当然，随着功能演进，使得转账业务变得复杂起来之后，我们也可以
     * 将转账业务抽取出来，设计成一个独立的领域模型。
     * 3.Service 类负责一些非功能性及与三方系统交互的工作。比如幂等、事务、发邮件、发消息、记录日志、调用其他系统的 RPC 接口等，都可以放到 Service 类中。
     */
    private Long id;
    private Long createTime = System.currentTimeMillis();
    ;
    private BigDecimal balance = BigDecimal.ZERO;
    private boolean isAllowedOverdraft = true;
    private BigDecimal overdraftAmount = BigDecimal.ZERO;
    private BigDecimal frozenAmount = BigDecimal.ZERO;

    public VirtualWallet(Long preAllocatedId) {
        this.id = preAllocatedId;
    }

    public BigDecimal balance() {
        return this.balance;
    }

    public void debit(BigDecimal amount) {
        if (this.balance.compareTo(amount) < 0) {
//            throw new InsufficientBalanceException(...);
        }
        this.balance = this.balance.subtract(amount);
    }

    public void credit(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) < 0) {
//            throw new InvalidAmountException(...);
        }
        this.balance = this.balance.add(amount);
    }

    public BigDecimal getAvaliableBalance() {
        BigDecimal totalAvaliableBalance = this.balance.subtract(this.frozenAmount);
        if (isAllowedOverdraft) {
//            totalAvaliableBalance += this.overdraftAmount;
        }
        return totalAvaliableBalance;
    }

    public void freeze(BigDecimal amount) {
    }

    public void unfreeze(BigDecimal amount) {
    }

    public void increaseOverdraftAmount(BigDecimal amount) {
    }

    public void decreaseOverdraftAmount(BigDecimal amount) {
    }

    public void closeOverdraft() {
    }

    public void openOverdraft() {
    }

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
}
