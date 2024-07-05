package org.example;
import java.util.Scanner;

public class TicTacToe {
    private final Player player1;
    private final Player player2;
    private Player currentPlayer;
    private final Board board;
    private final Scanner scanner;
    
    public void switchCurrentPlayer(){
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }
    
     public TicTacToe(char marker1, char marker2) {
        player1 = new Player(marker1);
        player2 = new Player(marker2);
        currentPlayer = player1;
        board = new Board();
        scanner = new Scanner(System.in);
        
    }

    private boolean hasWinner() {
        return board.checkBoard(currentPlayer.getMarker());
    }
}
