package Sim_Package.Aircraft;

import Sim_Package.Weather.WeatherTower;

public interface Flyable {
    public void updateCondtions();
    public void registerTower(WeatherTower weatherTower);
}