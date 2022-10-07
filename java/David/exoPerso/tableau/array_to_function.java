public class array_to_function {

    public static void main(String[] args) {
        String[] monTableauDeString = { "machin", "truc", "bidule" };
        int[] monTableauDeScore = { 0, 5, 0 };

        System.out.println(monTableauDeScore[1]);
        monTableauDeScore[1] = AddScore(monTableauDeScore[1], 3);

        System.out.println(monTableauDeScore[1]);
        monTableauDeScore[1] = AddScore(monTableauDeScore[1], 3);
        
        System.out.println(monTableauDeScore[1]);

    }

    static int AddScore(int _baseScore, int _score) {
        return _baseScore + _score;
    }
}