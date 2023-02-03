/**
 * Observer interface.
 */
public interface IObserver {

    public void Update();

    public void SetSubject(ISubject _sub);
    
}