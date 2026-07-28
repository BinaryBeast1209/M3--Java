public class WordMatch {

    private String secret;

    public WordMatch(String word) {
        secret = word;
    }

    public int scoreGuess(String guess) {
        int count = 0;

        for (int i = 0; i <= secret.length() - guess.length(); i++) {
            if (secret.substring(i, i + guess.length()).equals(guess)) {
                count++;
            }
        }

        return count * guess.length() * guess.length();
    }

    public String findBetterGuess(String guess1, String guess2) {

        int score1 = scoreGuess(guess1);
        int score2 = scoreGuess(guess2);

        if (score1 > score2) {
            return guess1;
        }
        else if (score2 > score1) {
            return guess2;
        }
        else {
            if (guess1.compareTo(guess2) > 0) {
                return guess1;
            }
            else {
                return guess2;
            }
        }
    }

    public static void main(String[] args) {

        WordMatch game = new WordMatch("concatenation");

        System.out.println("Score of ten: " + game.scoreGuess("ten"));
        System.out.println("Score of nation: " + game.scoreGuess("nation"));
        System.out.println("Better Guess: " + game.findBetterGuess("ten", "nation"));

        System.out.println();

        System.out.println("Score of con: " + game.scoreGuess("con"));
        System.out.println("Score of cat: " + game.scoreGuess("cat"));
        System.out.println("Better Guess: " + game.findBetterGuess("con", "cat"));
    }
}
