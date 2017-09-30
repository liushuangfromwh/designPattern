package com.ls;

/**
 * @author liushuang 2017/9/30
 */
public class TargetTest {
    public static void main(String[] args) {
        Target target = new Target();
        target.request();

        Adapter adapter = new Adapter();
        adapter.request();
    }
}
