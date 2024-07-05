package org.example;

public class Board {

   public boolean checkBoard(char marker) {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if ((cells[i][0] == marker && cells[i][1] == marker && cells[i][2] == marker) ||
                    (cells[0][i] == marker && cells[1][i] == marker && cells[2][i] == marker)) {
                return true;
            }
        }
        // Check diagonals
        return (cells[0][0] == marker && cells[1][1] == marker && cells[2][2] == marker) ||
                (cells[0][2] == marker && cells[1][1] == marker && cells[2][0] == marker);
    }
}
