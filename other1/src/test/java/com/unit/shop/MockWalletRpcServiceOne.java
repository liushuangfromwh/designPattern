package com.unit.shop;

/**
 * @author: liushuang26
 * @Date: 2021/6/3 11:16
 * Description:
 */

public class MockWalletRpcServiceOne extends WalletRpcService {
    public String moveMoney(Long id, Long fromUserId, Long toUserId, Double amount) {
        return "123bac";
    }
}

