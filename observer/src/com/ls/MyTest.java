package com.ls;

/**
 * @author liushuang 2017/9/28
 */
public class MyTest {
    public static void main(String[] args) {
        WeatherServiceImpl service = WeatherServiceImpl.getInstance();

        service.addClient(new AndroidClient());
        service.addClient(new IOSClient());
        service.update(new WeatherInfo("大雨"));
        service.update(new WeatherInfo("小雨"));
    }
}
