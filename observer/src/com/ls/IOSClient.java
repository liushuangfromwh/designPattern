package com.ls;

/**
 * @author liushuang 2017/9/28
 */
public class IOSClient implements Client {
    private static String name = "IOS";
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
