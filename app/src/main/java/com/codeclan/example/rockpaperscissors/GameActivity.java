package com.codeclan.example.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    Game        game;
    TextView    player1Display;
    TextView    computerMoveDisplay;
    TextView    resultsDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        player1Display = findViewById(R.id.player1MoveDisplay);
        computerMoveDisplay = findViewById(R.id.player2MoveDisplay);
        resultsDisplay = findViewById(R.id.resultDisplay);

        game = new Game();

    }

    public void getGameResultOnClick(View view) {

        Button viewButton   = (Button) view;

        Move        player1Move;
        Move        computerMove;
        GameResult  gameResult;
        String      resultDisplayText;

        String chosenMove   = viewButton.getText().toString().toLowerCase();

        if (chosenMove.equals("rock")) {
            player1Move     = Move.ROCK;
        } else if (chosenMove.equals("paper")) {
            player1Move     = Move.PAPER;

        } else {
            player1Move     = Move.SCISSORS;
        }

        computerMove = game.getRandomMove();

        gameResult  = game.getResult(player1Move, computerMove);

        if (gameResult.equals(GameResult.DRAW)){
            resultDisplayText = "It's a draw!";
        } else if (gameResult.equals(GameResult.PLAYER1)){
            resultDisplayText = "You won!";
        } else {
            resultDisplayText = "The computer won :(";
        }



        player1Display.setText("Your move was:   " + player1Move.toString());
        computerMoveDisplay.setText("The computer's move was:   " + computerMove.toString());
        resultsDisplay.setText(resultDisplayText);

    }
}
