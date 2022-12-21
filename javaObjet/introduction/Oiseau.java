public class Oiseau extends Animal {

    private int tempsDeVol;

    private boolean migration;

    public Oiseau(String _name, String _sex, String _food, String _ecosystem, String _espece, int _age, int _sleepHours,
            boolean _exotic, boolean _sterelized, int _tempsDeVol, boolean _migration) {

        super(_name, _sex, _food, _ecosystem, _espece, _age, _sleepHours, _exotic, _sterelized);

        tempsDeVol = _tempsDeVol;

        migration = _migration;
    }

    // Getters

    public int GetTempsDeVol() {

        return tempsDeVol;

    }

    public boolean GetMigration() {

        return migration;

    }

    // Setters

    public void SetTempsDeVol(int _tempsDeVol) {

        tempsDeVol = _tempsDeVol;

    }

    public void SetMigration(boolean _migration) {

        migration = _migration;

    }

    // methode

    public int TempsDeVolOiseau(int _tempsDeVol) {

        return _tempsDeVol;
    }

    public void Sleep(){
        System.out.println("je ne dors pas en volant !");
        super.Sleep();
    }

    public void Sleep(boolean _nocturnal) {
        super.Sleep(_nocturnal);
        if (_nocturnal) {
            System.out.println("Je suis surement un hiboux.");
        } else {
            System.out.println("Je ne suis surement pas un hiboux.");
        }
    }

}