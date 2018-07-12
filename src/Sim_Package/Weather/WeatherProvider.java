package Sim_Package.Weather;

import Sim_Package.Coordinates;

import java.util.Random;

public class WeatherProvider
{
    private static WeatherProvider weatherProvider = null;
    private static String[] weather = {"RAIN", "FOG", "SUN", "SNOW"};

    private WeatherProvider() {

    }

    public static WeatherProvider getProvider()
    {
        if (weatherProvider == null)
            weatherProvider = new WeatherProvider();
        return (weatherProvider);
    }

    public String getCurrentWeather(Coordinates coordinates)
    {
        Random randWeather = new Random();

        int nWeather = 0;
        nWeather = randWeather.nextInt(4);
        return (weather[nWeather]);
    }
}