public class UserImpl extends User{

    public UserImpl(IChatMediator _chatMediator, String _name) {

        super(_chatMediator, _name);

    }

    @Override
    public void Send(String _message) {
        
        System.out.println(name + " : envoie le message : " + _message);

        chatMediator.SendMessage(_message, this);
        
    }

    @Override
    public void Receive(String _message) {
        
        System.out.println(name + " : recois le message : " + _message);
        
    }
    
}