package com.example.demo.factory;

import com.example.demo.model.Game;
import org.springframework.stereotype.Component;

@Component
public class GameFactory {

    public Game create() {
        return new Game();
    }

}
