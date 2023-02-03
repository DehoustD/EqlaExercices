public class Subscriber implements IObserver {

    // Properties.

    private String name;
    private ISubject topic;

    // Constructor.

    public Subscriber(String _name){

        name = _name;

    }

    // Override.

    @Override
    public void SetSubject(ISubject _sub) {

        topic = _sub;

    }

    @Override
    public void Update() {

        String _message = (String)topic.GetUpdate(this);

        if (_message == null) {

            System.out.println(name + " : pas de nouveau message.");
            
        } else {

            System.out.println(name + " : le dernier message est : " + _message);
        
        }

    }

}