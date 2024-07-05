package org.example;
import java.util.Scanner;

public class TicTacToe {

    private boolean hasWinner() {
        return board.checkBoard(currentPlayer.getMarker());
    }

}
