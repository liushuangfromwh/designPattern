package com.ls;

import java.util.LinkedList;

/**
 * 具体的主题
 *
 * @author liushuang 2017/9/28
 */
public class WeatherServiceImpl implements IWeatherService {

    private LinkedList<Client> clientsList = new LinkedList<>();
    private LinkedList<WeatherInfo> weatherInfoList = new LinkedList<>();
    private static WeatherServiceImpl service = new WeatherServiceImpl();

    private WeatherServiceImpl() {
    }

    public static WeatherServiceImpl getInstance() {
        return service;
    }

    @Override
    public void addClient(Client client) {
        clientsList.add(client);
    }

    @Override
    public void deleteClient(Client client) {
        clientsList.remove(client);
    }

    @Override
    public void notifyClients() {
        for (Client client : clientsList) {
            client.getWeather(weatherInfoList.peekFirst());
        }
    }

    @Override
    public void update(WeatherInfo info) {
        if (!weatherInfoList.isEmpty()) {
            if (weatherInfoList.peekFirst().equals(info)) {
                return;
            }
        }
        weatherInfoList.push(info);
        if (clientsList.isEmpty()) {
            return;
        }
        notifyClients();
    }
}
