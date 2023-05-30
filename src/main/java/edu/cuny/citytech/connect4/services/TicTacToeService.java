package edu.cuny.citytech.connect4.services;

import edu.cuny.citytech.connect4.model.TicTacToeWinnerStatus;
import org.springframework.stereotype.Service;

@Service
public class TicTacToeService {

    public TicTacToeWinnerStatus getTicTacToeWinnerStatus(String moves) {
        char[][] grid = toGrid(moves);
        return checkWin(grid);
    }

    private char[][] toGrid(String moves) {
        int k = 0, row, column;
        row = 3;
        column = 3;


        char[][] s = new char[row][column];

        // convert the string into grid
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (k < moves.length())
                    s[i][j] = moves.charAt(k);
                k++;
            }
        }
        return s;
    }

    public TicTacToeWinnerStatus checkWin(char[][] str) {
        // creating the empty char, that will be returned if there is no winning combination
        char winner;
        int[][] winPositions;

        // vertical check for each column, breaks if there is a winning combination
        for (int i = 0; i < 3; i++) {
            if (str[i][0] == str[i][1] && str[i][1] == str[i][2]
                    && str[i][0] != 'N') {
                winner = str[i][0];
                winPositions = new int[][]{{i, 0}, {i, 1}, {i, 2}};
                return new TicTacToeWinnerStatus(winPositions, winner);
            }
        }

        // vertical check for each row
        for (int i = 0; i < 3; i++) {
            if (str[0][i] == str[1][i] && str[1][i] == str[2][i]
                    && str[0][i] != 'N') {
                winner = str[0][i];
                winPositions = new int[][]{{0,i}, {1,i}, {2,i}};
                return new TicTacToeWinnerStatus(winPositions, winner);
            }
        }

        // diagonal left to - right bottom
        if (str[0][0] == str[1][1] && str[1][1] == str[2][2]
                && str[0][0] != 'N') {
            winner = str[0][0];
            winPositions = new int[][]{{0,0}, {1,1}, {2,2}};
            return new TicTacToeWinnerStatus(winPositions, winner);
        }

        // diagonal left bottom - right top
        if (str[0][2] == str[1][1] && str[1][1] == str[2][0]
                && str[0][2] != 'N') {
            winner = str[0][2];
            winPositions = new int[][]{{0,2}, {1,1}, {2,0}};
            return new TicTacToeWinnerStatus(winPositions, winner);
        }
        // returning the char X, O or empty ' ' if there were no winning combinations
        return new TicTacToeWinnerStatus(new int[0][0],'N');
    }
}
