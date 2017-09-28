package com.ls.demo3;

import com.ls.demo1.Product;
import com.ls.demo2.Builder;
import com.ls.demo2.ConcreteBuilder1;

/**
 * 指挥者,用它来控制建造的过程,以隔离用户与建造过程的关联.
 * 这个建造者跟工厂类有点像,多了一个指挥者.
 * @author liushuang 2017/9/28
 */
public class Director {

    private ConcreteBuilder1 concreteBuilder1 = new ConcreteBuilder1();

    public Product getProductA() {
        concreteBuilder1.setProduct("键盘","1500");
        return concreteBuilder1.getProduct();
    }

    public Product getProductB() {
        concreteBuilder1.setProduct("鼠标","130");
        return concreteBuilder1.getProduct();
    }
}
