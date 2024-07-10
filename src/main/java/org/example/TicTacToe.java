package org.example;
import java.util.Scanner;

public class TicTacToe {

  
  private boolean restartGame() {
        System.out.println("Do you want to start a new game? \nPress 1 for yes, 0 for no: ");
        try {
            int input = scanner.nextInt();
            return input==1;
        } catch (NoSuchElementException e) {
            System.out.println("Invalid input. Please enter 1 or 0.");
            System.out.println("-----------------------------");

        } catch (IllegalStateException e) {
            System.out.println("Scanner closed unexpectedly.");
            System.out.println("-----------------------------");

    private final Player player1;
    private final Player player2;
    Player currentPlayer;
    public final Board board;
    private final Scanner scanner;


    public TicTacToe(char marker1, char marker2) {
        board = new Board();
        player1 = new Player(marker1);
        player2 = new Player(marker2);
        currentPlayer = player1; // starts
        scanner = new Scanner(System.in);
    }

    public void start() {
        boolean start = true;
        while (start) {
            board.print();
            boolean moveMade = makeMove(currentPlayer);
            if (moveMade) {
                if (hasWinner()) {
                    board.print();
                    System.out.println(currentPlayer.getMarker() + " wins!");
                    start = false;
                } else if (board.isFull()) {
                    board.print();
                    System.out.println("It's a draw!");
                    start = false;
                } else {
                    switchCurrentPlayer();
                }
            }
        }
    }

    void switchCurrentPlayer() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
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

    boolean hasWinner() {
        //check rows, columns and diagonals
        return board.checkBoard(currentPlayer.getMarker());

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