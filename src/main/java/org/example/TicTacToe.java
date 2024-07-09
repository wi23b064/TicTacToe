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
    
   public TicTacToe(char playerOneMarker, char playerTwoMarker) {
        board = new Board();
        player1 = new Player(playerOneMarker);
        player2 = new Player(playerTwoMarker);
        currentPlayer = player1; // starts
        scanner = new Scanner(System.in);
    }

}
