package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

public class GuessHandler implements ActionListener {
    private GameWindow window;
    private JTextField guessField;

    public GuessHandler(GameWindow window, JTextField guessField) {
        this.window = window;
        this.guessField = guessField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        window.processGuess(guessField.getText());
        guessField.setText("");
    }
}