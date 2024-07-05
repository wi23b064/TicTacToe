package org.example;

public class TicTacToe {

    public void switchCurrentPlayer(){
        if (currentPlayer == player1) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }


    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Board board;

    public TicTacToe() {
    }

    public void start() {
    }
 
    private boolean hasWinner() {
    }

    public static void main(String[] args) {
    }
}
