package com.RecursionQ.Array;

public class NSudukoSolver {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
        if(suduko(board))
        {
            display(board);
        }
        else System.out.println("cannot solve");
    }

    private static void display(int[][] board) {

    }

    public static boolean suduko(int[][] board)
    {
         return helper(board,0,0);
    }

     static boolean helper(int[][] board, int row, int col) {
        if(row == board.length) return true;   // base condition....

// if you want to remove loop use this approach...
        int nrow = 0;
        int ncol = 0;

        if(col == board.length-1)
        {   nrow = row+1;
            ncol = 0;
        } else {
            nrow = row;
            ncol = col+1;
        }

        if(board[row][col] != 0)
        {
            return helper(board, row, col);
        }
        else {
            for (int i = 1; i <= 9; i++) {
                if (isSafe(board, row, col, i)) {
                    board[row][col] = i;
                    if (helper(board, nrow, ncol))
                        return true;
                    else
                        board[row][col] = 0;  // Backtracking...
                }
            }
        }
        return false;
    }

    private static boolean isSafe(int[][] board, int row, int col, int num) {
        // for row and column
        for(int i = 0;i< board.length;i++)
        {
            if(board[row][i] == num)
            {
                return false;
            }
            if(board[i][col] == num)
            {
                return false;
            }
        }
        // for 3*3 matrix...
        int sqrt = (int)Math.sqrt(board.length);
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;
        for(int r = rowStart;r<rowStart+sqrt;r++)
        {
            for(int c = colStart;c<colStart+sqrt;c++)
            {
                if(board[r][c] ==  num)
                {
                    return false;
                }
            }
        }
        return true;
    }
}
