package com.ls;

/**
 * 主题
 *
 * @author liushuang 2017/9/28
 */
public interface IWeatherService {
    /**
     * 添加观察者
     */
    void addClient(Client client);

    /**
     * 删除观察者
     */
    void deleteClient(Client client);

    /**
     * 通知
     */
    void notifyClients();

    /**
     * 主题更新
     */
    void update(WeatherInfo info);
}
