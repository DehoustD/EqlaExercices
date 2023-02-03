public class Main {
    
    public static void main(String[] args) {
        
        MyTopic topic = new MyTopic();

        IObserver obs1 = new Subscriber("obs1");
        IObserver obs2 = new Subscriber("obs2");
        IObserver obs3 = new Subscriber("obs3");

        topic.Register(obs1);
        topic.Register(obs2);
        topic.Register(obs3);

        obs1.SetSubject(topic);
        obs2.SetSubject(topic);
        obs3.SetSubject(topic);

        obs1.Update();

        topic.PostMessage("lol");

    }

}