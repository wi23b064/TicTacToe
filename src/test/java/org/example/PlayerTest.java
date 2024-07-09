package org.example;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class PlayerTest {

    private Player player1;
    private Player player2;

    @Before
    public void setUp(){
        player1 = new Player('X');
        player2 = new Player('O');
    }



    @Test
    public void testGetX() {
        assertEquals('X', player1.getMarker());
    }

    @Test
    public  void  testGetO(){

        assertEquals('O', player2.getMarker());
    }

}
