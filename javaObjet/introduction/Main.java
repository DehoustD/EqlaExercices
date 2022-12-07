public class Main {

public static void main(String[] args) {
    Person johnny = new Person("Johnny", 45, 1.82f, 80.0f);
    Person sebastien = new Person("Sebastien", 40, 1.85f, 85.0f);
    Person bruno = new Person("Bruno", 43, 1.75f, 80.0f);
    Person simon = new Person("Simon", 25, 1.65f, 70.0f);
    Person david = new Person("David", 34, 1.82f, 100.0f);

    Animal cat = new Animal("Cat", "f", "viande", "terrestre", "chat", 6, 20, false, true);

    System.out.println(johnny.GetImc());
    johnny.SetHeight(1.95f);
    System.out.println(johnny.GetImc());
    
    System.out.println(sebastien.GetImc());
    System.out.println(bruno.GetImc());
    System.out.println(simon.GetImc());
    System.out.println(david.GetImc());

    cat.Sleep();
    cat.Eat();

    System.out.println(johnny.GetAge());
}

}