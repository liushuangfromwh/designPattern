package com.ls;

/**
 * @author liushuang 2017/9/28
 */
public class AndroidClient implements Client {

    private static String name = "Android";
    private WeatherInfo info;

    @Override
    public void getWeather(WeatherInfo info) {
        this.info = info;
        dealMsg();
    }

    private void dealMsg() {
        System.out.println(name +"---"+info.getWeather());
    }
}
