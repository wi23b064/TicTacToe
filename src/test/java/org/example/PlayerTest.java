package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    @Test
    public void testGetMarker() {
        // Create a Player instance with marker 'X'
        Player playerX = new Player('X');
        assertEquals('X', playerX.getMarker());

        // Create a Player instance with marker 'O'
        Player playerO = new Player('O');
        assertEquals('O', playerO.getMarker());
    }
}
