package Sim_Package.Aircraft;

import Sim_Package.Coordinates;
import Sim_Package.Weather.WeatherTower;

public class Helicopter extends Aircraft implements Flyable {

    private WeatherTower weatherTower;

    Helicopter(String name, Coordinates coordinates) {

        super(name, coordinates);
    }

    public void updateConditions() {

        int HeightCopy = this.coordinates.getHeight();
        int LongCopy = this.coordinates.getLongitude();
        int LatCopy = this.coordinates.getLatitude();
        String weather = this.weatherTower.getWeather(this.coordinates);

        switch (weather)
        {
            case "RAIN":
                this.coordinates = new Coordinates(LongCopy + 5, LatCopy, HeightCopy);
                writer.writetofile("Helicopter#" + this.name + "(" + this.id + "): Let it RAIN, let it wash away my PAIN");
                break;
            case "SNOW":
                this.coordinates = new Coordinates(LongCopy, LatCopy, HeightCopy - 12);
                writer.writetofile("Helicopter#" + this.name + "(" + this.id + "): Elsa : Let it go, Let it goooo");
                break;
            case "FOG":
                this.coordinates = new Coordinates(LongCopy + 1, LatCopy, HeightCopy);
                writer.writetofile("Helicopter#" + this.name + "(" + this.id + "): What the FOG is going on?");
                break;
            case "SUN":
                this.coordinates = new Coordinates(LongCopy + 10, LatCopy, HeightCopy + 2);
                writer.writetofile("Helicopter#" + this.name + "(" + this.id + "): AAAAAAAA it blinds, it melts my ICE");
                break;

            default:
                writer.writetofile("unknown weather: ");
                break;
        }
        if(this.coordinates.getHeight() < 0)
        {
            unregisterTower(this.weatherTower);
        }

    }

    public void registerTower(WeatherTower weatherTower) {
        writer.writetofile("Tower :" + "Helicopter#" + this.name + "(" + this.id + ") Registered");
        this.weatherTower = weatherTower;
        weatherTower.register(this);
    }

    public void unregisterTower(WeatherTower weatherTower) {
        writer.writetofile("Tower :" + "Helicopter#" + this.name + "(" + this.id + ") Unegistered");
        this.weatherTower = weatherTower;
        weatherTower.unregister(this);
    }
}
