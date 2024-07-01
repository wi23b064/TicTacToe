package org.example;

class Player {
    private char marker;// X or O

    public Player(char marker) {
        //constructor
        this.marker = marker;
    }

    public char getMarker() {
        //getter
        return marker;
    }
}
