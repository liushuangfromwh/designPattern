package com.wallet.mvc.controller;

import com.wallet.mvc.service.VirtualWalletService;

import java.math.BigDecimal;

/**
 * @author: liushuang26
 * @Date: 2021/6/2 16:32
 * Description:
 */

public class VirtualWalletController {
    // 通过构造函数或者IOC框架注入
    private VirtualWalletService virtualWalletService;

    public BigDecimal getBalance(Long walletId) {
        return null;
    } //查询余额

    public void debit(Long walletId, BigDecimal amount) {
    } //出账

    public void credit(Long walletId, BigDecimal amount) {
    } //入账

    public void transfer(Long fromWalletId, Long toWalletId, BigDecimal amount) {
    } //转账

    //省略查询transaction的接口
}
