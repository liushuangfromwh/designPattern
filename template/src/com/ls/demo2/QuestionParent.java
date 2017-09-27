package com.ls.demo2;

/**
 * @author liushuang 2017/9/27
 */
public class QuestionParent {

    protected String answer;

    public void question1() {
        System.out.println("试题1");
        System.out.println("答案 "+answer1());
    }

    public void question2() {
        System.out.println("试题2");
        System.out.println("答案 "+answer2());
    }

    public String answer1() {
        return "";
    }

    public String answer2() {
        return "";
    }
}
