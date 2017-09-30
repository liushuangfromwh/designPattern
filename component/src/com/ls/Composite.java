package com.ls;

import java.util.LinkedList;
import java.util.List;

/**
 * @author liushuang 2017/9/30
 */
public class Composite extends Component {

    private List<Component> children = new LinkedList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void display(int depth) {
        System.out.println(depth + name);
        for (Component child : children) {
            child.display(depth + 1);
        }
    }
}
