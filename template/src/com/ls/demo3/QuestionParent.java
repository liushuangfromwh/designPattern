package com.ls.demo3;

/**
 * @author liushuang 2017/9/27
 */
public abstract class QuestionParent {

    public void answer() {
        question1();
        question2();
    }

    public abstract void question1();
    public abstract void question2();
}
