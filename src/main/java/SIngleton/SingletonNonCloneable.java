package SIngleton;

// How to protect singleton pattern breaking with cloneable
public class SingletonNonCloneable implements Cloneable{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw  new CloneNotSupportedException();
    }

    public static SingletonNonCloneable INSTANCE = new SingletonNonCloneable();

    private SingletonNonCloneable(){

    }

    public static SingletonNonCloneable getINSTANCE(){
        return INSTANCE;
    }
}
