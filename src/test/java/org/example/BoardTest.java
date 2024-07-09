package org.example;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class BoardTest {

    private Board board = new Board();

    @Before
    public void setUp() {
        board = new Board();
    }

    @Test
    public void testEmptyBoardInitialization() {
        // Verify that all cells are initially empty
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                assertTrue(board.isCellEmpty(i, j));
            }
        }
    }

    @Test
    public void testPlaceMarker() {
        // Place markers and check if they are placed correctly
        board.place(0, 0, 'X');
        assertEquals('X', board.cells[0][0]);

        board.place(1, 1, 'O');
        assertEquals('O', board.cells[1][1]);

        // Try to place in an already occupied cell
        board.place(0, 0, 'O'); // Should not change the cell
        assertEquals('X', board.cells[0][0]);
    }

    @Test
    public void testBoardFull() {
        // Initially, the board should not be full
        assertFalse(board.isFull());

        // Fill up the board
        board.place(0, 0, 'X');
        board.place(0, 1, 'O');
        board.place(0, 2, 'X');
        board.place(1, 0, 'O');
        board.place(1, 1, 'X');
        board.place(1, 2, 'O');
        board.place(2, 0, 'X');
        board.place(2, 1, 'O');
        board.place(2, 2, 'X');

        // Now the board should be full
        assertTrue(board.isFull());
    }

    @Test
    public void testClearBoard() {
        // Fill the board
        board.place(0, 0, 'X');
        board.place(1, 1, 'O');
        board.place(2, 2, 'X');

        // Clear the board
        board.clear();

        // Verify that all cells are empty after clearing
        testEmptyBoardInitialization(); // Reuse the testEmptyBoardInitialization method
    }

    @Test
    public void testCheckBoardForWinningCondition() {
        // Test winning condition for 'X'
        board.place(0, 0, 'X');
        board.place(0, 1, 'O');
        board.place(1, 1, 'X');
        board.place(1, 0, 'O');
        board.place(2, 2, 'X');
        assertTrue(board.checkBoard('X'));

        // Test winning condition for 'O'
        board.clear(); // Clear the board first
        board.place(0, 0, 'O');
        board.place(0, 1, 'X');
        board.place(1, 1, 'O');
        board.place(1, 0, 'X');
        board.place(2, 2, 'O');
        assertTrue(board.checkBoard('O'));

        // Test no winning condition
        board.clear(); // Clear the board again
        board.place(0, 0, 'X');
        board.place(1, 0, 'O');
        board.place(2, 2, 'X');
        assertFalse(board.checkBoard('X'));
    }
}
