package com.ls.demo1;

/**
 * @author liushuang 2017/9/27
 */
public class Question1 extends QuestionParent{
    @Override
    public void question1() {
        super.question1();
        System.out.println("答案 a");
    }

    @Override
    public void question2() {
        super.question2();
        System.out.println("答案 b");
    }
}
