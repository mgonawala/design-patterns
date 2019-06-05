package SIngleton;

// Pitfalls : this implementation is lazy loading.
// This can be broken in multithreaded environment as access to getInstance method is not synchronized
// to make this thread safe, use Synchronized keyword on getInstance method.
public class SingletonLazy {

    private static SingletonLazy INSTANCE;

    private SingletonLazy(){

    }

   /* public static SingletonLazy getInstance(){
        if ( INSTANCE == null)
            INSTANCE = new SingletonLazy();
        return INSTANCE;
    }
*/
    public static SingletonLazy getInstance(){
         synchronized (SingletonLazy.class)
         {
             if ( INSTANCE == null)
                 INSTANCE = new SingletonLazy();
         }
        return INSTANCE;
    }

}
