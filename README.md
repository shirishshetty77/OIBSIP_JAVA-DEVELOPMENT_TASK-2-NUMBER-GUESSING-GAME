# 🎮 Number Guessing Game – Java Swing

A **modern Java Swing Number Guessing Game** with a **dark theme, blue gradient UI**, and a **clean, centered layout**.  
This project is designed in the same **professional style** as the *ATM Interface project*, making it ideal for:

- College mini-projects
- GitHub portfolio showcase
- Java Swing UI practice

---

## 🚀 Features

- 🎨 **Dark Mode UI with Blue Gradients**
- 🖥️ **Full-Screen Immersive Layout**
- 🎯 **Clear UI Hierarchy**
  - Center → Main game interaction (large & prominent)
  - Left → Round information
  - Right → Score display
- 🔢 Guess a random number between **1 and 100**
- 🔁 Multiple rounds with automatic progression
- ❌ Limited attempts per round
- 🧠 Score based on remaining attempts
- ⌨️ **ESC key support to exit**
- 🧩 Clean separation between UI and game logic

---

## 🧱 Project Structure

```
Number-Guessing-Game/
├── src/
│   ├── game/
│   │   ├── GameLogic.java        # Core guessing logic
│   │   ├── RoundManager.java     # Handles round progression
│   │   └── ScoreBoard.java       # Score calculation
│   │
│   └── ui/
│       └── GameWindow.java       # Main Swing UI (gradient + dark theme)
│
└── README.md
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

✔ Center components are **larger and dominant**  
✔ Side panels are informational  
✔ Gradients improve visual appeal  

---

## 🛠️ Tech Stack

```
✔ Java 8+
✔ Java Swing
✔ AWT (Graphics2D, GradientPaint)
✔ BorderLayout / BoxLayout / GridLayout
✔ Object-Oriented Programming
```

---

## ⚡ Quick Start

### 1️⃣ Clone Repository
```bash
git clone https://github.com/YOUR_USERNAME/Number-Guessing-Game.git
cd Number-Guessing-Game/src
```

### 2️⃣ Compile & Run
```bash
javac ui/GameWindow.java
java ui.GameWindow
```

*(Or simply run `GameWindow` from your IDE)*

---

## 🎮 How to Play

1. Enter a number between **1 and 100**
2. Click **Guess**
3. You have limited attempts per round
4. Feedback is shown:
   - Too high
   - Too low
   - Correct
5. Score is calculated based on remaining attempts
6. Game automatically moves to the next round

---

## 📚 Learning Outcomes

This project helps you understand:

- Java Swing UI design
- Creating gradient backgrounds using `Graphics2D`
- Managing complex layouts
- Event handling (`ActionListener`, keyboard shortcuts)
- Clean code organization and UI scaling

---

## 🔧 Customization Ideas

- 🎚️ Difficulty levels (Easy / Medium / Hard)
- 💾 Save high scores
- 🔊 Sound effects
- 🎨 FlatLaf / Material UI theme
- 🎞️ Animations
- ☕ JavaFX version

---

## 👤 Author

**Supreme Tuluvaa**  
Java Developer | Swing UI Designer

---

## 📄 License

MIT License © 2025  
Free for educational and personal use.

---

### Built with ❤️ using Java Swing
