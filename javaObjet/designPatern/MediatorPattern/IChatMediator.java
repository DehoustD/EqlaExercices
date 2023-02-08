/**
 * TchatMediator interface.
 */
public interface IChatMediator {

    public void SendMessage(String _message, User _user);

    public void AddUser(User _user);

}