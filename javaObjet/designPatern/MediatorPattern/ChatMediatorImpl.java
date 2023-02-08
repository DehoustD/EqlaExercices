import java.util.List;
import java.util.ArrayList;

public class ChatMediatorImpl implements IChatMediator{

    private List<User> users;
    
    public ChatMediatorImpl() {
        
        users = new ArrayList<User>();

    }

    @Override
    public void SendMessage(String _message, User _user) {
        
        for (User _u : users) {

            if (_u != _user) {

                _u.Receive(_message);
                
            }

        }
        
    }

    @Override
    public void AddUser(User _user) {
        
        users.add(_user);
        
    }

}