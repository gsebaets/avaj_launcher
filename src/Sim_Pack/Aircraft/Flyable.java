package Sim_Pack.Aircraft;

import Sim_Pack.Weather.WeatherTower;

public interface Flyable {
    public void updateConditions();
    public void registerTower(WeatherTower weatherTower);
    public void unregisterTower(WeatherTower weatherTower);


}

//Interface
//Implimanted all by all flyables