package singleton;

/**
 * @author bifenglin
 * @date 2018/2/8 16:25
 */
public class Singleton {
    private static Singleton uniqueInstance;
    private Singleton(){};
    public static Singleton getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
