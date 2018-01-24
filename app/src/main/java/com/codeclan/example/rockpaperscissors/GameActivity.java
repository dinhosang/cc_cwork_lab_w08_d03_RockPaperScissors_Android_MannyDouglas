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
    TextView    player2Display;
    TextView    resultsDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        View player1Display = findViewById(R.id.player1MoveDisplay);
        View player2Display = findViewById(R.id.player2MoveDisplay);
        View resultsDisplay = findViewById(R.id.resultDisplay);

        View rockButton     = findViewById(R.id.rockButton);
        View paperButton    = findViewById(R.id.paperButton);
        View scissorButton  = findViewById(R.id.scissorsButton);

        game = new Game();

    }

    public void getGameResultOnClick(View view) {

        Button viewButton   = (Button) view;

        Move        player1Move;
        Move        player2Move;
        GameResult  gameResult;

        String chosenMove   = viewButton.getText().toString().toLowerCase();

        if (chosenMove.equals("rock")) {
            player1Move     = Move.ROCK;
        } else if (chosenMove.equals("paper")) {
            player1Move     = Move.PAPER;

        } else {
            player1Move     = Move.SCISSORS;
        }


        player2Move = game.getRandomMove();

        gameResult  = game.getResult(player1Move, player2Move);


        
    }
}
