package com.ls;

/**
 * @author liushuang 2017/9/30
 */
public class CompositeTest {
    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new Leaf("a"));
        root.add(new Leaf("b"));

        Composite compositeX = new Composite("compositeX");
        compositeX.add(new Leaf("Xa"));
        compositeX.add(new Leaf("Xb"));
        root.add(compositeX);

        root.display(1);
    }
}
