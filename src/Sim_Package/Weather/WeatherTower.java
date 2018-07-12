package Sim_Package.Weather;

import Sim_Package.Coordinates;

public class WeatherTower {
    public String getWeather(Coordinates coordinates){

        String weather = WeatherProvider.getProvider().getCurrentWeather(coordinates);
        return weather;
    }

    void changeWeather()
    {

    }
}