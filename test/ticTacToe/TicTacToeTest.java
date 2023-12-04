package ticTacToe;

import org.junit.jupiter.api.Test;
import players.Player;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    @Test
    public void testThatGameBoardIsInitializedWithTheRightSize() {
        TicTacToe ticTacToe = new TicTacToe();
        assertEquals(3, ticTacToe.getSizeOfBoard());
    }

    @Test
    public void testThatAllCellsOnTheBoardAreEmptyAtStart() {
        TicTacToe ticTacToe = new TicTacToe();
        assertTrue(ticTacToe.checkIfAllBoardAreEmptyBeforeStart());
    }

    @Test
    public void testThatGameHasTwoPlayer() {
        TicTacToe ticTacToe = new TicTacToe();
        assertEquals(2, ticTacToe.getNumbersOfPlayers());
    }
    @Test
    public void playerCanSetNameTest() {
        Player playerOne = new Player(Values.X);
        Player playerTwo = new Player(Values.O);
        playerOne.setName("qudus");
        playerTwo.setName("joy");
        assertEquals("qudus", playerOne.getName());
        assertEquals("joy", playerTwo.getName());
    }
    @Test
    public void playerValueTest() {
        Player playerOne = new Player(Values.X);
        Player playerTwo = new Player(Values.O);
        assertEquals(Values.X, playerOne.getValue());
        assertEquals(Values.O, playerTwo.getValue());
    }

}