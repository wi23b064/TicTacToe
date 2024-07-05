package org.example;
import java.util.Scanner;

public class TicTacToe {

    private final Player player1;
    private final Player player2;
    private Player currentPlayer;
    private final Board board;
    private final Scanner scanner;
    
    public TicTacToe(char marker1, char marker2) {
        player1 = new Player(marker1);
        player2 = new Player(marker2);
        currentPlayer = player1;
        board = new Board();
        scanner = new Scanner(System.in);
        
    }
    public void switchCurrentPlayer(){
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

    private boolean hasWinner() {
        return board.checkBoard(currentPlayer.getMarker());
    }
  
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
        }
        return false;
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
