package Sim_Package.Aircraft;

import Sim_Package.Coordinates;
import Sim_Package.WriteToFile;

public class Aircraft {
    protected long id;
    protected String name;
    protected Coordinates coordinates;
    private static long idCounter;
    protected WriteToFile writer = new WriteToFile();

    protected Aircraft(String name, Coordinates coordinates)
    {
        this.id = nextId();
        this.coordinates = coordinates;
        this.name = name;
    }

    protected long nextId()
    {
        return(idCounter++);
    }
}