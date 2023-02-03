import java.util.List;
import java.util.ArrayList;

/**
 * MyTopic.
 */

public class MyTopic implements ISubject {

    // Properties.

    private List<IObserver> Observers;
    private String message;
    private boolean hasChanged;
    /**
     * MUTEX signifie MUTual EXclusion.
     * Sert à faire en sorte qu'une ressource ne soit pas accedé par deux éléments en même temps.
     */
    private final Object MUTEX = new Object(); // Les constatntes s'écrivent toujours en CapsLock.

    // Constructor.

    public MyTopic() {

        Observers = new ArrayList<IObserver>();

    }

    // Override.

    @Override
    public void Register(IObserver _obs) {

        if (_obs == null) throw new NullPointerException("L'observeur est null.");
        
        synchronized(MUTEX){

            if (!Observers.contains(_obs)) {

                Observers.add(_obs);
                
            }

        }

    }

    @Override
    public void UnRegister(IObserver _obs) {
        // TODO Auto-generated method stub

    }

    @Override
    public void NotifyObservers() {
        // TODO Auto-generated method stub

    }

    @Override
    public Object GetUpdate(IObserver _obs) {
        // TODO Auto-generated method stub
        return null;
    }

}
