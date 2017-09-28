package com.ls.demo3;

import com.ls.demo1.Product;

/**
 * @author liushuang 2017/9/28
 */
public class ProductTest3 {
    public static void main(String[] args) {
        Director director = new Director();
        Product productA = director.getProductA();
        System.out.println(productA);
        Product productB = director.getProductB();
        System.out.println(productB);
    }
}
