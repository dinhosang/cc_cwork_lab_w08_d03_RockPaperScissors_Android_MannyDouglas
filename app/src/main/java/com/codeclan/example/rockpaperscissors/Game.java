package com.codeclan.example.rockpaperscissors;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by user on 24/01/2018.
 */

class Game {

    private ArrayList<Move> moves;

    public Game(){

        this.moves = new ArrayList<>(Arrays.asList(Move.PAPER, Move.ROCK, Move.SCISSORS));
    }


    public GameResult getResult(Move player1Move, Move player2Move) {


        if (player1Move.equals(player2Move)) {
            return GameResult.DRAW;
        } else if (player1Move.equals(Move.ROCK)) {
            if (player2Move.equals(Move.SCISSORS)) {

                return GameResult.PLAYER1;
            }
            return GameResult.PLAYER2;

        } else if (player1Move.equals(Move.SCISSORS)) {
            if (player2Move.equals(Move.PAPER)) {

                return GameResult.PLAYER1;
            }
            return GameResult.PLAYER2;
        } else {
            if (player2Move.equals(Move.ROCK)) {
                return GameResult.PLAYER1;
            }

            return GameResult.PLAYER2;
        }
    }


    public Move getRandomMove(){

//        ArrayList<Move> moves = new ArrayList<>(Arrays.asList(Move.PAPER, Move.ROCK, Move.SCISSORS));

//        Could also do the below instead of the above method, in two lines for clarity
//        ArrayList<Move> moves = new ArrayList<>();
//        moves.addAll(Arrays.asList(Move.PAPER, Move.ROCK));

        Collections.shuffle(moves);

        return moves.get(0);

    }

    public ArrayList<Move> getAllMoves() {

        ArrayList<Move> copyMoves = new ArrayList<>(moves);
        return copyMoves;
    }
}
