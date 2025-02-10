// binary search in the 2D Array, it's worst time complexity is n^2

// In this Question, we apply binary search on a matrix in which every row and every column is sorted
/* Working rule for this question:
   => consider the 1st element of row1 as lowerbound and last element of row1 as upperbound
   => then check upperbound is greater or smaller then target : if greater then we can't check element in the last col and apply col--
   => now check 2nd last element of that row : if smaller then we can't check element in that row and apply row++

   Note : Basically if the element is greater than target apply col-- , if element is smaller than target apply row++
*/


import java.util.Arrays;

public class binarySearch2DArray {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 8, 9},
            {11, 13, 17, 22},
            {23, 27, 34, 35},
            {36, 38, 41, 45},
        };
        System.out.println(Arrays.toString(search(matrix, 34)));    // in this the indexing start from 0
    }


    static int[] search(int[][] arr, int target){
        int r = 0;    // lowerbound
        int c = arr.length-1;    // upperbound

        while(r < arr.length && c >= 0){     // kyuki hm r++ karenge or c--
            if(arr[r][c]  == target){
                return new int[]{r,c};    // this {r,c} gives the index value of the target
            }
            if(arr[r][c] < target){
                r++;
            }
            else{
                c--;
            }
        }
        
        return new int[]{-1,-1};   // element doesn't found
    }

}

