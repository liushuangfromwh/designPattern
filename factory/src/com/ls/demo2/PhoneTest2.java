package com.ls.demo2;

import com.ls.demo1.Phone;

/**
 * @author liushuang 2017/9/29
 */
public class PhoneTest2 {
    public static void main(String[] args) {
        Phone iphone = PhoneFactory.getPhone("iphone");
        iphone.run();
    }
}
