# 🎮 Button Game

A two-player desktop game developed in **Java Swing**, featuring a 75-button grid and **multithreading** to manage game interactions and player turns.

The project was built to practice **Core Java concepts, multithreading, event handling, GUI development, and game logic**.

## 📌 About the Game

**Button Game** is a simple two-player reaction and matching game.

When the game starts, a single window displays **75 buttons arranged in rows and columns**. The two players take turns clicking the buttons one by one.

The objective is to **match four columns** according to the game's rules. The player who successfully completes the required matching condition wins the game and is shown a **Congratulations** frame.

## ✨ Features

* 👥 Two-player gameplay
* 🔘 75-button grid layout
* 🖱️ Button-based interaction using Java Swing
* 🧵 Multithreading for handling game operations
* 🧠 Core Java-based game logic
* 🔄 Player turn management
* 🏆 Automatic winner detection
* 🎉 Separate Congratulations frame for the winner
* 🖥️ Desktop GUI application

## 🛠️ Technologies Used

| Technology             | Purpose                                  |
| ---------------------- | ---------------------------------------- |
| **Java**               | Core programming language                |
| **Java Swing**         | Graphical User Interface                 |
| **Multithreading**     | Managing game execution and interactions |
| **AWT Event Handling** | Handling button-click events             |
| **Core Java**          | Game logic and control flow              |

## 🎮 How to Play

1. Launch the application.
2. The game window opens with **75 buttons** arranged in a grid.
3. Two players play the game by clicking the buttons one at a time.
4. Players continue making their moves according to the game rules.
5. The game checks the selected buttons and matching conditions.
6. The first player to successfully match the required **four columns** wins.
7. A **Congratulations** frame is displayed for the winning player.

## 🧠 Concepts Demonstrated

This project focuses on several important Java programming concepts:

### Core Java

* Classes and objects
* Methods
* Conditional statements
* Loops
* Arrays / collections
* Encapsulation
* Exception handling

### Multithreading

The project uses **multithreading** to manage parts of the game's execution and provide responsive gameplay while the GUI is running.

### Java Swing

The frontend is developed using Swing components such as:

* `JFrame`
* `JButton`
* `JPanel`
* Layout managers
* Event listeners

### Event Handling

Button clicks are captured through Java event-handling mechanisms. Each click triggers the corresponding game logic and updates the game state.

## 📂 Project Structure

A simplified structure of the project looks like:

```text
ButtonGame/
│
├── src/
│   └── ... Java source files
│
├── nbproject/
│   └── ... NetBeans project configuration
│
├── README.md
```

## 🚀 Getting Started

### Prerequisites

Make sure you have:

* Java JDK installed
* NetBeans IDE installed (recommended)
* Git installed if you want to clone the repository

### Run Using NetBeans


2. Open **NetBeans**.
3. Select **File → Open Project**.
4. Select the cloned `ButtonGame` project.
5. Build the project.
6. Run the application.

## 🔮 Future Improvements

Some features that could be added in future versions:

* 🎨 Improved GUI design
* 🔊 Sound effects
* ⏱️ Timer-based gameplay
* 📊 Player score tracking
* 🔄 Restart/New Game option
* 🏅 Game history
* 🤖 Single-player mode with AI
* 🌈 Better button animations and visual feedback

## 🎯 Learning Outcome

This project helped me strengthen my understanding of **Core Java, object-oriented programming, Java Swing, event-driven programming, multithreading, and implementing game logic** in a desktop application.

It also provided practical experience in connecting backend logic with a graphical user interface and managing user interactions in a multithreaded environment.

## 👨‍💻 Author

Dahiphale Krishna

If you found this project interesting, feel free to ⭐ the repository!
