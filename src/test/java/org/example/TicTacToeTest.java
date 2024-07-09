package org.example;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class TicTacToe {
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Board board;
    private Scanner scanner;
    //new ^^

    public TicTacToe(char p1marker, char p2marker) {
        player1 = new Player(p1marker);
        player2 = new Player(p2marker);
        //new ^^
        board = new Board();
        currentPlayer = player1;
        scanner = new Scanner(System.in);
        //new ^^
    }

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

    private void switchCurrentPlayer() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

    private boolean makeMove(Player player){
        System.out.println( " " + player.getMarker() + ", enter the position you want (from 0-2): ");
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

    private boolean hasWinner() {
        //check rows, columns and diagonals
        return board.checkBoard(currentPlayer.getMarker());
    }
    private boolean restartGame() {

            int temp = 0;
            while(temp == 0){
                System.out.println("Do you want to start a new game? \nPress 1 for yes 0 for no: ");
                temp = scanner.nextInt();
                if(temp == 1){
                    return true;
                }else {
                    return false;
                }
            }

        return false;
    }


    public static void main(String[] args) {
        TicTacToe game = new TicTacToe('X', 'O');
        game.start();
        if(game.restartGame() == true)
        {
            game.board.clear();
            game.start();

        }
    }
}
