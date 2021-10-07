package edu.cuny.citytech.connect4.model;

import edu.cuny.citytech.connect4.services.Connect4Service;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class T1_GetWinner {

    @Test
    @DisplayName("Test horizontal")
    void T1_GetWinnerHorizontal() {
        String winningPosition = "XXXXNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN";
        Connect4Service connect4Service = new Connect4Service();
        var winnerStatus = connect4Service.getWinnerStatus(winningPosition);
        var actualIndices = winnerStatus.getSingleIndices();
        var expectedIndices = new int[]{0, 1, 2, 3};
        char actualWhoWon = winnerStatus.getWhoWon();
        char expectedWhoWon = 'X';

        assertEquals(expectedWhoWon, actualWhoWon);
        assertArrayEquals(expectedIndices, actualIndices);
    }

    @Test
    @DisplayName("Test vertical")
    public void T1_GetWinnerVertical() {

    }


    @Test
    @DisplayName("Test vertical")
    public void T1_GetWinnerDiagonal() {

    }

    //Connect4Service.getWinner("XNNNNNNNXNNNNNNNXNNNNNNNXNNNNNNNNNNNNNNNNN");

    @Test
    @DisplayName("Test winner X")
    public void T1_GetWinnerX() {
    }

    @Test
    @DisplayName("Test winner O")
    public void T1_GetWinnerO() {
    }


}

