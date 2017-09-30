package com.ls.demo1;

/**
 * @author liushuang 2017/9/30
 */
public class StateTest {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteState1());
        context.request();
    }
}
