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
        }
        return false;
    }


    public static void main(String[] args) {
        if(game.restartGame())
        {
            game.board.clear();
            game.start();

        }
    }


}
