package Sim_Package.Aircraft;

import Sim_Package.Coordinates;
import Sim_Package.Weather.WeatherTower;

public class Helicopter extends Aircraft implements Flyable {

    Helicopter(String name, Coordinates coordinates) {

        super(name, coordinates);
    }

    public void updateConditions() {

        switch (weather)
        {
            case "RAIN":
                this.coordinates = new Coordinates();
                writer.writetofile("Helicopter#" + this.name + "(" + this.id + "): Let it RAIN, let it wash away my PAIN");
                break;
            case "SNOW":
                this.coordinates = new Coordinates();
                writer.writetofile("Helicopter#" + this.name + "(" + this.id + "): Elsa : Let it go, Let it goooo");
                break;
            case "FOG":
                this.coordinates = new Coordinates();
                writer.writetofile("Helicopter#" + this.name + "(" + this.id + "): What the FOG is going on?");
                break;
            case "SUN":
                this.coordinates = new Coordinates();
                writer.writetofile("Helicopter#" + this.name + "(" + this.id + "): AAAAAAAA it blinds, it melts my ICE");
                break;
        }

    }

    public void registerTower(WeatherTower weatherTower) {
        writer.writetofile("Tower :" + "Helicopter#" + this.name + "(" + this.id + ") Registered");

    }

    public void unregisterTower(WeatherTower weatherTower) {
        writer.writetofile("Tower :" + "Helicopter#" + this.name + "(" + this.id + ") Unegistered");

    }
}
