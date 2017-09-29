package com.ls.demo2;

import com.ls.demo1.Iphone;
import com.ls.demo1.Phone;
import com.ls.demo1.XiaoMi;

/**
 * @author liushuang 2017/9/29
 */
public class PhoneFactory {

    private PhoneFactory(){}

    public static Phone getPhone(String brand) {
        if("iphone".equals(brand)) {
            return new Iphone();
        } else if("xiaomi".equals(brand)) {
            return new XiaoMi();
        }
        return null;
    }
}
