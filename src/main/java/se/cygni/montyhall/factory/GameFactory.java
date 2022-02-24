package se.cygni.montyhall.factory;

import se.cygni.montyhall.model.Game;
import org.springframework.stereotype.Component;

@Component
public class GameFactory {

    public Game create() {
        return new Game();
    }

}
