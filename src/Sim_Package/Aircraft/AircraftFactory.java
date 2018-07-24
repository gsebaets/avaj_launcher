package Sim_Package.Aircraft;

import Sim_Package.Coordinates;
import Sim_Package.Weather.WeatherTower;

public class AircraftFactory {

    public static Flyable newAircraft(String type, String name, int longitude, int latitude, int height)
    {
        if(latitude >= 0 && longitude >= 0 && height >= 1)
        {
            Coordinates coordinates = new Coordinates(longitude, latitude, height);

            String Name = type.toLowerCase();
            if (Name.equals("helicopter"))
            {
                return new Helicopter(name, coordinates);
            }
            else if(Name.equals("jetplane"))
            {
                return new JetPlane(name, coordinates);
            }
            else if(Name.equals("baloon"))
            {
                return new Baloon(name, coordinates);
            }
            else
                System.out.println("Not a legit flyable.");
                System.exit(1);
                return null;
        }
        System.out.println("Number should be POSITIVE(+)");
        System.exit(1);
        return null;
    }
}
