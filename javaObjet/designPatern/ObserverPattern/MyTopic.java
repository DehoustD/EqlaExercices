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
     * Sert à faire en sorte qu'une ressource ne soit pas accedé par deux éléments
     * en même temps.
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

        synchronized (MUTEX) {

            if (!Observers.contains(_obs)) {

                Observers.add(_obs);

            }

        }

    }

    @Override
    public void UnRegister(IObserver _obs) {

        synchronized (MUTEX) {

            Observers.remove(_obs);

        }

    }

    @Override
    public void NotifyObservers() {

        List<IObserver> _obsLocal = null;

        synchronized (MUTEX) {

            if (!hasChanged) {

                return;
                
            }

            _obsLocal = new ArrayList<IObserver>(Observers);

            hasChanged = false;

        }

        for (IObserver _obs : _obsLocal) {

            _obs.Update();
            
        }

    }

    @Override
    public Object GetUpdate(IObserver _obs) {

        return message;
    
    }

    public void PostMessage(String _message){

        System.out.println("Le message posté dans ce topic est : \n" + _message);

        message = _message;
        hasChanged = true;

        NotifyObservers();

    }

}