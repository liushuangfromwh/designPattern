package com.ls.demo2;

import com.ls.demo1.Product;

/**
 * @author liushuang 2017/9/28
 */
public abstract class Builder {

    public abstract Product getProduct();

    public abstract void setProduct(String name,String price);
}
