package game;

public class ScoreBoard {
    private int score;

    public ScoreBoard() {
        score = 0;
    }

    public int getScore() {
        return score;
    }

    public void addPoints(int attemptsLeft) {
        score += 10 * attemptsLeft;
    }
}