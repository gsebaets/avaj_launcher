package Sim_Package.Aircraft;

import Sim_Package.Coordinates;
import Sim_Package.Weather.WeatherTower;

public class Helicopter extends Aircraft implements Flyable {

    public Helicopter(String name, Coordinates coordinates) {

        super(name, coordinates);
    }

    public void updateConditions() {

    }

    public void registerTower(WeatherTower weatherTower) {

    }

    public void unregisterTower(WeatherTower weatherTower) {

    }
}
