package Creational.Prototype;

// This is the class we want to make prototype for.
// This class defines the prototype for the Movie
// It overrides clone method by implementing Cloneable interface.
// Cloneable.clone gives shallow copy of the object.
public class Movie implements Cloneable{

    private String name;

    private String time;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    // It returns shallow copy of the object

   /* @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }*/

    /**
     * This returns deep copy of the object.
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Movie movie = new Movie();
        movie.setTime(this.time);
        movie.setName(this.name);
        return movie;
    }
}
