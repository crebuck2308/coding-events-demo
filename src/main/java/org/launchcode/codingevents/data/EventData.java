package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EventData {

    //need a place to put events
    private static final Map<Integer, Event> events = new HashMap<>();
    //made final once initiated it cannot change - data inside can though


    //static means only one
    //have declared to by of type Map of Integer-Event pairs
    //Will be a hashmap - map object will store integer (id) event (event object) pairs

    //all static because don't want to create instances of event data**

    //Behaviors:
    //get all events
    public static Collection<Event> getAll(){
        return events.values();
        //going to return a collection (list) of events
        //do not need keys but want the "values"
        //collections implements Iterable allows us to loop over this Collection
        //want to return something we can work with (collection)
    }

    //add event to our collection
    public static void add(Event event) {
        events.put(event.getId(), event);
        //putting an event into our Map - key = id of event obj and value = event object itself
    }

    //get a single event
    public static Event getById(Integer id){
        return events.get(id);
    }

    //remove an event
    public static void remove(Integer id){
        if(events.containsKey(id)) {
            events.remove(id);
        }
    }

}
