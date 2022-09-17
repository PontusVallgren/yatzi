package edu.lernia.labb5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatziTest {
    @Test
    void isYatziWhenAllDiceMatches() {
        Die[] dice = new Die[5];
        for (int diceNumber = 0; diceNumber < 5; diceNumber++) {
            dice[diceNumber] = new Die(1);
        }
        BoardGameMaterial game = new BoardGameMaterial();
        assertEquals(true, game.isYtazi(dice));
    }

    @Test
    void isNotYatziWhenOneDieIsNotMatchingTheOther() {
        Die[] dice = new Die[5];
        for (int diceNumber = 0; diceNumber < 5; diceNumber++) {
            dice[diceNumber] = new Die(2);
        }
        dice[2].setValue(4);
        //Assert something?
        BoardGameMaterial game = new BoardGameMaterial();
        assertEquals(false, game.isYtazi(dice));
    }
}

//         for(Die die: dice) {
//            die.value = 6;
//        }