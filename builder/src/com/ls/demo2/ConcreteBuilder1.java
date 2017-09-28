package com.ls.demo2;

import com.ls.demo1.Product;

/**
 * @author liushuang 2017/9/28
 */
public class ConcreteBuilder1 extends Builder {

    private Product product = new Product();

    @Override
    public Product getProduct() {
        return product;
    }

    @Override
    public void setProduct(String name, String price) {
        product.setName(name);
        product.setPrice(price);
    }
}
