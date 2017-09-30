package com.ls;

/**
 * 发起者
 *
 * @author liushuang 2017/9/30
 */
public class Originator {

    private String state;

    public Memento getMemento() {
        return new Memento(this.state);
    }

    public void setMemento(Memento memento) {
        this.state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void show() {
        System.out.println(state);
    }
}
