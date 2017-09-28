package com.ls;

/**
 * 主题实体类
 *
 * @author liushuang 2017/9/28
 */
public class WeatherInfo {

    private String weather;

    public WeatherInfo(String weather) {
        this.weather = weather;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }
}
