import Creational.SIngleton.SingletonEnum;
import Creational.SIngleton.SingletonPattern;
import Creational.SIngleton.SingletonSerialization;

import java.io.*;

public class Application {

    public static void main(String[] args) {

        SingletonPattern singletonPattern = SingletonPattern.INSTANCE;
        System.out.println(singletonPattern.hashCode());

        SingletonPattern another = SingletonPattern.INSTANCE;
        System.out.println(another.hashCode());


        // Singleton with serialization
        SingletonSerialization singletonSerialization = SingletonSerialization.INSTANCE;
        singletonSerialization.setValue(2);
        SingletonSerialization deserialized = null;

        // Serialization
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("out.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(singletonSerialization);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Deserialization
        try {
            FileInputStream fileInputStream = new FileInputStream("out.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
             deserialized = (SingletonSerialization) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(singletonSerialization.hashCode());
        System.out.println(deserialized.hashCode());


        //Implementation with Enum
        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;

        singletonEnum.setValue(2);

        SingletonEnum enumOther = SingletonEnum.INSTANCE;

        System.out.println(singletonEnum.getValue());
        System.out.println(enumOther.getValue());

    }
}
