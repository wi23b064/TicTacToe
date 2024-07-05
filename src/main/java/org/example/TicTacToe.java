package org.example;

public class TicTacToe {

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

     public static void main(String[] args) {
        TicTacToe game = new TicTacToe('X', 'O');
        game.start();
      }
}
