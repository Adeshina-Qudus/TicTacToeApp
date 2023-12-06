package ticTacToe;

import exception.InvalidPositionException;
import players.Player;

import java.util.Arrays;
import java.util.HashMap;

import static ticTacToe.Values.EMPTY;

public class TicTacToe {

    private Values[][] gameBoard = new Values[3][3];
    private final Player[] player = new Player[2];
    private HashMap<Integer,int[]> values = new HashMap<>();

    public TicTacToe() {
        for(int count = 0; count < gameBoard().length;count++){
            Arrays.fill(gameBoard[count],EMPTY);
        }

        player[0] = new Player(Values.X);
        player[1] = new Player(Values.O);
        int row = 0;
        int coloumn = 0;
        for(int count = 1;count < 10;count++){
            values.put(count,new int[]{row,coloumn});
            coloumn++;
            if(coloumn > 2){
                row++;
                coloumn = 0;
            }
        }
    }
    public int getSizeOfBoard() {
        return gameBoard.length;
    }
    public boolean checkIfAllBoardAreEmptyBeforeStart() {
        for (Values[] strings : gameBoard) {
            for (Values string : strings) {
                if(string != EMPTY)return false;
            }
        }
        return true;
    }
    public int getNumbersOfPlayers() {
        return player.length;
    }
    public Values[][] gameBoard() {
        return gameBoard;
    }
    public void play(int move,Player player) {
        int [] array = values.get(move);
        validateValidSpace(array);
        gameBoard[array[0]][array[1]] = player.getValue();
    }

    private void validateValidSpace(int [] array ){
        if (gameBoard[array[0]] [array[1]] != EMPTY){
        throw new InvalidPositionException("Space is not Empty");
        }
    }
}



