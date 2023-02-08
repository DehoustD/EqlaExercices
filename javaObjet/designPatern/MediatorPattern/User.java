public abstract class User {
    
    // Properties.

    protected IChatMediator chatMediator;
    protected String name;

    // Constructor.

    public User(IChatMediator _chatMediator, String _name) {

        chatMediator = _chatMediator;
        name = _name;

    }

    // Methods.

    public abstract void Send(String _message);

    public abstract void Receive(String _message);

}