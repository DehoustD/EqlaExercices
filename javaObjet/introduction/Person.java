public class Person {

    // Propriétés

    public String name;
    public int age;
    public float height;

    // Méthodes > Constructeur

    public Person(String _name, int _age, float _height) {

        name = _name;
        age = _age;
        height = _height;

    }

    public static void main(String[] args) {

        Person johnny = new Person("Johnny", 45, 1.82f);
        Person sebastien = new Person("Sebastien", 40, 1.85f);
        Person bruno = new Person("Bruno", 43, 1.75f);

        System.out.println("Nom : " + johnny.name + ", age : " + johnny.age + ", taille : " + johnny.height);
        System.out.println("Nom : " + sebastien.name + ", age : " + sebastien.age + ", taille : " + sebastien.height);
        System.out.println("Nom : " + bruno.name + ", age : " + bruno.age + ", taille : " + bruno.height);

    }

}