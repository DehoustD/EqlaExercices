/**
 * Subject interface.
 */
public interface ISubject {

    public void Register(IObserver _obs);

    public void UnRegister(IObserver _obs);

    public void NotifyObservers();

    public Object GetUpdate(IObserver _obs);
    
}