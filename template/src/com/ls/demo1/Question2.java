package com.ls.demo1;

/**
 * @author liushuang 2017/9/27
 */
public class Question2 extends QuestionParent {
    @Override
    public void question1() {
        super.question1();
        System.out.println("答案 c");
    }

    @Override
    public void question2() {
        super.question2();
        System.out.println("答案 d");
    }
}
