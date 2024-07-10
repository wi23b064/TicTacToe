package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class BoardTest {
    private Board board;

    @Before
    public void setUp() {
        board = new Board();
    }

    @Test
    public void testPlaceMarker() {
        assertTrue(board.place(0, 0, 'X')); // Check if placing on an empty cell is successful.
        assertEquals('X', board.cells[0][0]); // Verify 'X' is placed correctly.
    }

    @Test
    public void testDontPlaceMarker() {
        board.place(0, 0, 'X');
        assertFalse(board.place(0, 0, 'O')); // Check if placing on an occupied cell is unsuccessful.
        assertEquals('X', board.cells[0][0]); // Verify 'X' remains unchanged.
    }

    @Test
    public void testIsCellEmpty() {
        assertTrue(board.isCellEmpty(1, 1)); // Cell is empty.
        board.place(1, 1, 'O');
        assertFalse(board.isCellEmpty(1, 1)); // Cell is occupied.
    }


    @Test
    public void testIsFull() {
        // Negative Test: Board is partially filled and should not be full.
        board.place(0, 0, 'X');
        board.place(1, 1, 'O');
        assertFalse(board.isFull());
    }

    @Test
    public void testIsExtraFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board.place(i, j, 'X');
            }
        }
        assertTrue(board.isFull());
    }


    @Test
    public void testPlace() {
        // Positive Test: Checks if placing is done correctly.
        board.place(0, 0, 'X');
        assertEquals('X', board.cells[0][0]);
    }
    
}

