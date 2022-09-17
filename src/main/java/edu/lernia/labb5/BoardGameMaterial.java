package edu.lernia.labb5;

import java.util.Scanner;

public class BoardGameMaterial {
    /* Will be used to store all boardgamematerials in one class */

    public static Die[] dice;
    int numberOfGameRounds;
    int maxRounds = 2;

    public void startNewGameOfYatzi() {
        numberOfGameRounds = 0;
        dice = new Die[5];
        for (int diceNumber = 0; diceNumber < 5; diceNumber++) {
            dice[diceNumber] = new Die();
        }
        //We will continue until the game is over
        System.out.println("Welcome to Yatzi!");
            while (numberOfGameRounds <= maxRounds) {
                newTurn();
                if (isYtazi(dice)) {
                    System.out.println("You got YATZI! in " + dice[0].value + "'s");
                    endGame();
                } else {
                    playerInput();
                }
            }

    }

    public void newTurn() {
        System.out.println("Starting turn " + (numberOfGameRounds + 1) + " of 3, rolling dice.");
        for (int diceNumber = 0; diceNumber < dice.length; diceNumber++) {
            dice[diceNumber].DieRoll();
            //ds[i].value = 5; //Test if yatzi work
            System.out.println(diceNumber + ": " + dice[diceNumber].getString());
        }
    }

    public boolean isYtazi(Die[] dice) {
        boolean gameWon = true;
        for (int diceNumber = 1; diceNumber < 5; diceNumber++) {
            if (dice[diceNumber].value != dice[diceNumber - 1].value) {
                //Set flag to false
                gameWon = false;
            }
        }
        return gameWon;
    }

    public void endGame() {
        System.exit(0);
    }

    public void playerInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Want to throw again? (y for yes, anything else for no)");
        if(sc.next().equals("y") && numberOfGameRounds != maxRounds) {
            ++numberOfGameRounds;
        } else {
            endOrRestartGame();
        }
    }
    public void endOrRestartGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Game over! Want to play again?");
        if(sc.next().equals("y")) {
            startNewGameOfYatzi();
        } else {
            endGame();
        }
    }
}
