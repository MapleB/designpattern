package observer.original.model.base;

/**
 * @author bifenglin
 * @date 2018/2/2 17:13
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
