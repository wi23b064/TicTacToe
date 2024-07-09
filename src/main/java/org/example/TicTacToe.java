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
    
   public TicTacToe() {
        player1 = new Player('X');
        player2 = new Player('O');
        board = new Board(); //empties board
        currentPlayer = player1; //default: player1(x) starts
        scanner = new Scanner(System.in);
    }

}
