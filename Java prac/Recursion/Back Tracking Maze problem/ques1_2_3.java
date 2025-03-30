// In this we try to solvr the problems like maze(bhool bhulaiya) that how to approach to the destination

// ques 1: count the number of ways or steps to reach to a to b
// ques 2: program to display the actual path
// ques 2(another method): using ArrayList to solve this problem
// ques 3: if there is allowance to move diagonally then how can we solve the problem


import java.util.ArrayList;

public class ques1_2_3 {
    public static void main(String[] args) {

        System.out.println(count(3, 3));

        path("", 3, 3);

        System.out.println(path1("", 3, 3));

        System.out.println(path2("", 3, 3));
    }


// ques 1: count the number of ways or steps to reach to a to b
    // note: the matrix numbering is in reverse order for both row and column as r => 3,2,1,.... & c => 3,2,1,...
    static int count(int r, int c){
        if(r == 1 || c == 1){       // base condition, if both row and column is 1, 1 then it returns 1
            return 1;
        }

        int left = count( r - 1, c);   // if it goes down it will reduce (row - 1)
        int right = count(r, c - 1);   // if it goes right then it will reduce (column - 1)
        return left + right;

    }



// ques 2: program to display the actual path
    static void path(String p, int r, int c){
        if(r == 1 && c == 1){       // base condition, if both row and column is 1, 1 then it returns 1
            System.out.println(p);
            return;
        }

        if(r > 1){
            path(p + 'D', r - 1, c);   // if it goes down reduces 1 from row and add D in the path
        }

        if(c > 1){
            path(p + 'R', r, c - 1);   // if it goes right reduces 1 from column and add D in the path
        }
    }



// ques 2(another method): using ArrayList to solve this problem
    static ArrayList<String> path1(String p, int r, int c){
        if(r == 1 && c == 1){       // base condition, if both row and column is 1, 1 then it returns 1
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();    // initialize the list again because inside the if scope it initialize and doesn't acessible outside that scope

        if(r > 1){
            list.addAll(path1(p + 'D', r - 1, c));   // if it goes down reduces 1 from row and add D in the path and all the data add to the list
        }

        if(c > 1){
            list.addAll(path1(p + 'R', r, c - 1));   // if it goes right reduces 1 from column and add D in the path and all the data add to the list
        }

        return list;
    }


// ques 3: if there is allowance to move diagonally then how can we solve the problem
    static ArrayList<String> path2(String p, int r, int c){
        if(r == 1 && c == 1){       // base condition, if both row and column is 1, 1 then it returns 1
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();    // initialize the list again because inside the if scope it initialize and doesn't acessible outside that scope

        if(r > 1 && c > 1){
            list.addAll(path2(p + 'D', r - 1, c - 1));   // if it goes down as well as right reduces 1 from row & column and add D in the path and all the data add to the list
        }

        if(r > 1){
            list.addAll(path2(p + 'V', r - 1, c));   // if it goes down reduces 1 from row and add V in the path and all the data add to the list
        }

        if(c > 1){
            list.addAll(path2(p + 'H', r, c - 1));   // if it goes right reduces 1 from column and add H in the path and all the data add to the list
        }

        return list;
    }

}
