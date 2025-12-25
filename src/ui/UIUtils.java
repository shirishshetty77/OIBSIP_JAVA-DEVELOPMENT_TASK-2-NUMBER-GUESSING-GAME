package ui;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class UIUtils {
    // Palette
    public static final Color BG = Color.decode("#0F1115");
    public static final Color TEXT = Color.decode("#E6EAF2");
    public static final Color TEXT_MUTED = Color.decode("#A8B0C0");
    public static final Color ACCENT = Color.decode("#3AC0FF");
    public static final Color ERROR = Color.decode("#FF5C70");

    // Fonts
    public static Font titleFont() { return new Font("Segoe UI", Font.BOLD, 32); }
    public static Font bodyFont() { return new Font("Segoe UI", Font.PLAIN, 20); }

    public static void styleTextField(JTextField field, String placeholder) {
        field.setFont(bodyFont());
        field.setForeground(TEXT);
        field.setCaretColor(TEXT);
        field.setBackground(Color.decode("#151922"));
        field.setHorizontalAlignment(JTextField.CENTER);
        field.setBorder(new CompoundBorder(
                new LineBorder(ACCENT, 1, true),
                new EmptyBorder(10, 12, 10, 12)
        ));
    }

    public static JButton primaryButton(String text) {
        JButton btn = new JButton(text);
        btn.setFont(bodyFont());
        btn.setBackground(ACCENT);
        btn.setForeground(BG);
        btn.setFocusPainted(false);
        btn.setBorder(new EmptyBorder(10, 20, 10, 20));
        return btn;
    }

    public static JButton secondaryButton(String text) {
        JButton btn = new JButton(text);
        btn.setFont(bodyFont());
        btn.setBackground(BG);
        btn.setForeground(TEXT);
        btn.setFocusPainted(false);
        btn.setBorder(new EmptyBorder(10, 20, 10, 20));
        return btn;
    }
}