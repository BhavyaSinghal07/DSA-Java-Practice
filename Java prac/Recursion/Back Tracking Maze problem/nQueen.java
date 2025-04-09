// In this we solve the n queen problem, as no two queen will in the same row, col or diagonal so that they can't attack on each other


public class nQueen {
    public static void main(String[] args) {
        
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queen(board, 0));

    }


    static int queen(boolean[][] board, int row){     // if boolean board return true the queen is placed
        if(row == board.length){     // base condition if board reaches to the out of board length
            display(board);          // display the board of queen arrangement
            System.out.println();    // new line between two board
            return 1;
        }

        int count = 0;

        // check each row and column for placing the queen 
        for (int col = 0; col < board.length; col++) {      // check they empty space column wise to place queen 

            // check if the queen is safe or not
            if(isSafe(board, row, col)){

                board[row][col] = true;           // means the space is empty and place queen
                count += queen(board, row + 1);   // check the queen placement for the next row
                board[row][col] = false;          // and changes the previous true condition to false

            }
        }

        return count;      // returns the number of count as the number of ways to solve the problem
    }


    // check the safe place for queen vertically and left, right diagonally
    private static boolean isSafe(boolean[][] board, int row, int col){

        // check vertical row
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {      // is true means that the queen is already is there hence it is not safe to place queen there hence return false
                return false;         // as if there is any queen in a row then no queen will place in that column
            }
        }

        // left diagonal check
        int maxLeft = Math.min(row, col);     // check for that which has min value in row and column
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i]) {    // avoid that left diagonal where queen is locate
                return false;
            }
        }

        // right diagonal check
        int maxRight = Math.min(row, board.length - col - 1);     // check for that which has min value in row and column
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i]) {       // avoid that right diagonal where queen is locate
                return false;
            }
        }

        return true;     // if there is not locate queen in any of above position then it returns true and we have to assign queen on that position
    }


    // function to display the board
    private static void display(boolean[][] board){

        for (boolean[] row : board) {             // check for each of row in a board
              
            for (boolean element : row) {         // check for each element for the current row
                if (element) {                    // if element is true then it prints "Q "
                    System.out.print("Q ");
                }
                else{                             // if false then it prints "X "
                    System.out.print("X ");
                }
            }

            System.out.println();     // next line
        }
    }

}
