package edu.cuny.citytech.connect4.services;

import edu.cuny.citytech.connect4.model.WinnerStatus;
import org.springframework.stereotype.Service;

@Service
public class Connect4Service {
    public WinnerStatus getWinner(String moves) {

        char[][] grid = toGrid(moves);
        char winner = checkWin(grid);
        int[] winPositions = {};  // to implement

        return new WinnerStatus(isWinner(winner), winPositions, String.valueOf(winner));
    }

    public char[][] toGrid(java.lang.String moves) {
        int l = moves.length();
        int k = 0, row, column;
        row = 6;
        column = 7;

        if (row * column < l) {
            row = column;
        }

        char[][] s = new char[row][column];

        // convert the string into grid
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (k < moves.length())
                    s[i][j] = moves.charAt(k);
                k++;
            }
        }

        // Printing the grid
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (s[i][j] == 0) {
                    break;
                }
                System.out.print(s[i][j]);
            }
            System.out.println("");
        }
        return s;

    }

    public static char checkWin(char[][] board) {
        final int HEIGHT = board.length;
        final int WIDTH = board[0].length;
        final char EMPTY_SLOT = 'N';

        for (int r = 0; r < HEIGHT; r++) { // iterate rows, bottom to top
            for (int c = 0; c < WIDTH; c++) { // iterate columns, left to right
                char player = board[r][c];
                if (player == EMPTY_SLOT)
                    continue; // don't check empty slots

                if (c + 3 < WIDTH &&
                        player == board[r][c + 1] && // look right
                        player == board[r][c + 2] &&
                        player == board[r][c + 3])
                    return player;
                if (r + 3 < HEIGHT) {
                    if (player == board[r + 1][c] && // look up
                            player == board[r + 2][c] &&
                            player == board[r + 3][c])
                        return player;
                    if (c + 3 < WIDTH &&
                            player == board[r + 1][c + 1] && // look up & right
                            player == board[r + 2][c + 2] &&
                            player == board[r + 3][c + 3])
                        return player;
                    if (c - 3 >= 0 &&
                            player == board[r + 1][c - 1] && // look up & left
                            player == board[r + 2][c - 2] &&
                            player == board[r + 3][c - 3])
                        return player;
                }
            }
        }
        return EMPTY_SLOT; // no winner found
    }

    boolean isWinner(char k) {
        return k == 'X' || k == 'O';
    }
}
