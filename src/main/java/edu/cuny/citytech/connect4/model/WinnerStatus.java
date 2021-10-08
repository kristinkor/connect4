package edu.cuny.citytech.connect4.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WinnerStatus {

    private final int[][] position;
    private final char whoWon;

    public WinnerStatus(int[][] position, char whoWon) {
        this.position = position;
        this.whoWon = whoWon;
    }

    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("isWinner", this.isWinner());
        map.put("position", getSingleIndices());
        map.put("whoWon", this.whoWon);
        return map;
    }

    boolean isWinner() {
        return whoWon == 'X' || whoWon == 'O';
    }

    char getWhoWon() {
        return whoWon;
    }

    int[] getSingleIndices() {
        return Arrays
                .stream(position)
                //pair is i and j
                .map(pair -> pair[0] * 7 + pair[1])
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
