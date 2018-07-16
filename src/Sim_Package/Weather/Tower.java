package Sim_Package.Weather;

import Sim_Package.Aircraft.Flyable;

import java.util.ArrayList;
import java.util.List;

public class Tower {

    private List<Flyable> observers = new ArrayList<Flyable>();
    private List<Flyable> unregistered = new ArrayList<Flyable>();

    public void register(Flyable flyable)
    {
        if (observers.contains(flyable)) {
            return ;
        }
        observers.add(flyable);
    }

    public void unregister(Flyable flyable)
    {
        if (unregistered.contains(flyable))
        {
            return ;
        }
        unregistered.add(flyable);
    }

    protected void conditionsChanged()
    {

    }

}
