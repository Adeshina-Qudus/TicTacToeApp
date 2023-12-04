package ticTacToe;

import players.Player;

import java.util.Arrays;

public class TicTacToe {

    private String[][] gameBoard = new String[3][3];
    private Player[] player = new Player[2];

    public TicTacToe() {
        for (String[] strings : gameBoard) {
            Arrays.fill(strings, (Values.EMPTY.toString()));
        }
        player[0] = new Player(Values.X);
        player[1] = new Player(Values.O);
    }

    public int getSizeOfBoard() {
        return gameBoard.length;
    }

    public boolean checkIfAllBoardAreEmptyBeforeStart() {
        for (String[] strings : gameBoard) {
            for (String string : strings) {
                if (!(string.equals(Values.EMPTY.toString()))) {
                    return false;
                }
            }
        }
        return true;
    }

    public int getNumbersOfPlayers() {
        return player.length;
    }

}


