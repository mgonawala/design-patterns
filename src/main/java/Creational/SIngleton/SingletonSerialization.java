package Creational.SIngleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

// In order to return the same instance after deserialization need to implement readResolve method and
// return the same INSTANCE
public class SingletonSerialization implements Serializable {

    private int value;

    public void setValue(int i){
        this.value = i;
    }
    public static SingletonSerialization INSTANCE = new SingletonSerialization();

    private SingletonSerialization(){

    }

    protected Object readResolve() throws ObjectStreamException{
       return INSTANCE;
    }
}
