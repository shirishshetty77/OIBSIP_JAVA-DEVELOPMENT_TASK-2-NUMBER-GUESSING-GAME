package game;

import java.util.Random;

public class GameLogic {
    private int numberToGuess;
    private int attemptsLeft;

    public GameLogic() {
        startNewRound();
    }

    public void startNewRound() {
        numberToGuess = new Random().nextInt(100) + 1;
        attemptsLeft = 10;
    }

    public int getAttemptsLeft() {
        return attemptsLeft;
    }

    public int getNumberToGuess() {
        return numberToGuess;
    }

    public String checkGuess(int guess) {
        attemptsLeft--;
        if (guess == numberToGuess) {
            return "correct";
        } else if (guess < numberToGuess) {
            return "low";
        } else {
            return "high";
        }
    }

    public boolean isOutOfAttempts() {
        return attemptsLeft <= 0;
    }
}