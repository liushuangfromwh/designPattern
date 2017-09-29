package com.ls.demo3;

import com.ls.demo1.Phone;

/**
 * @author liushuang 2017/9/29
 */
public class PhoneTest3 {

    public static void main(String[] args) throws Exception {
        Phone phone = PhoneFactory2.getPhone();
        phone.run();
    }
}
