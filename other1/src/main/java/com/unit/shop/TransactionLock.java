package com.unit.shop;

/**
 * @author: liushuang26
 * @Date: 2021/6/3 11:25
 * Description:
 */
public class TransactionLock {
    public boolean lock(String id) {
        return RedisDistributedLock.getSingletonIntance().lockTransction(id);
    }

    public void unlock(String id) {
        RedisDistributedLock.getSingletonIntance().unlockTransction(id);
    }
}
