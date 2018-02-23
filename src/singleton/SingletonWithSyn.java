package singleton;

/**
 * @author bifenglin
 * @date 2018/2/8 16:28
 */
public class SingletonWithSyn {
    private static SingletonWithSyn uniqueInstance;
    private SingletonWithSyn(){};
    public static synchronized SingletonWithSyn getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new SingletonWithSyn();
        }
        return uniqueInstance;
    }
}
