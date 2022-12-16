public class Reptile extends Animal {

    private boolean isSerpent;
    
    public Reptile(String _name, String _sex, String _food, String _ecosystem, String _espece, int _age, int _sleepHours, boolean _exotic, boolean _sterelized, boolean _isSerpent){

        super(_name, _sex, _food, _ecosystem, _espece, _age, _sleepHours, _exotic, _sterelized);

        isSerpent = _isSerpent;

    }

    // getters
    
    public boolean GetIsSerpent(){
        return isSerpent;
    }

    public void SetIsSerpent(boolean _isSerpent){
        isSerpent = _isSerpent;
    }

    // methods

    public void TellIfSerpent(){

        if(isSerpent){
            System.out.println("Ce reptile est un serpent");
        } else {
            System.out.println("Ce reptile n'est pas un serpent");
        }

    }

    public void Sleep(){
        System.out.println("je dors en haut d'un arbre");
    }


}