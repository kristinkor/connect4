package edu.cuny.citytech.connect4.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WinnerStatus {
    private boolean isWinner;
    private int[] position;
    private String whoWon;

    public WinnerStatus(boolean isWinner, int[] position, String whoWon) {
        this.isWinner = isWinner;
        this.position = position;
        this.whoWon = whoWon;
    }

    public boolean isWinner() {
        return isWinner;
    }

    public void setWinner(boolean winner) {
        isWinner = winner;
    }

    @Override
    public String toString() {
        return "WinnerStatus{" +
                "isWinner=" + isWinner +
                ", position=" + Arrays.toString(position) +
                ", whoWon='" + whoWon + '\'' +
                '}';
    }

    public int[] getPosition() {
        return position;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }

    public String getWhoWon() {
        return whoWon;
    }

    public void setWhoWon(String whoWon) {
        this.whoWon = whoWon;
    }

    public Map<String, Object> toMap(){
        Map<String,Object> map = new HashMap<>();
        map.put("isWinner",true);
        map.put("position", new int []{1,2,3});
        map.put("whoWon", "X");
        return map;
    }
}
