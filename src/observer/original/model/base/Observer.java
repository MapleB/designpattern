package observer.original.model.base;

/**
 * 观察者
 * @author bifenglin
 * @date 2018/2/2 17:14
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
