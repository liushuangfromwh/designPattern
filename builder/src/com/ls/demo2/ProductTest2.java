package com.ls.demo2;

/**
 * @author liushuang 2017/9/28
 */
public class ProductTest2 {
    public static void main(String[] args) {
        ConcreteBuilder1 concreteBuilder1 = new ConcreteBuilder1();
        //每次用的时候都需要自己设置参数.不太好.
        concreteBuilder1.setProduct("手机", "3000");
        System.out.println(concreteBuilder1.getProduct());
    }
}
