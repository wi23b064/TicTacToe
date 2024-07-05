package org.example;

public class TicTacToe {

    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Board board;

    public TicTacToe() {
        
    }

    public void start() {
       
    }
 
    private boolean hasWinner() {
               return board.checkBoard(currentPlayer.getMarker());
    }

  public static void main(String[] args) {
      
    }
}
