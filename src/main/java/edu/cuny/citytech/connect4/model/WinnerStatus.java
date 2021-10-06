package edu.cuny.citytech.connect4.model;

import java.util.HashMap;
import java.util.Map;

public class WinnerStatus {
    private int[] position;
    private char whoWon;

    public WinnerStatus(int[] position, char whoWon) {
        this.position = position;
        this.whoWon = whoWon;
    }

    public Map<String, Object> toMap(){
        Map<String,Object> map = new HashMap<>();
        map.put("isWinner",this.isWinner());
        map.put("position", this.position);
        map.put("whoWon", this.whoWon);
        return map;
    }

    boolean isWinner() {
        return whoWon == 'X' || whoWon == 'O';
    }
}
