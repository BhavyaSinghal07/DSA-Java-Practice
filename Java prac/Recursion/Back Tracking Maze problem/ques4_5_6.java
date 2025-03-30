// In this we're solving the maze problem which also contains the obstacles

// ques 4: simple program to solve the maze which also contains the obstacle
// ques 5:  if movement in all directions are allowed up, down, left, right
// ques 6:  print the matrix and the path for the tracked path


import java.util.Arrays;

public class ques4_5_6 {
    public static void main(String[] args) {
        
        boolean[][] board = {
            {true, true, true},
            {true, true, true},
            {true, true, true},
        };
        path("", board, 0, 0);

        path1("", board, 0, 0);

        int[][] pathMatrix = new int[board.length][board[0].length];
        path2("", board, 0, 0, pathMatrix, 1);
    }



// ques 4: simple program to solve the maze which also contains the obstacle
    static void path(String p, boolean[][] maze, int r, int c){    // given a maze as the true is free space and false is obstacled space
        if(r == maze.length - 1 && c == maze[0].length - 1){       // base condition, if both row and column reaches to the condition then it returns
            System.out.println(p);
            return;
        }

        // for obstacle checking
        if(!maze[r][c]){       // if detects obstacle then returns
            return;  
        }

        if(r < maze.length - 1){
            path(p + 'D', maze, r + 1, c);   // if it goes down add 1 to row and add D in the path
        }

        if(c < maze[0].length - 1){
            path(p + 'R', maze, r, c + 1);   // if it goes right add 1 to column and add R in the path
        }
    }



// ques 5:  if movement in all directions are allowed up, down, left, right
    static void path1(String p, boolean[][] maze, int r, int c){    // given a maze as the true is free space and false is obstacled space
        if(r == maze.length - 1 && c == maze[0].length - 1){       // base condition, if both row and column reaches to the condition then it returns
            System.out.println(p);
            return;
        }

        // for obstacle checking
        if(!maze[r][c]){       // if detects obstacle then returns
            return;  
        }

        // considering that this path is in tracked path already hence change it to false so that it will not retrack and occurs any issue
        maze[r][c] = false;

        if(r < maze.length - 1){
            path1(p + 'D', maze, r + 1, c);    // if it goes down add 1 to row and add D(down) in the path
        }

        if(c < maze[0].length - 1){
            path1(p + 'R', maze, r, c + 1);    // if it goes right add 1 to column and add R(right) in the path
        }

        if(r > 0){
            path1(p + 'U', maze, r - 1, c);    // if it goes upward reduce 1 from row and add U(up) in the path
        }

        if(c > 0){
            path1(p + 'L', maze, r, c - 1);    // if it goes left reduce 1 from column and add L(left) in the path
        }

        // where the function will be over, so before the function gets removed the changes that were made by that function must be remove
        maze[r][c] = true;    // remove that change of false to true

    }



// ques 6:  print the matrix and the path for the tracked path
    static void path2(String p, boolean[][] maze, int r, int c, int[][] pathMatrix, int step){    // given a maze as the true is free space and false is obstacled space
        if(r == maze.length - 1 && c == maze[0].length - 1){       // base condition, if both row and column reaches to the condition then it returns

            pathMatrix[r][c] = step;       // this for loop is also an step
            for (int[] arr : pathMatrix) {
                System.out.println(Arrays.toString(arr));
            }

            System.out.println(p);    // to print path also
            System.out.println();     // add a new line
            return;
        }

        // for obstacle checking
        if(!maze[r][c]){       // if detects obstacle then returns
            return;  
        }

        // considering that this path is in tracked path already hence change it to false so that it will not retrack and occurs any issue
        maze[r][c] = false;
        pathMatrix[r][c] = step;


        if(r < maze.length - 1){
            path2(p + 'D', maze, r + 1, c, pathMatrix, step + 1);    // if it goes down add 1 to row and add D(down) in the path
        }

        if(c < maze[0].length - 1){
            path2(p + 'R', maze, r, c + 1, pathMatrix, step + 1);    // if it goes right add 1 to column and add R(right) in the path
        }

        if(r > 0){
            path2(p + 'U', maze, r - 1, c, pathMatrix, step + 1);    // if it goes upward reduce 1 from row and add U(up) in the path
        }

        if(c > 0){
            path2(p + 'L', maze, r, c - 1, pathMatrix, step + 1);    // if it goes left reduce 1 from column and add L(left) in the path
        }

        // where the function will be over, so before the function gets removed the changes that were made by that function must be remove
        maze[r][c] = true;    // remove that change of false to true
        pathMatrix[r][c] = 0;

    }

}
