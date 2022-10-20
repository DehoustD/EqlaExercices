import java.util.Scanner;



class c5e8 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int nbr1 = 0;
        int nbr2 = 25;

        String Name = AskInformation("Bonjour, Entrez votre nom qui sera utilisé dans le jeu.");
        EnterGame(Name);
QuestionPlanete();
    }

    public static String AskInformation(String _question) {
        System.out.println(_question);
        return input.nextLine();

    }

    public static boolean EnterGame(String _name) {
        System.out.println("Bienvenu " + _name
                + "présentation du jeu \nVoulez-vous jouer ?\nEntrer [o] pour jouer, sinon appuyer sur n'importe quelle touche pour sortir du jeu");
        if (input.nextLine().equals("o")) {
            System.out.println("C'est parti.");
            return true;
        } else {
            System.out.println("Au revoir.");
            return false;
        }
    }

    public static int ChoiceRandom(int _nbr1, int _nbr2) {
        int random = (int) (Math.random() * (_nbr2 - _nbr1) + _nbr1);
        return random;
    }

    public static void QuestionPlanete() {
        int _erreur=0 ;
        int _numberOfQuestion=0 ;
        String [] _questions={            "Quel animal ne vole pas?\na. le manchot\nb. le pélican",
        "Quel animal construit des barages?\na. le castor\nb. le pingoin",
        "Quel animal n'est pas un insecte?\na. le moustique\nb? l'araignée","quel animal mange du poisson?\na. le babouin\nb. la mouette","Qui sont Tom et Jerry?\na. une autruche et un coyotte\nb. un chat et une souris",
        "Quel ingrédient n'intervient pas dans la recette d'une crêpe?\na. un oeuf\nb. de la sauce au poivre",
        "Quelle est la spécialité de l'allemagne?\na. la saucisse\nb. le boeuf bourguignon",
        "Quel fruit a été transpercé d'une flèche?\na. une poire\nb. une pomme",
        "Quel prénom féminin est le même que celui d'une pâtisserie?\na. Adèle\nb. Charlotte",
        "Dans la Grèce antique, qui est le roi des dieux?\na. Apolon\nb. Zeus",
        "Quel est le nom d'Héraclès chez les romains?\na. Orion\nb. Hercule",
        "Comment est mort héraclès?\na. brûlé par une tunique trempée dans du poison\nb. écrasé par les restes d'un temple à Era",
        "Qui a créé le labyrinthe?\na. hadès\nb. Dédale",
        "Qui est le protagoniste de Kingdom hearts?\na. Sora\nb. Tidus",
        "Quelle société a produit Assassin's creed?\na. Squaresoft\nb. Ubisoft",
        "Quel jeu vidéo a pour antagoniste un homme avec un long sabre et un complexe eudypien?\na. As dusk falls\nb. Final fantasy 7",
        "Quel jeu n'est pas accessible aux aveugles?\na. Kingdom hearts\nb. the last of us",
        "Dans les films marvel, qui a tué Tanos?\na. Captain Marvel\nb. Thor",
        "Dans l'adaptation audio de the sandman, quel infini est l'infini renégat disparu?\na. Délire\nb. Destruction",
        "Quis sont les 2 personnages qui sont doublé par le même acteur français?\na. Rocket et Loki?\nb. Nick Fury et Ironman?",
        "Quel personnage est joué par Jack Nicolson en 1989?\na. double-face\nb. le joker",
        "Quel est l'antagoniste récurent de Superman?\na. Hugo Strange\nb. Lex Luthor"};
        
        String[] _answers = { "le manchot", "le castor", "l'araignée", "la mouette", "un chat et une souris",
        "un la sauce au poivre", "la saucisse", "une pomme", "charlotte", "Zeus", "Hercule",
        "brûlé par une tunique trempée dans du poison", "Dédale", "Zora", "Ubisoft", "Final Fantasy 7",
        "Kingdom Hearts", "Thor", "destruction", "Rocket et Loki", "le joker",
        "lex Luthor" };
        
        do {
            
            int random=ChoiceRandom(0, _questions.length);
            System.out.println(_questions[random]);

String _answerChoice=input.nextLine();
_numberOfQuestion++ ;
if(!_answerChoice.toLowerCase().equals(_answers[random].toLowerCase()))
    {
        System.out.println("Erreur");
        _erreur++;

    }else
    {
        System.out.println("Bonne réponse.");
    }
}while(_numberOfQuestion<=5);
}
public void Planete () {
    int _erreur=0 ;
    int _numberOfQuestion=0 ;
        
}
    

}