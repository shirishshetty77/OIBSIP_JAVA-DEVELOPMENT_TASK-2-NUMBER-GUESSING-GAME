# 🎮 Number Guessing Game – Java Swing

A **full-screen Java Swing Number Guessing Game** featuring a **dark theme with blue gradient panels**, a **clean, symmetric layout**, and a **well-structured object-oriented design**.
The project focuses on combining **game logic**, **round management**, and **score tracking** with a **modern Swing UI**.

This project is suitable for:

* College mini / academic projects
* Java Swing practice
* GitHub portfolio showcase

---

## 🚀 Features

* 🎨 **Dark UI with Blue Gradient Panels**
* 🖥️ **Full-screen immersive gameplay**
* 🎯 **Clear UI hierarchy**

  * Center: Main gameplay (input, guess, feedback)
  * Left: Round information
  * Right: Score tracking
* 🔢 Random number guessing between **1 and 100**
* 🔁 Automatic round progression
* ❌ Limited attempts per round
* 🧮 Score calculated based on remaining attempts
* ⌨️ **ESC key support to exit**
* 🧩 Clean separation of UI and logic

---

## 📁 Project Structure

```
NUMBER GUESSING GAME/
│
├── README.md
│
└── src/
    ├── game/
    │   ├── GameLogic.java
    │   │   - Generates random numbers
    │   │   - Validates guesses
    │   │   - Tracks attempts
    │
    │   ├── RoundManager.java
    │   │   - Manages round count
    │   │   - Handles round transitions
    │
    │   └── ScoreBoard.java
    │       - Calculates and stores score
    │
    └── ui/
        └── GameWindow.java
            - Full Swing UI
            - Gradient panels
            - Event handling
            - Layout management
```

---

## 🖼️ UI Layout Overview

```
 ┌───────────────────────────────────────────────┐
 │              Number Guessing Game             │
 │           Enter a number from 1–100           │
 └───────────────────────────────────────────────┘

 ┌───────────────┐   ┌─────────────────────────┐   ┌───────────────┐
 │    ROUNDS     │   │     INPUT FIELD          │   │     SCORE     │
 │       1       │   │     GUESS BUTTON         │   │      120      │
 └───────────────┘   │     ATTEMPTS LEFT        │   └───────────────┘
                     │     RESULT MESSAGE       │
                     └─────────────────────────┘

                    [         EXIT GAME         ]
```

---

## 🛠️ Technologies Used

* **Java SE (JDK 8+)**
* **Java Swing**
* **AWT (Graphics2D, GradientPaint)**
* **Layouts**

  * BorderLayout
  * BoxLayout
  * GridLayout
* **Object-Oriented Programming**

---

## ⚡ How to Run

### Using IDE

1. Open the project in IntelliJ / Eclipse / NetBeans
2. Ensure JDK 8+ is configured
3. Run:

```
ui.GameWindow
```

### Using Command Line

```bash
javac src/ui/GameWindow.java
java ui.GameWindow
```

---

## 🎮 How to Play

1. Enter a number between **1 and 100**
2. Click **Guess**
3. Feedback will indicate:

   * Too high
   * Too low
   * Correct
4. Points are awarded based on remaining attempts
5. New rounds start automatically

---

## 📚 Learning Outcomes

* Java Swing UI design
* Custom gradient painting
* Event handling & keyboard shortcuts
* Layout management for large screens
* Clean project structuring

---

## 📄 License

MIT License © 2025
Free for educational and personal use.

---

### Built with ❤️ using Java Swing

---

