package Sim_Package.Aircraft;

import Sim_Package.Weather.WeatherTower;

public interface Flyable {
    public void updateConditions();
    public void registerTower(WeatherTower weatherTower);
    public void unregisterTower(WeatherTower weatherTower);
}