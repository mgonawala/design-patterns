package Structural.Flyweight;

//Acts as a factory and cache for Item flyweight objects.

import java.util.HashMap;
import java.util.Map;

public class Catalog {

    private Map<String, Item> items = new HashMap<>();

    public Item lookup(String name){
        if ( !items.containsKey(name)){
            items.put(name, new Item(name));
        }
        return items.get(name);
    }

    public int totalItems(){
        return items.size();
    }
}
