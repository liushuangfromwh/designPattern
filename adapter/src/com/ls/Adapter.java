package com.ls;

/**
 * 适配器
 * @author liushuang 2017/9/30
 */
public class Adapter {

    private Adaptee adaptee = new Adaptee();

    public void request() {
        adaptee.DifferentRequest();
    }

}
