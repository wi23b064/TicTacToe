package org.example;
import java.util.Arrays;

public class Board {
  
    public void place(int x, int y, char marker) {
        if (isCellEmpty(x, y)) {
            cells[x][y] = marker;
        }
    }
    
}

