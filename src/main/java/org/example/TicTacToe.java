package org.example;
import java.util.Scanner;

public class TicTacToe {

  public TicTacToe(char playerOneMarker, char playerTwoMarker) {
        board = new Board();
        player1 = new Player(playerOneMarker);
        player2 = new Player(playerTwoMarker);
        currentPlayer = player1; // starts
        scanner = new Scanner(System.in);
    }

   public void start() {
        boolean gameIsRunning = true;
        while (gameIsRunning) {
            board.print();
            boolean moveMade = makeMove(currentPlayer);
            if (moveMade) {
                if (hasWinner()) {
                    board.print();
                    System.out.println(currentPlayer.getMarker() + " wins!");
                    gameIsRunning = false;
                } else if (board.isFull()) {
                    board.print();
                    System.out.println("It's a draw!");
                    gameIsRunning = false;
                } else {
                    switchCurrentPlayer();
                }
            }
        }
    }

   private boolean makeMove(Player player) {
        System.out.println(player.getMarker() + ", enter the position you want your marker in:");
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        if (row < 0 || row >= 3 || col < 0 || col >= 3) {
            System.out.println("Invalid input. Please try again.");
            return false;
        } else if (!board.isCellEmpty(row, col)) {
            System.out.println("This cell is already taken. Please try again.");
            return false;
        } else {
            board.place(row, col, player.getMarker());
            return true;
        }

    }

    public static void main(String[] args) {

        TicTacToe game = new TicTacToe('X', 'O');
        game.start();
        if(game.restartGame())
        {
            game.board.clear();
            game.start();
        }
    }
}
