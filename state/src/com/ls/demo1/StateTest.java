package com.ls.demo1;

/**
 * 状态模式的好处是将与特定状态相关的行为局部化,并且将不同状态的行为分割开来.
 * 当一个对象的行为取决于它的状态,并且它必须在运行时刻根据状态改变它的行为时,可以考虑状态模式.
 * @author liushuang 2017/9/30
 */
public class StateTest {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteState1());
        context.request();
    }
}
