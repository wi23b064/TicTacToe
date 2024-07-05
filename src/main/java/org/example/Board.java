package org.example;

public class Board {

    public void place(int x, int y, char marker){
        if (isCellEmpty(x, y)) {
            cells[x][y] = marker;//if cell empty -> mark spot
        }  
    }
}
