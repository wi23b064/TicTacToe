package org.example;
import java.util.Arrays;

public class Board {
  
    private final char[][] cells = new char[3][3];
  
    public Board() {
        clear();
    }

    public boolean isCellEmpty(int x, int y) {
        return cells[x][y] == '*';
    }

    public boolean isFull() {
        for (char[] row : cells) {
            //and then each cell of each row
            for (char cell : row) {
                if (cell == '*') {
                    return false;//if empty (*)-> not full
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
            System.out.print("\n|");
            for (char cell : row) {
                System.out.print(cell != '*' ? cell : " ");
                System.out.print("|\n");
            }
            System.out.println();
        }
    }

}

