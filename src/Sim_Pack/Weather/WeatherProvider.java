package Sim_Pack.Weather;

import Sim_Pack.Coordinates;

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
        Random random = new Random();

        int i = 0;
        i = random.nextInt(4);
        return (weather[i]);
    }
}