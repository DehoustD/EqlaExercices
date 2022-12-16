public class Main {

    public static void main(String[] args) {

        Animal cat = new Animal("Cat", "f", "viande", "terrestre", "chat", 6, 20, false, true);
        Animal cat2 = new Animal("Cat", "f", "viande", "terrestre", "chat", 6, 20, false, true);
        Animal doggo = new Animal("Doggo", "m", "viande", "terrestre", "chien", 3, 10, false, true);

        Reptile dangerNoodle = new Reptile("Danger Noodle", "f", "viande", "terrestre", "boa", 4, 6, true, false, true);

        Oiseau cuicui = new Oiseau("Cuicui", "f", "graine", "ciel", "canari", 2, 12, false, false, 1, false);

        Fish bubule = new Fish("Bubule", "f", "plante", "eau", "poisson rouge", 1, 2, false, false, 7, "eau douce");

        Student sebastien = new Student("Sebastien", 40, 1.85f, 85.0f, cat2, 1, 15.0f, "java");
        Student bruno = new Student("Bruno", 43, 1.75f, 80.0f, null, 2, 13.0f, "bdd");
        Student simon = new Student("Simon", 25, 1.65f, 70.0f, cat, 3, 10.0f, "bdd");
        Student david = new Student("David", 34, 1.82f, 100.0f, cat, 4, 8.0f, "java");

        Student[] tempStudentArray = { sebastien, bruno, simon, david };

        Teacher johnnyT = new Teacher("Johnny", 45, 1.82f, 80.0f, doggo, "DB", 50, tempStudentArray);

        johnnyT.StudentWhoSucceedPercent();

        System.out.println("");

        cuicui.TempsDeVolOiseau(2);
        cuicui.Sleep();
        cuicui.Sleep(false);

        System.out.println("");

        bubule.Sleep(5);
        bubule.Sleep();

        System.out.println("");

        dangerNoodle.TellIfSerpent();
        dangerNoodle.Sleep(false);
        dangerNoodle.Sleep(true);
        dangerNoodle.Sleep();

        Animal mutant;

        mutant = new Reptile("Gesus", "m", "omni", "terrestre", "gecko", 2022, 10, true, false, false);

        mutant.Sleep();

        mutant = new Oiseau("lol", "f", "omni", "ciel", "condor", 5, 7, true, false, 5, false);
        
        mutant.Sleep();

    }

}