package Sim_Package.Aircraft;

import Sim_Package.Coordinates;
import Sim_Package.Weather.*;

public class JetPlane extends Aircraft implements Flyable {

    private WeatherTower weatherTower;

    JetPlane(String name, Coordinates coordinates) {

        super(name, coordinates);
    }

    public void updateConditions() {

        int HeightCopy = this.coordinates.getHeight();
        int LongCopy = this.coordinates.getLongitude();
        int LatiCop = this.coordinates.getLatitude();
        String weather = this.weatherTower.getWeather(this.coordinates);

        switch (weather)
        {
            case "RAIN":
                this.coordinates = new Coordinates(LongCopy, LatiCop, HeightCopy - 5);
                writer.writetofile("JetPlane#" + this.name + "(" + this.id + "): Let it RAIN, let it wash away my PAIN");
                break;
            case "SNOW":
                this.coordinates = new Coordinates(LongCopy, LatiCop, HeightCopy - 15);
                writer.writetofile("JetPlane#" + this.name + "(" + this.id + "): Elsa : Let it go, Let it goooo");
                break;
            case "FOG":
                this.coordinates = new Coordinates(LongCopy, LatiCop, HeightCopy - 3);
                writer.writetofile("JetPlane#" + this.name + "(" + this.id + "): What the FOG is going on?");
                break;
            case "SUN":
                this.coordinates = new Coordinates(LongCopy + 2, LatiCop, HeightCopy + 4);
                writer.writetofile("JetPlane#" + this.name + "(" + this.id + "): AAAAAAAA it blinds, it melts my ICE");
                break;
            default:
                writer.writetofile("unknown weather: ");
                break;
        }
        if(this.coordinates.getHeight() <= 0)
        {
            unregisterTower(this.weatherTower);
        }

    }
    public void registerTower (WeatherTower weatherTower)
    {
        writer.writetofile("Tower :" + "JetPlane#" + this.name + "(" + this.id + ") Registered");
        this.weatherTower = weatherTower;
        weatherTower.register(this);

    }

    public void unregisterTower (WeatherTower weatherTower)
    {
        writer.writetofile("Tower :" + "JetPlane#" + this.name + "(" + this.id + ") Unregistered");
        this.weatherTower = weatherTower;
        weatherTower.unregister(this);
    }
}
