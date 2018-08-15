package Sim_Pack.Weather;

import Sim_Pack.Coordinates;

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