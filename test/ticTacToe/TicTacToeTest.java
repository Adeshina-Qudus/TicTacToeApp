package ticTacToe;

import exception.InvalidPositionException;
import org.junit.jupiter.api.Test;
import players.Player;

import java.util.Arrays;

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
    @Test
    public void playerCanMakeMoveTest(){
        TicTacToe ticTacToe = new TicTacToe();
        Player playerOne = new Player(Values.X);
        Player playerTwo = new Player(Values.O);
        ticTacToe.play(9,playerOne);
        ticTacToe.play(1,playerTwo);
        System.out.println(Arrays.deepToString(ticTacToe.gameBoard()));
    }
    @Test
    public void playerCannotMakeMoveInABoxWhereAValueIsTest(){
        TicTacToe ticTacToe = new TicTacToe();
        Player playerOne = new Player(Values.X);
        Player playerTwo = new Player(Values.O);
        ticTacToe.play(9,playerOne);
        ticTacToe.play(1,playerTwo);
        assertThrows(InvalidPositionException.class, () -> ticTacToe.play(1,playerOne));
    }


}