package se.cygni.montyhall.model;

import java.util.Random;

public class Game {

    private final int playerChoice;
    private final int priceBox;

    public Game() {
        final Random random = new Random();

        playerChoice = random.nextInt(3);
        priceBox = random.nextInt(3);
    }

    public Game(final int playerChoice, final int priceBox) {
        this.playerChoice = playerChoice;
        this.priceBox = priceBox;
    }

    public int getPlayerChoice() {
        return playerChoice;
    }

    public int getPriceBox() {
        return priceBox;
    }

}
