// search for an element in 2D array

import java.util.Arrays;

public class searchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 8, 9},
            {3, 4, 5},
            {5, 6, 7, 4},
            {6, 8, 10},
        };
        int target = 5;
        int[] ans = search(arr, target);   // this return the ans as in form of {row, col}
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[]{row, col};   // we have to create the object of this new array because this new array is not initialised before
                }
            }
        }
        return new int[]{-1, -1};  // if the element doesn't found it will return as {-1, -1}
    }
}
