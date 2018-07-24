package Sim_Package.Weather;

import Sim_Package.Coordinates;

public class WeatherTower extends Tower {
    public String getWeather(Coordinates coordinates){

        String weather = WeatherProvider.getProvider().getCurrentWeather(coordinates);
        return weather;
    }

    public void changeWeather()
    {
        this.conditionsChanged();
    }
}