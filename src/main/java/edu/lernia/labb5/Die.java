package edu.lernia.labb5;

public class Die extends BoardGameMaterial {
    public int value = 0;

    public Die(int value) {
        setValue(value);
    }

    public Die() {
        value = (int) Math.random();
    }

    public int diceValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int DieRoll() {
        value = (int)(Math.random()*6+1);
        return value;
    }

    public String getString() {
        return "Dice shows " + value;
    }
}
