package com.example.demo.service;

import com.example.demo.factory.GameFactory;
import com.example.demo.model.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SimulationServiceImpl implements SimulationService {

    private final GameFactory gameFactory;

    @Autowired
    public SimulationServiceImpl(final GameFactory gameFactory) {
        this.gameFactory = gameFactory;
    }

    @Override
    public boolean simulate(final boolean changeBox) {
        final Game game = gameFactory.create();

        final int playerChoice = game.getPlayerChoice();
        final int priceBox = game.getPriceBox();
        if (changeBox) {
            return playerChoice != priceBox;
        } else {
            return playerChoice == priceBox;
        }
    }
}
