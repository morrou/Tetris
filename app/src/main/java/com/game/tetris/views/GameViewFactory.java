package com.game.tetris.views;

import android.widget.Button;
import android.widget.TextView;

import com.game.tetris.presenter.GameView;

public class GameViewFactory {
    private  GameViewFactory(){
    }

    public static GameView newGameView(GameFrame gameFrame, TextView gameScoreText,
                                       TextView gameStatusText, Button gameCtlBtn){
        return new GameViewlmpl(gameFrame, gameScoreText, gameStatusText, gameCtlBtn);
    }
}
