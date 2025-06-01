package com.game.tetris.models;

import com.game.tetris.presenter.GameModel;

import java.util.Objects;

public class GameModelFactory {
    private GameModelFactory() {
    }

    public static GameModel newGameModel(GameType gameType) {
        if (Objects.requireNonNull(gameType) == GameType.TETRIS) {
            return new TetrisGameModel();
        }
        return null;
    }

}
