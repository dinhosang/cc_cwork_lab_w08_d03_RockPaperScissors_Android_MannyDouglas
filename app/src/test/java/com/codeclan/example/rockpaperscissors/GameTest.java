package com.codeclan.example.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 24/01/2018.
 */

public class GameTest {


    Game game;


    @Before
    public void before(){

        game = new Game();

    }


    @Test
    public void canGetResultDraw(){
        assertEquals(GameResult.DRAW, game.getResult(Move.ROCK, Move.ROCK));
    }

    @Test
    public void player1CanWinWithRock() {
        assertEquals(GameResult.PLAYER1, game.getResult(Move.ROCK, Move.SCISSORS));
    }

    @Test
    public void player2CanWinPaper() {
        assertEquals(GameResult.PLAYER2, game.getResult(Move.PAPER, Move.SCISSORS));
    }

    @Test
    public void player1CanWinWithScissors() {
        assertEquals(GameResult.PLAYER1, game.getResult(Move.SCISSORS, Move.PAPER));
    }

    @Test
    public void canGetSizeOfMoveArrayList(){
        System.out.println(game.getRandomMove());
        System.out.println(game.getRandomMove());
        System.out.println(game.getRandomMove());
        assertEquals(3, game.getAllMoves().size());
    }
}
