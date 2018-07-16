package Sim_Package.Aircraft;

import Sim_Package.Coordinates;
import Sim_Package.Weather.WeatherTower;

public class Ballon extends Aircraft implements Flyable {

    Ballon(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    public void updateCondtions() {

    }

    public void registerTower(WeatherTower weatherTower) {

    }
}
