public class Main {

public static void main(String[] args) {

    Animal cat = new Animal("Cat", "f", "viande", "terrestre", "chat", 6, 20, false, true);
    Animal cat2 = new Animal("Cat", "f", "viande", "terrestre", "chat", 6, 20, false, true);
    Animal doggo = new Animal("Doggo", "m", "viande", "terrestre", "chien", 3, 10, false, true);
    
    Reptile dangerNoodle = new Reptile("Danger Noodle", "f", "viande", "terrestre", "boa", 4, 6, true, false, true);

    Person johnny = new Person("Johnny", 45, 1.82f, 80.0f, doggo);
    Person johnny2 = new Person("Johnny", 45, 1.82f, 80.0f, doggo);

    Student sebastien = new Student("Sebastien", 40, 1.85f, 85.0f, cat2, 1, 15.0f, "java");
    Student bruno = new Student("Bruno", 43, 1.75f, 80.0f, null, 2, 13.0f, "bdd");
    Student simon = new Student("Simon", 25, 1.65f, 70.0f, cat, 3, 10.0f, "bdd");
    Student david = new Student("David", 34, 1.82f, 100.0f, cat, 4, 8.0f, "java");

    Student[] tempStudentArray = {sebastien, bruno, simon, david};

    Teacher johnnyT = new Teacher("Johnny", 45, 1.82f, 80.0f, doggo, "DB", 50, tempStudentArray);

    johnnyT.StudentWhoSucceedPercent();
    dangerNoodle.TellIfSerpent();

/*
    System.out.println(johnny.GetImc());
    johnny.SetHeight(1.95f);
    System.out.println(johnny.GetImc());
    
    System.out.println(sebastien.GetImc());
    System.out.println(bruno.GetImc());
    System.out.println(simon.GetImc());
    System.out.println(david.GetImc());
 */

//System.out.println(johnny.GetAnimal().toString());
/*
    if (david.GetAnimal().equals(sebastien.GetAnimal())) {
        System.out.println("on a le même animal");
    } else {
        System.out.println("On a pas le même animal");
    }
*/
/*
if (johnny.equals(david)) {
    System.out.println("pareil");
} else {
    System.out.println("pas pareil");
}
*/
    //cat.Sleep();
    //cat.Eat();

    //System.out.println(johnny.GetAge());
}

}