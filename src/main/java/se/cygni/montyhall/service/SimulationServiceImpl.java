package se.cygni.montyhall.service;

import se.cygni.montyhall.factory.GameFactory;
import se.cygni.montyhall.model.Game;
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
        }
        return playerChoice == priceBox;
    }
}
