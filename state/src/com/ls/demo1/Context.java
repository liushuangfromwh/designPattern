package com.ls.demo1;

/**
 * @author liushuang 2017/9/30
 */
public class Context {

    private State state;

    public Context() {

    }

    public Context(State state) {
        this.state = state;
    }

    public void request() {
        state.handle();
    }
}
