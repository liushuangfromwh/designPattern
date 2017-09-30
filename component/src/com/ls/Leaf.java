package com.ls;

/**
 * 叶子节点(没有子节点)
 *
 * @author liushuang 2017/9/30
 */
public class Leaf extends  Component{


    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public void display(int depth) {
        System.out.println(depth + name);
    }
}
