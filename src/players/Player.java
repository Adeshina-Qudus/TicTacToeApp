package players;

import ticTacToe.TicTacToe;
import ticTacToe.Values;

public class Player{

    private Values values;
    private String name;
    public Player(Values values){
        this.values = values;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public Values getValue() {
        return values;
    }

}
