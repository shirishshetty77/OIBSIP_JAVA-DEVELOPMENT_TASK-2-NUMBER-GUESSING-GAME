package game;

public class RoundManager {
    private int round;

    public RoundManager() {
        round = 1;
    }

    public int getRound() {
        return round;
    }

    public void nextRound() {
        round++;
    }
}