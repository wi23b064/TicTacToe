package org.example;
import java.util.Scanner;

public class TicTacToe {

    public void start() {
        boolean start = true;
        while (start) {
            board.print();
            boolean moveMade = makeMove(currentPlayer);
            if (moveMade) {
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

    private boolean makeMove(Player player){
        System.out.println( player.getMarker() + " has to enter a unique position (from 0-2): ");
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        if (row < 0 || row >= 3 || col < 0 || col >= 3) {
            System.out.println("Error! Try again!");
            System.out.println("-----------------------------");

            return false;
        } else if (!board.isCellEmpty(row, col)) {
            System.out.println("Occupied! Try another!");
            System.out.println("-----------------------------");

            return false;
        } else {
            board.place(row, col, player.getMarker());
            return true;
        }
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe('X', 'O');
        game.start();
        

}
