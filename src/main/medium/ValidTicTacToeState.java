package main.medium;

import javax.swing.border.Border;

/**
 * 794. Valid Tic-Tac-Toe State
 */
public class ValidTicTacToeState {

    public boolean validTicTacToe(String[] board) {
        int xCount = 0, oCount = 0;
        for (String row : board) {
            for (char c : row.toCharArray()) {
                xCount = (c == 'X') ? (xCount + 1) : xCount;
                oCount = (c == 'O') ? (oCount + 1) : oCount;
            }
        }
        return !((oCount != xCount && oCount != xCount - 1) ||
                (oCount != xCount - 1 && win(board, 'X')) ||
                (oCount != xCount && win(board, 'O')));
    }

    public boolean win(String[] board, char flag) {
        for (int i = 0; i < 3; i++) {
            if ((flag == board[0].charAt(i) && flag == board[1].charAt(i) && flag == board[2].charAt(i)) ||
                    (flag == board[i].charAt(0) && flag == board[i].charAt(1) && flag == board[i].charAt(2))) {
                return true;
            }
        }
        return ((flag == board[0].charAt(0) && flag == board[1].charAt(1) && flag == board[2].charAt(2)) ||
                (flag == board[0].charAt(2) && flag == board[1].charAt(1) && flag == board[2].charAt(0)));
    }

}
