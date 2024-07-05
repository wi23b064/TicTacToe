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

    public void start() {
        boolean start = true;
        while (start) {
            board.print();
            boolean move = makeMove(currentPlayer);
            if (move) {
                if (hasWinner()) {
                    board.print();
                    System.out.println(currentPlayer.getMarker() + " has won!");
                    System.out.println("-----------------------------");
                    start = false;
                } else if (board.isFull()) {
                    board.print();
                    System.out.println("No win! Try again!");
                    System.out.println("-----------------------------");
                    start = false;
                } else {
                    switchCurrentPlayer();
                }
            }
        }
    }
    private boolean hasWinner() {
        return board.checkBoard(currentPlayer.getMarker());
    }
}
