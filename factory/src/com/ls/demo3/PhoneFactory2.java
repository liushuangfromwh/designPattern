package com.ls.demo3;

import com.ls.demo1.Phone;

import java.io.IOException;
import java.util.Properties;

/**
 * @author liushuang 2017/9/29
 */
public class PhoneFactory2 {

    private PhoneFactory2(){}

    private static Properties properties = new Properties();


    /**
     * getClassLoader()会加载 src下的配置文件.
     */
    static {
        try {
            properties.load(PhoneFactory2.class.getResourceAsStream("config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Phone getPhone() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String phone = properties.getProperty("phone");
        Class<?> aClass = Class.forName(phone);
        return (Phone) aClass.newInstance();
    }
}
