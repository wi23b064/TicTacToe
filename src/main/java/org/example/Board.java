package org.example;

public class Board {
  
    private char[][] cells = new char[3][3];
  
    public Board() {
        clear();
    }

    public boolean isCellEmpty(int x, int y) {
        if (x < 0 || x >= cells.length || y < 0 || y >= cells[0].length) {
            throw new IllegalArgumentException("Coordinates (x, y) are out of bounds.");
        } else return cells[x][y] == '*'; 
        //if cell at position (x, y) is empty (*) -> true
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
        for (int i=0; i< cells.length; i++){
            //and column
            for(int j=0; j<cells[i].length;j++){
                cells[i][j]= '*'; //when empty -> *
            }
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
            if ((cells[0][0] == marker && cells[1][1] == marker && cells[2][2] == marker) ||
                    (cells[0][2] == marker && cells[1][1] == marker && cells[2][0] == marker)) {
                return true;
            }
            return false;
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

