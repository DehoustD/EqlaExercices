public class Fish extends Animal {
    // Proprietes

    private int finNumber;
    private String water;

    // Constructeur
    public Fish(String _name, String _sex, String _food, String _ecosystem, String _espece, int _age, int _sleepHours,
            boolean _exotic, boolean _sterelized, int _finNumber, String _water) {
        super(_name, _sex, _food, _ecosystem, _espece, _age, _sleepHours, _exotic, _sterelized);
        finNumber = _finNumber;
        water = _water;
    }

    // Getters
    public int GetFinNumber() {
        return finNumber;
    }

    public String water() {
        return water;
    }

    // Setters
    public void SetFinNumber(int _finNumber) {
        finNumber = _finNumber;
    }

    public void SetWater(String _water) {
        water = _water;
    }

    // Methodes

    public void DivingFish() {
        try {
            System.out.println("Le poisson plonge.");
            Thread.sleep(5000);
            System.out.println("Le poisson remonte.");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("erreur");
        }
    }

    public void Sleep(){
        super.Sleep();
        System.out.println(" Et le pichon y dort !");
    }

}
