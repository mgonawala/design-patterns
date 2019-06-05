package Creational.Prototype;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * A registry that holds prototypes.
 *
 *
 * It creates a shallow copy of the object.
 * Meaning it just copies values & references as is in the new object.
 *
 * So for example, new object will refer to the same ArrayList object.
 *
 * For Deep copy, in the clone method, create a new instance & set values member wise
 */
public class Registry {

    Map<String, Movie> movies = new HashMap<>();

    public    Registry(){
        loadMap();
    }

    private void loadMap() {
        Movie movie = new Movie();
        movie.setName("Default");
        movie.setTime("Night");
        System.out.println(movie.hashCode());
        System.out.println(movie.getTime());
        System.out.println(movie.getName());
        movies.put("Movie",movie);
    }

    public  Movie createMovie(){
        try {
            return (Movie)movies.get("Movie").clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
