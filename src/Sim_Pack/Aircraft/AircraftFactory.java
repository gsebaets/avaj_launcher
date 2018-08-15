package Sim_Pack.Aircraft;

import Sim_Pack.Coordinates;

//Creating all flyables

public class AircraftFactory {

    public static Flyable newAircraft(String type, String name, int longitude, int latitude, int height)
    {
        if(latitude >= 0 && longitude >= 0 && height >= 1)
        {
            Coordinates coordinates = new Coordinates(longitude, latitude, height);

            String Name = type.toLowerCase();
            if (Name.equals("jetplane"))
            {
                return new JetPlane(name, coordinates);
            }
            else if(Name.equals("helicopter"))
            {
                return new Helicopter(name, coordinates);
            }
            else if(Name.equals("baloon"))
            {
                return new Baloon(name, coordinates);
            }
            else
                System.out.println("Not a legit flyable. The flyable is not in our system");
                System.exit(1);
                return null;
        }
        else {
            System.out.println("Number should be POSITIVE(+),  No NEGATIVES allowed");
            System.exit(1);
            return null;
        }
    }
}
