package com.unit.shop;

/**
 * @author: liushuang26
 * @Date: 2021/6/3 10:57
 * Description:
 */
public class RedisDistributedLock {
    public static RedisDistributedLock getSingletonIntance() {
        return null;
    }

    public void unlockTransction(String id) {
    }

    public boolean lockTransction(String id) {
        return true;
    }
}
