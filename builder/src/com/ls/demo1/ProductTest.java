package com.ls.demo1;

/**
 * @author liushuang 2017/9/28
 */
public class ProductTest {
    public static void main(String[] args) {
        //创建一个产品,每次都需要set,如果属性过多,可能会遗漏.
        Product product = new Product();
        product.setName("电脑");
        product.setPrice("6000");
        System.out.println(product);
    }
}
