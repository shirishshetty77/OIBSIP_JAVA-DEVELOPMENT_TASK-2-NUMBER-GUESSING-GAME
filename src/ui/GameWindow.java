package ui;

import game.GameLogic;
import game.RoundManager;
import game.ScoreBoard;
import java.awt.*;
import javax.swing.*;

public class GameWindow extends JFrame {

    private GameLogic logic = new GameLogic();
    private RoundManager roundManager = new RoundManager();
    private ScoreBoard scoreBoard = new ScoreBoard();

    private JTextField guessField;
    private JLabel messageLabel, scoreLabel, roundLabel, attemptsLabel;

    public GameWindow() {

        setTitle("Number Guessing Game");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel root = new JPanel(new BorderLayout());
        root.setBackground(Color.BLACK);

        /* ---------------- TOP (TITLE) ---------------- */
        JPanel top = gradientPanel(new GridLayout(2, 1));
        top.setPreferredSize(new Dimension(0, 160));

        JLabel title = label("Number Guessing Game", 44);
        JLabel subtitle = label("Enter a number from 1 to 100", 24);

        top.add(title);
        top.add(subtitle);
        root.add(top, BorderLayout.NORTH);

        /* ---------------- LEFT (ROUNDS) ---------------- */
        JPanel left = gradientPanel(new GridLayout(2, 1));
        left.setPreferredSize(new Dimension(350, 320));

        left.add(label("Rounds", 26));
        roundLabel = label("1", 64);
        left.add(roundLabel);

        root.add(left, BorderLayout.WEST);

        /* ---------------- RIGHT (SCORE) ---------------- */
        JPanel right = gradientPanel(new GridLayout(2, 1));
        right.setPreferredSize(new Dimension(350, 320));

        right.add(label("Score", 26));
        scoreLabel = label("0", 64);
        right.add(scoreLabel);

        root.add(right, BorderLayout.EAST);

        /* ---------------- CENTER (MAIN GAME) ---------------- */
        JPanel center = gradientPanel(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.insets = new Insets(18, 18, 18, 18);
        gbc.anchor = GridBagConstraints.CENTER;

        guessField = new JTextField(18);
        guessField.setFont(new Font("Segoe UI", Font.BOLD, 34));
        guessField.setHorizontalAlignment(JTextField.CENTER);
        guessField.setPreferredSize(new Dimension(520, 85));
        guessField.setBackground(new Color(20, 20, 20));
        guessField.setForeground(Color.WHITE);
        guessField.setCaretColor(Color.WHITE);
        guessField.setBorder(BorderFactory.createLineBorder(new Color(0, 153, 255), 3));

        gbc.gridy = 0;
        center.add(guessField, gbc);

        JButton guessBtn = button("GUESS");
        gbc.gridy = 1;
        center.add(guessBtn, gbc);

        attemptsLabel = label("Attempts left: " + logic.getAttemptsLeft(), 26);
        gbc.gridy = 2;
        center.add(attemptsLabel, gbc);

        messageLabel = label(" ", 24);
        gbc.gridy = 3;
        center.add(messageLabel, gbc);

        root.add(center, BorderLayout.CENTER);

        /* ---------------- BOTTOM (EXIT) ---------------- */
        JPanel bottom = gradientPanel(new FlowLayout(FlowLayout.CENTER));
        bottom.setPreferredSize(new Dimension(0, 140));

        JButton exitBtn = button("EXIT GAME");
        exitBtn.addActionListener(e -> System.exit(0));
        bottom.add(exitBtn);

        root.add(bottom, BorderLayout.SOUTH);

        /* ---------------- ACTION ---------------- */
        guessBtn.addActionListener(e -> processGuess());

        setContentPane(root);
        setVisible(true);
    }

    /* ================= HELPERS ================= */

    private JPanel gradientPanel(LayoutManager layout) {
        return new JPanel(layout) {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g;
                g2.setPaint(new GradientPaint(
                        0, 0, new Color(0, 60, 120),
                        getWidth(), getHeight(), new Color(0, 25, 55)
                ));
                g2.fillRect(0, 0, getWidth(), getHeight());
            }
        };
    }

    private JLabel label(String text, int size) {
        JLabel l = new JLabel(text, SwingConstants.CENTER);
        l.setFont(new Font("Segoe UI", Font.BOLD, size));
        l.setForeground(Color.WHITE);
        return l;
    }

    private JButton button(String text) {
        JButton b = new JButton(text);
        b.setFont(new Font("Segoe UI", Font.BOLD, 26));
        b.setBackground(new Color(0, 153, 255));
        b.setForeground(Color.WHITE);
        b.setFocusPainted(false);
        b.setBorder(BorderFactory.createEmptyBorder(18, 50, 18, 50));

        b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent e) {
                b.setBackground(new Color(0, 180, 255));
            }
            public void mouseExited(java.awt.event.MouseEvent e) {
                b.setBackground(new Color(0, 153, 255));
            }
        });

        return b;
    }

    /* ================= GAME ================= */

    private void processGuess() {
        try {
            int guess = Integer.parseInt(guessField.getText());
            String result = logic.checkGuess(guess);

            attemptsLabel.setText("Attempts left: " + logic.getAttemptsLeft());

            if ("correct".equals(result)) {
                messageLabel.setText("Correct!");
                messageLabel.setForeground(Color.GREEN);
                scoreBoard.addPoints(logic.getAttemptsLeft());
                roundManager.nextRound();
                logic.startNewRound();
            } else if ("low".equals(result)) {
                messageLabel.setText("Too Low!");
                messageLabel.setForeground(Color.ORANGE);
            } else {
                messageLabel.setText("Too High!");
                messageLabel.setForeground(Color.ORANGE);
            }

            if (logic.isOutOfAttempts() && !"correct".equals(result)) {
                messageLabel.setText("Out of attempts! Number was " + logic.getNumberToGuess());
                messageLabel.setForeground(Color.RED);
                roundManager.nextRound();
                logic.startNewRound();
            }

            updateLabels();
            guessField.setText("");

        } catch (Exception e) {
            messageLabel.setText("Enter a valid number!");
            messageLabel.setForeground(Color.RED);
        }
    }

    private void updateLabels() {
        roundLabel.setText(String.valueOf(roundManager.getRound()));
        scoreLabel.setText(String.valueOf(scoreBoard.getScore()));
        attemptsLabel.setText("Attempts left: " + logic.getAttemptsLeft());
    }
}
