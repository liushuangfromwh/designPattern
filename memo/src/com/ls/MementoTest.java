package com.ls;

/**
 * 将保持细节封装在Memento中,
 *
 * @author liushuang 2017/9/30
 */
public class MementoTest {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("on");
        originator.show();
        //进行备份
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.getMemento());

        originator.setState("off");
        originator.show();
        //恢复.
        originator.setMemento(caretaker.getMemento());
        originator.show();
    }
}
