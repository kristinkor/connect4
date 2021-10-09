package edu.cuny.citytech.connect4.model;

import edu.cuny.citytech.connect4.services.Connect4Service;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class T1_GetWinner {

    @Test
    @DisplayName("Test horizontal top left")
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
    @DisplayName("Test horizontal bottom center")
    void T1_GetWinnerHorizontal1() {
        String winningPosition = "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNXXXXNNNNNNNNN";
        Connect4Service connect4Service = new Connect4Service();
        var winnerStatus = connect4Service.getWinnerStatus(winningPosition);
        var actualIndices = winnerStatus.getSingleIndices();
        var expectedIndices = new int[]{29, 30, 31, 32};
        char actualWhoWon = winnerStatus.getWhoWon();
        char expectedWhoWon = 'X';

        assertEquals(expectedWhoWon, actualWhoWon);
        assertArrayEquals(expectedIndices, actualIndices);
    }


    @Test
    @DisplayName("Test bottom horizontal")
    public void T1_GetWinnerHorizontal2() {
        String winningPosition = "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNOOOO";
        Connect4Service connect4Service = new Connect4Service();
        var winnerStatus = connect4Service.getWinnerStatus(winningPosition);
        var actualIndices = winnerStatus.getSingleIndices();
        var expectedIndices = new int[]{38, 39, 40, 41};
        char actualWhoWon = winnerStatus.getWhoWon();
        char expectedWhoWon = 'O';

        assertEquals(expectedWhoWon, actualWhoWon);
        assertArrayEquals(expectedIndices, actualIndices);
    }

    @Test
    @DisplayName("Test horizontal third row right")
    public void T1_GetWinnerHorizontal3() {
        String winningPosition = "NNNNNNNNNNNNNNNNNOOOONNNNNNNNNNNNNNNNNNNNN";
        Connect4Service connect4Service = new Connect4Service();
        var winnerStatus = connect4Service.getWinnerStatus(winningPosition);
        var actualIndices = winnerStatus.getSingleIndices();
        var expectedIndices = new int[]{17, 18, 19, 20};
        char actualWhoWon = winnerStatus.getWhoWon();
        char expectedWhoWon = 'O';

        assertEquals(expectedWhoWon, actualWhoWon);
        assertArrayEquals(expectedIndices, actualIndices);
    }

    @Test
    @DisplayName("Test horizontal second row")
    public void T1_GetWinnerHorizontal4() {
        String winningPosition = "NNNNNNNNNOOOONNNNNNNNNNNNNNNNNNNNNNNNNNNNN";
        Connect4Service connect4Service = new Connect4Service();
        var winnerStatus = connect4Service.getWinnerStatus(winningPosition);
        var actualIndices = winnerStatus.getSingleIndices();
        var expectedIndices = new int[]{9, 10, 11, 12};
        char actualWhoWon = winnerStatus.getWhoWon();
        char expectedWhoWon = 'O';

        assertEquals(expectedWhoWon, actualWhoWon);
        assertArrayEquals(expectedIndices, actualIndices);
    }

    @Test
    @DisplayName("Test horizontal third row left")
    public void T1_GetWinnerHorizontal6() {
        String winningPosition = "NNNNNNNNNNNNNNXXXXNNNNNNNNNNNNNNNNNNNNNNNN";
        Connect4Service connect4Service = new Connect4Service();
        var winnerStatus = connect4Service.getWinnerStatus(winningPosition);
        var actualIndices = winnerStatus.getSingleIndices();
        var expectedIndices = new int[]{14, 15, 16, 17};
        char actualWhoWon = winnerStatus.getWhoWon();
        char expectedWhoWon = 'X';

        assertEquals(expectedWhoWon, actualWhoWon);
        assertArrayEquals(expectedIndices, actualIndices);
    }

    @Test
    @DisplayName("Test horizontal ")
    public void T1_GetWinnerHorizontal7() {
        String winningPosition = "NNNNNNNNNNNNNNNNNNNNNNXXXXNNNNNNNNNNNNNNNN";
        Connect4Service connect4Service = new Connect4Service();
        var winnerStatus = connect4Service.getWinnerStatus(winningPosition);
        var actualIndices = winnerStatus.getSingleIndices();
        var expectedIndices = new int[]{22, 23, 24, 25};
        char actualWhoWon = winnerStatus.getWhoWon();
        char expectedWhoWon = 'X';

        assertEquals(expectedWhoWon, actualWhoWon);
        assertArrayEquals(expectedIndices, actualIndices);
    }

    @Test
    @DisplayName("Test vertical top left")
    public void T1_GetWinnerVertical() {
        String winningPosition = "XNNNNNNXNNNNNNXNNNNNNXNNNNNNNNNNNNNNNNNNNN";
        Connect4Service connect4Service = new Connect4Service();
        var winnerStatus = connect4Service.getWinnerStatus(winningPosition);
        var actualIndices = winnerStatus.getSingleIndices();
        var expectedIndices = new int[]{0, 7, 14, 21};
        char actualWhoWon = winnerStatus.getWhoWon();
        char expectedWhoWon = 'X';

        assertEquals(expectedWhoWon, actualWhoWon);
        assertArrayEquals(expectedIndices, actualIndices);

    }

    @Test
    @DisplayName("Test vertical third column top")
    public void T1_GetWinnerVertical1() {
        String winningPosition = "NNNXNNNNNNXNNNNNNXNNNNNNXNNNNNNNNNNNNNNNNN";
        Connect4Service connect4Service = new Connect4Service();
        var winnerStatus = connect4Service.getWinnerStatus(winningPosition);
        var actualIndices = winnerStatus.getSingleIndices();
        var expectedIndices = new int[]{3, 10, 17, 24};
        char actualWhoWon = winnerStatus.getWhoWon();
        char expectedWhoWon = 'X';

        assertEquals(expectedWhoWon, actualWhoWon);
        assertArrayEquals(expectedIndices, actualIndices);

    }

    @Test
    @DisplayName("Test vertical top right")
    public void T1_GetWinnerVertical2() {
        String winningPosition = "NNNNNNXNNNNNNXNNNNNNXNNNNNNXNNNNNNNNNNNNNN";
        Connect4Service connect4Service = new Connect4Service();
        var winnerStatus = connect4Service.getWinnerStatus(winningPosition);
        var actualIndices = winnerStatus.getSingleIndices();
        var expectedIndices = new int[]{6, 13, 20, 27};
        char actualWhoWon = winnerStatus.getWhoWon();
        char expectedWhoWon = 'X';

        assertEquals(expectedWhoWon, actualWhoWon);
        assertArrayEquals(expectedIndices, actualIndices);

    }

    @Test
    @DisplayName("Test middle vertical")
    public void T1_GetWinnerVertical3() {
        String winningPosition = "NNNNNNNNNXNNNNNNXNNNNNNXNNNNNNXNNNNNNNNNNN";
        Connect4Service connect4Service = new Connect4Service();
        var winnerStatus = connect4Service.getWinnerStatus(winningPosition);
        var actualIndices = winnerStatus.getSingleIndices();
        var expectedIndices = new int[]{9, 16, 23, 30};
        char actualWhoWon = winnerStatus.getWhoWon();
        char expectedWhoWon = 'X';

        assertEquals(expectedWhoWon, actualWhoWon);
        assertArrayEquals(expectedIndices, actualIndices);

    }

    @Test
    @DisplayName("Test vertical ")
    public void T1_GetWinnerVertical4() {
        String winningPosition = "NNNNNNNNNNNXNNNNNNXNNNNNNXNNNNNNXNNNNNNNNN";
        Connect4Service connect4Service = new Connect4Service();
        var winnerStatus = connect4Service.getWinnerStatus(winningPosition);
        var actualIndices = winnerStatus.getSingleIndices();
        var expectedIndices = new int[]{11, 18, 25, 32};
        char actualWhoWon = winnerStatus.getWhoWon();
        char expectedWhoWon = 'X';

        assertEquals(expectedWhoWon, actualWhoWon);
        assertArrayEquals(expectedIndices, actualIndices);

    }

    @Test
    @DisplayName("Test vertical left bottom")
    public void T1_GetWinnerVertical5() {
        String winningPosition = "NNNNNNNNNNNNNONNNNNNONNNNNNONNNNNNONNNNNNN";
        Connect4Service connect4Service = new Connect4Service();
        var winnerStatus = connect4Service.getWinnerStatus(winningPosition);
        var actualIndices = winnerStatus.getSingleIndices();
        var expectedIndices = new int[]{13, 20, 27, 34};
        char actualWhoWon = winnerStatus.getWhoWon();
        char expectedWhoWon = 'O';

        assertEquals(expectedWhoWon, actualWhoWon);
        assertArrayEquals(expectedIndices, actualIndices);

    }
    @Test
    @DisplayName("Test vertical left bottom")
    public void T1_GetWinnerVertical6() {
        String winningPosition = "NNNNNNNNNNNNNNXNNNNNNXNNNNNNXNNNNNNXNNNNNN";
        Connect4Service connect4Service = new Connect4Service();
        var winnerStatus = connect4Service.getWinnerStatus(winningPosition);
        var actualIndices = winnerStatus.getSingleIndices();
        var expectedIndices = new int[]{14, 21, 28, 35};
        char actualWhoWon = winnerStatus.getWhoWon();
        char expectedWhoWon = 'X';

        assertEquals(expectedWhoWon, actualWhoWon);
        assertArrayEquals(expectedIndices, actualIndices);

    }
    @Test
    @DisplayName("Test vertical left bottom")
    public void T1_GetWinnerVertical7() {
        String winningPosition = "NNNNNNNNNNNNNNXNNNNNNXNNNNNNXNNNNNNXNNNNNN";
        Connect4Service connect4Service = new Connect4Service();
        var winnerStatus = connect4Service.getWinnerStatus(winningPosition);
        var actualIndices = winnerStatus.getSingleIndices();
        var expectedIndices = new int[]{14, 21, 28, 35};
        char actualWhoWon = winnerStatus.getWhoWon();
        char expectedWhoWon = 'X';

        assertEquals(expectedWhoWon, actualWhoWon);
        assertArrayEquals(expectedIndices, actualIndices);

    }

    @Test
    @DisplayName("Test diagonal left bottom top right")
    public void T1_GetWinnerDiagonal() {
        String winningPosition = "NNNNNNNONNNNNNNONNNNNNNONNNNNNNONNNNNNNNNN";
        Connect4Service connect4Service = new Connect4Service();
        var winnerStatus = connect4Service.getWinnerStatus(winningPosition);
        var actualIndices = winnerStatus.getSingleIndices();
        var expectedIndices = new int[]{7, 15, 23, 31};
        char actualWhoWon = winnerStatus.getWhoWon();
        char expectedWhoWon = 'O';

        assertEquals(expectedWhoWon, actualWhoWon);
        assertArrayEquals(expectedIndices, actualIndices);
    }

    @Test
    @DisplayName("Test diagonal left top bottom right")
    public void T1_GetWinnerDiagonal1() {
        String winningPosition = "XNNNNNNNXNNNNNNNXNNNNNNNXNNNNNNNNNNNNNNNNN";
        Connect4Service connect4Service = new Connect4Service();
        var winnerStatus = connect4Service.getWinnerStatus(winningPosition);
        var actualIndices = winnerStatus.getSingleIndices();
        var expectedIndices = new int[]{0, 8, 16, 24};
        char actualWhoWon = winnerStatus.getWhoWon();
        char expectedWhoWon = 'X';

        assertEquals(expectedWhoWon, actualWhoWon);
        assertArrayEquals(expectedIndices, actualIndices);
    }

    @Test
    @DisplayName("Test diagonal top right bottom left")
    public void T1_GetWinnerDiagonal2() {
        String winningPosition = "NNNNNNXNNNNNXNNNNNXNNNNNXNNNNNNNNNNNNNNNNN";
        Connect4Service connect4Service = new Connect4Service();
        var winnerStatus = connect4Service.getWinnerStatus(winningPosition);
        var actualIndices = winnerStatus.getSingleIndices();
        var expectedIndices = new int[]{6, 12, 18, 24};
        char actualWhoWon = winnerStatus.getWhoWon();
        char expectedWhoWon = 'X';

        assertEquals(expectedWhoWon, actualWhoWon);
        assertArrayEquals(expectedIndices, actualIndices);
    }

    @Test
    @DisplayName("Test diagonal top right bottom left")
    public void T1_GetWinnerDiagonal3() {
        String winningPosition = "NNNNNNNNNNNNXNNNNNXNNNNNXNNNNNXNNNNNNNNNNN";
        Connect4Service connect4Service = new Connect4Service();
        var winnerStatus = connect4Service.getWinnerStatus(winningPosition);
        var actualIndices = winnerStatus.getSingleIndices();
        var expectedIndices = new int[]{12, 18, 24, 30};
        char actualWhoWon = winnerStatus.getWhoWon();
        char expectedWhoWon = 'X';

        assertEquals(expectedWhoWon, actualWhoWon);
        assertArrayEquals(expectedIndices, actualIndices);
    }

    @Test
    @DisplayName("Test diagonal left bottom top right")
    public void T1_GetWinnerDiagonal4() {
        String winningPosition = "NNNNNNNNNNNNNNNNNNNXNNNNNXNNNNNXNNNNNXNNNN";
        Connect4Service connect4Service = new Connect4Service();
        var winnerStatus = connect4Service.getWinnerStatus(winningPosition);
        var actualIndices = winnerStatus.getSingleIndices();
        var expectedIndices = new int[]{19, 25, 31, 37};
        char actualWhoWon = winnerStatus.getWhoWon();
        char expectedWhoWon = 'X';

        assertEquals(expectedWhoWon, actualWhoWon);
        assertArrayEquals(expectedIndices, actualIndices);
    }

    @Test
    @DisplayName("Test diagonal top right left bottom")
    public void T1_GetWinnerDiagonal5() {
        String winningPosition = "NNNNNNNNNNNNNNNNNONNNNNONNNNNONNNNNONNNNNN";
        Connect4Service connect4Service = new Connect4Service();
        var winnerStatus = connect4Service.getWinnerStatus(winningPosition);
        var actualIndices = winnerStatus.getSingleIndices();
        var expectedIndices = new int[]{17, 23, 29, 35};
        char actualWhoWon = winnerStatus.getWhoWon();
        char expectedWhoWon = 'O';

        assertEquals(expectedWhoWon, actualWhoWon);
        assertArrayEquals(expectedIndices, actualIndices);
    }

    @Test
    @DisplayName("Test diagonal left bottom top right")
    public void T1_GetWinnerDiagonal6() {
        String winningPosition = "NNNONNNNNONNNNNONNNNNONNNNNNNNNNNNNNNNNNNN";
        Connect4Service connect4Service = new Connect4Service();
        var winnerStatus = connect4Service.getWinnerStatus(winningPosition);
        var actualIndices = winnerStatus.getSingleIndices();
        var expectedIndices = new int[]{3, 9, 15, 21};
        char actualWhoWon = winnerStatus.getWhoWon();
        char expectedWhoWon = 'O';

        assertEquals(expectedWhoWon, actualWhoWon);
        assertArrayEquals(expectedIndices, actualIndices);
    }

    @Test
    @DisplayName("Test diagonal right bottom")
    public void T1_GetWinnerDiagonal7() {
        String winningPosition = "NNNNNNNNNNNNNNNNNNNNONNNNNONNNNNONNNNNONNN";
        Connect4Service connect4Service = new Connect4Service();
        var winnerStatus = connect4Service.getWinnerStatus(winningPosition);
        var actualIndices = winnerStatus.getSingleIndices();
        var expectedIndices = new int[]{20, 26, 32, 38};
        char actualWhoWon = winnerStatus.getWhoWon();
        char expectedWhoWon = 'O';

        assertEquals(expectedWhoWon, actualWhoWon);
        assertArrayEquals(expectedIndices, actualIndices);
    }

    @Test
    @DisplayName("Test diagonal")
    public void T1_GetWinnerDiagonal8() {
        String winningPosition = "NNNNNNNNNNNNNNONNNNNNNONNNNNNNONNNNNNNONNN";
        Connect4Service connect4Service = new Connect4Service();
        var winnerStatus = connect4Service.getWinnerStatus(winningPosition);
        var actualIndices = winnerStatus.getSingleIndices();
        var expectedIndices = new int[]{14,22,30,38};
        char actualWhoWon = winnerStatus.getWhoWon();
        char expectedWhoWon = 'O';

        assertEquals(expectedWhoWon, actualWhoWon);
        assertArrayEquals(expectedIndices, actualIndices);
    }

    @Test
    @DisplayName("Test diagonal")
    public void T1_GetWinnerDiagonal9() {
        String winningPosition = "NNNNNONNNNNONNNNNONNNNNONNNNNNNNNNNNNNNNNN";
        Connect4Service connect4Service = new Connect4Service();
        var winnerStatus = connect4Service.getWinnerStatus(winningPosition);
        var actualIndices = winnerStatus.getSingleIndices();
        var expectedIndices = new int[]{5, 11, 17, 23};
        char actualWhoWon = winnerStatus.getWhoWon();
        char expectedWhoWon = 'O';

        assertEquals(expectedWhoWon, actualWhoWon);
        assertArrayEquals(expectedIndices, actualIndices);
    }

    //Connect4Service.getWinner("XNNNNNNNXNNNNNNNXNNNNNNNXNNNNNNNNNNNNNNNNN");

    @Test
    @DisplayName("Test winner X")
    public void T1_GetWinnerX() {
        String winningPosition = "NNNNNNXNNNNNXNNNNNXNNNNNXNNNNNNNNNNNNNNNNN";
        Connect4Service connect4Service = new Connect4Service();
        var winnerStatus = connect4Service.getWinnerStatus(winningPosition);
        char actualWhoWon = winnerStatus.getWhoWon();
        char expectedWhoWon = 'X';
        assertEquals(expectedWhoWon, actualWhoWon);

    }

    @Test
    @DisplayName("Test winner O")
    public void T1_GetWinnerO() {
        String winningPosition = "OOOONNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN";
        Connect4Service connect4Service = new Connect4Service();
        var winnerStatus = connect4Service.getWinnerStatus(winningPosition);
        char actualWhoWon = winnerStatus.getWhoWon();
        char expectedWhoWon = 'O';
        assertEquals(expectedWhoWon, actualWhoWon);
    }

    @Test
    @DisplayName("Test is there a winner true")
    public void T1_GetWinnerStatus1() {
        String winningPosition = "OOOONNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN";
        Connect4Service connect4Service = new Connect4Service();
        var winnerStatus = connect4Service.getWinnerStatus(winningPosition);
        boolean actual = winnerStatus.isWinner();
        assertTrue(actual);
    }

    @Test
    @DisplayName("Test is there a winner false")
    public void T1_GetWinnerStatus2() {
        String winningPosition = "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN";
        Connect4Service connect4Service = new Connect4Service();
        var winnerStatus = connect4Service.getWinnerStatus(winningPosition);
        boolean actual = winnerStatus.isWinner();
        assertFalse(actual);
    }

    @Test
    @DisplayName("Test is there a winner true")
    public void T1_GetWinnerStatus3() {
        String winningPosition = "NNNNXXXNNNNNNNNNNNXNNNNNNNNNNNNNNNNNNOOOON";
        Connect4Service connect4Service = new Connect4Service();
        var winnerStatus = connect4Service.getWinnerStatus(winningPosition);
        boolean actual = winnerStatus.isWinner();
        assertTrue(actual);
    }
}

