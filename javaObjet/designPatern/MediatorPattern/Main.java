public class Main {

    public static void main(String[] args) {

        IChatMediator chatMediator = new ChatMediatorImpl();

        User dav = new UserImpl(chatMediator, "David");
        User seb = new UserImpl(chatMediator, "Sebastien");
        User bru = new UserImpl(chatMediator, "Bruno");
        User sim = new UserImpl(chatMediator, "Simon");
        User phi = new UserImpl(chatMediator, "Philip");

        chatMediator.AddUser(seb);
        chatMediator.AddUser(dav);
        chatMediator.AddUser(bru);
        chatMediator.AddUser(sim);
        chatMediator.AddUser(phi);
        
        dav.Send("message");
    }

}
