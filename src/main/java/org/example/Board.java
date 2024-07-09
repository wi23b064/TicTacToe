package org.example;

import java.util.Arrays;

public class Board {

    public final char[][] cells = new char[3][3];

    public Board() {
        clear();
    }

    public boolean isCellEmpty(int x, int y) {
        return cells[x][y] == '*';

    }

    public void place(int x, int y, char marker) {
        if (isCellEmpty(x, y)) {
            cells[x][y] = marker;
        }
    }

    public boolean isFull() {
        for (char[] row : cells) {
            for (char cell : row) {
                if (cell == '*') {
                    return false;
                }
            }
        }
        return true;
    }

    public void clear() {

        for (char[] cell : cells) {
            Arrays.fill(cell, '*');
        }
    }

    public void print() {
        for (char[] row : cells) {
            System.out.print("|");
            for (char cell : row) {
                System.out.print(cell != '*' ? cell : " ");
                System.out.print("|");
            }
            System.out.println();
        }

    }

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
