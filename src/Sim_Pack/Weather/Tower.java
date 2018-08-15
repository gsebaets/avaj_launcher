package Sim_Pack.Weather;

import Sim_Pack.Aircraft.Flyable;

import java.util.ArrayList;
import java.util.List;

//changing weather and registration

public class Tower {

    private List<Flyable> observers = new ArrayList<Flyable>();
    private List<Flyable> unregistered = new ArrayList<Flyable>();

    public void register(Flyable flyable) //to observer
    {
        if (observers.contains(flyable)) {
            return ;
        }
        observers.add(flyable);
    }

    public void unregister(Flyable flyable) //to unregister
    {
        if (unregistered.contains(flyable))
        {
            return ;
        }
        unregistered.add(flyable);
    }

    protected void conditionsChanged() //manupilate weather for all aircrafts
    {
        for (Flyable flyable : observers) {
           flyable.updateConditions();
        }

        observers.removeAll(unregistered); //remove from observers
    }
}
