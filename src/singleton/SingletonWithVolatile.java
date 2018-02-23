package singleton;

/**
 * @author bifenglin
 * @date 2018/2/8 16:30
 */
public class SingletonWithVolatile {
    private volatile static SingletonWithVolatile uniqueInstance;
    private SingletonWithVolatile(){};
    public static synchronized SingletonWithVolatile getInstance(){
        if (uniqueInstance == null){
            synchronized (SingletonWithVolatile.class){
                if (uniqueInstance == null){
                    uniqueInstance = new SingletonWithVolatile();
                }
            }
        }
        return uniqueInstance;
    }
}
