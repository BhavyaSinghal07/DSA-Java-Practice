// This program is a backtracking solution to the N-Knights problem, where the goal is to place N knights on an N×N chessboard such that no two knights attack each other.

public class nKnights {
    public static void main(String[] args) {
        
        int n = 4;
        boolean[][] board = new boolean[n][n];
        knight(board, 0, 0, 4);
    }


    static void knight(boolean[][] board, int row, int col, int knights){

        if (knights == 0) {          // base case
            display(board);
            System.out.println();
            return;
        }
        
        if (col == board.length){         // row changes: When you reach end of a row, move to the next row
            knight(board, row + 1, 0, knights);
            return;
        }

        if (isSafe(board, row, col)) {    // Try to place a knight: Place a knight if it's safe, move forward, and backtrack after recursive call
            board[row][col] = true;
            knight(board, row, col + 1, knights - 1);   // recursive call
            board[row][col] = false;                    // backtracking
        }

        knight(board, row, col + 1, knights);   // Try without placing: Try next column without placing a knight.
        
    }

    /*Checks if current position is safe to place a knight:
        A knight can attack in 4 directions only from upper side, because we're filling board top-down.
        If any of those 4 positions already have a knight (true), return false */
    private static boolean isSafe(boolean[][] board, int row, int col){
        if (isValid(board, row - 1, col - 2)){
            if(board[row - 1][col - 2]){
                return false;
            }
        }

        if (isValid(board, row - 2, col - 1)){
            if(board[row - 2][col - 1]){
                return false;
            }
        }

        if (isValid(board, row - 2, col + 1)){
            if(board[row - 2][col + 1]){
                return false;
            }
        }

        if (isValid(board, row - 1, col + 2)){
            if(board[row - 1][col +2]){
                return false;
            }
        }

        return true;
    }

    // do not repeat yourself, hence created this function
    static boolean isValid(boolean[][] board, int row, int col){             // Prevents array out of bounds: Ensures (row, col) is within bounds before checking board[row][col]
        if(row >= 0 && row < board.length && col >= 0 && col < board.length){
            return true;
        }
        return false;
    }


    private static void display(boolean[][] board){

        for (boolean[] row : board) {             // check for each of row in a board
            
            for (boolean element : row) {         // check for each element for the current row
                if (element) {                    // if element is true then it prints "K "
                    System.out.print("K ");
                }
                else{                             // if false then it prints "X "
                    System.out.print("X ");
                }
            }

            System.out.println();     // next line
        }
    }

}
