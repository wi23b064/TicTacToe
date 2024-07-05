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
        player1 = new Player('X');
        player2 = new Player('O');
        board = new Board(); //empties board
        currentPlayer = player1; //default: player1(x) starts
        scanner = new Scanner(System.in);
    }

    public void start() {
        board.print();
        System.out.println("Player " + currentPlayer.getMarker() + " wins!");
        switchCurrentPlayer();
    }
 
    private boolean hasWinner() {
               return board.checkBoard(currentPlayer.getMarker());
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.start();
    }
    }
}
