package org.example;

public class TicTacToe {
 
    private boolean hasWinner() {
               return board.checkBoard(currentPlayer.getMarker());
    }

}
