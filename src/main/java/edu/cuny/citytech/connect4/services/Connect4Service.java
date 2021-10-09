package edu.cuny.citytech.connect4.services;

import edu.cuny.citytech.connect4.model.WinnerStatus;
import org.springframework.stereotype.Service;

@Service
public class Connect4Service {

    public WinnerStatus getWinnerStatus(String moves) {
        char[][] grid = toGrid(moves);
        printGrid(grid);
        return checkWin(grid);
    }

    private char[][] toGrid(String moves) {
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
        return s;
    }

    private void printGrid(char[][] grid) {
        for (char[] chars : grid) {
            for (char aChar : chars) {
                if (aChar == 0) {
                    break;
                }
                System.out.print(aChar);
            }
            System.out.println("");
        }
        System.out.println();
    }

    private WinnerStatus checkWin(char[][] board) {
        final int height = board.length;
        final int width = board[0].length;
        final char nChar = 'N';
        int[][] winPositions;

        for (int r = 0; r < height; r++) { // iterate rows, bottom to top
            for (int c = 0; c < width; c++) { // iterate columns, left to right
                char player = board[r][c];
                if (player != 'X' && player != 'O') {
                    continue; // don't check empty slots
                }

                if (c + 3 < width &&
                        player == board[r][c + 1] && // look right
                        player == board[r][c + 2] &&
                        player == board[r][c + 3]) {
                    winPositions = new int[][]{{r, c}, {r, c + 1}, {r, c + 2}, {r, c + 3}};
                    return new WinnerStatus(winPositions, player);
                }
                if (r + 3 < height) {
                    if (player == board[r + 1][c] && // look up
                            player == board[r + 2][c] &&
                            player == board[r + 3][c]) {
                        winPositions = new int[][]{{r, c}, {r + 1, c}, {r + 2, c}, {r + 3, c}};
                        return new WinnerStatus(winPositions, player);
                    }
                    if (c + 3 < width &&
                            player == board[r + 1][c + 1] && // look up & right
                            player == board[r + 2][c + 2] &&
                            player == board[r + 3][c + 3]) {
                        winPositions = new int[][]{{r, c}, {r + 1, c + 1}, {r + 2, c + 2}, {r + 3, c + 3}};
                        return new WinnerStatus(winPositions, player);
                    }

                    if (c - 3 >= 0 &&
                            player == board[r + 1][c - 1] && // look up & left
                            player == board[r + 2][c - 2] &&
                            player == board[r + 3][c - 3]) {
                        winPositions = new int[][]{{r, c}, {r + 1, c - 1}, {r + 2, c - 2}, {r + 3, c - 3}};
                        return new WinnerStatus(winPositions, player);
                    }
                }
            }
        }
        return new WinnerStatus(new int[0][0], nChar); // no winner found
    }
}
