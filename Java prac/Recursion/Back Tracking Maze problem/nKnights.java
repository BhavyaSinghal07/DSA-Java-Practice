

public class nKnights {
    public static void main(String[] args) {
        
    }


    static void knight(boolean[][] board, int row, int col, int knights){

        if (knights == 0) {
            display(board);
            System.out.println();
        }
        
        if(col == board.length){
            knight(board, row + 1, 0, knights);
            return;
        }

        if (isSafe(board, row, col)) {
            board[row][col] = true;
            knight(board, row, col + 1, knights - 1);
            board[row][col] = false;
        }

        knight(board, row, col + 1, knights);
        
    }

    private static boolean isSafe(boolean[][] board, int row, int col){
        
        return true;
    }


    private static void display(boolean[][] board){

        for (boolean[] row : board) {             // check for each of row in a board
            
            for (boolean element : row) {         // check for each element for the current row
                if (element) {                    // if element is true then it prints "Q "
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
