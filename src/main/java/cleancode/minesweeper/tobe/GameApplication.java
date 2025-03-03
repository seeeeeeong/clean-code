package cleancode.minesweeper.tobe;

import cleancode.minesweeper.tobe.gamelevel.GameLevel;
import cleancode.minesweeper.tobe.gamelevel.Middle;
import cleancode.minesweeper.tobe.io.ConsoleInputHandler;
import cleancode.minesweeper.tobe.io.ConsoleOutputHandler;
import cleancode.minesweeper.tobe.io.InputHandler;
import cleancode.minesweeper.tobe.io.OutputHandler;
import cleancode.minesweeper.tobe.minesweeper.Minesweeper;
import cleancode.minesweeper.tobe.minesweeper.config.GameConfig;

public class GameApplication {

    public static void main(String[] args) {
        // Configuration for the game
        GameLevel gameLevel = new Middle();  // Use Middle as the default game level
        InputHandler inputHandler = new ConsoleInputHandler();  // Input handler
        OutputHandler outputHandler = new ConsoleOutputHandler();  // Output handler

        // Initialize Minesweeper with the game level and handlers
        Minesweeper minesweeper = new Minesweeper(gameLevel, inputHandler, outputHandler);
        minesweeper.initialize();
        minesweeper.run();
    }

    /**
     * DIP (Dependency Inversion Principle)
     *
     * DI (Dependency Injection)
     *
     * IoC (Inversion of Control)
     *
     */
}
