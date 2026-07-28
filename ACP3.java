import java.util.Random;

public class Game {

    private int score;
    private Random random = new Random();

    // Simulates playing the game
    public void play() {
        score = random.nextInt(101); // Random score between 0 and 100
    }

    // Returns the score of the last game played
    public int getScore() {
        return score;
    }

    /**
     * Simulates the play of num games and returns the highest score earned.
     * Precondition: num > 0
     */
    public int playManyTimes(int num) {
        play();
        int highestScore = getScore();

        for (int i = 1; i < num; i++) {
            play();
            int currentScore = getScore();

            if (currentScore > highestScore) {
                highestScore = currentScore;
            }
        }

        return highestScore;
    }

    public static void main(String[] args) {
        Game game = new Game();

        int highest = game.playManyTimes(5);

        System.out.println("Highest Score: " + highest);
    }
}
