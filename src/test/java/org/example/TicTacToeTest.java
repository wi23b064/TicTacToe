package org.example;

import org.junit.Rule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;


import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest{
    private TicTacToe game;

    @BeforeEach
    public void setUp() {
        // Set up game with markers X and O
        game = new TicTacToe('X', 'O');
    }

    @Test
    public void testSwitchCurrentPlayer() {
        assertEquals('X', game.currentPlayer.getMarker());
        game.switchCurrentPlayer();
        assertEquals('O', game.currentPlayer.getMarker());
        game.switchCurrentPlayer();
        assertEquals('X', game.currentPlayer.getMarker());
    }



    @Test
    public void testHasWinner() {
        // Set up a winning scenario for X
        game.board.place(0, 0, 'X');
        game.board.place(0, 1, 'X');
        game.board.place(0, 2, 'X');
        assertTrue(game.hasWinner());

        // Test for no winner
        game.board.clear();
        assertFalse(game.hasWinner());

        // Set up a winning scenario for O
        game.board.place(1, 0, 'X');
        game.board.place(1, 1, 'X');
        game.board.place(1, 2, 'X');
        assertTrue(game.hasWinner());
    }

//    @Test
//    public void testRestartGame() {
//        String input = "1\n";
//        InputStream in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);
//
//        assertTrue(game.restartGame());
//    }

//    @Test
//    public void testDontRestartGame() {
//        String input = "0\n";
//        InputStream in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);
//
//        assertFalse(game.restartGame());
//    }
}
