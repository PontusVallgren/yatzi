package edu.lernia.labb5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatziTest {
    @Test
    void isYatziWhenAllDiceMatches() {
        Die[] dice = new Die[5];
        for(Die die: dice) {
            die.value = 6;
        }
        //Assert something?
        BoardGameMaterial game = new BoardGameMaterial();
        assertEquals(true, game.isYtazi(dice));
    }

    @Test
    void isNotYatziWhenOneDieIsNotMatchingTheOther() {
        Die[] dice = new Die[5];
        for(Die die: dice) {
            die.value = 6;
        }
        dice[5].value = 1;
        //Assert something?
        BoardGameMaterial game = new BoardGameMaterial();
        assertEquals(false, game.isYtazi(dice));
    }
}
