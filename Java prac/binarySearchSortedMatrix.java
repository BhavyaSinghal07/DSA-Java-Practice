// binary search in the sorted matrix

/* working:
   => take middle col and perform binary search on that col as compare the mid of that col with target : if that mid > target, then all the element after that mid are greater than target element (then ignore the rows after the mid element)
   :  if that mid < target, then all the element before that mid are smaller than target element (then ignore the rows previous the mid element)
 
   # now searching in the remaining rows:
   => initially check that the remaining mid col has the ans or not
   : if not, then divide the remaining element in parts and apply simple binary search 
 */

import java.util.Arrays;

public class binarySearchSortedMatrix{
    public static void main(String[] args) {
        int[][] arr1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };
        System.out.println(Arrays.toString(search(arr1, 6)));    // in this the indexing start from 0
    }

    // for the simple binary search
    static int[] binary(int[][] arr, int row, int colStart, int colEnd, int target){
        while (colStart <= colEnd) {
            int mid = colStart + (colEnd - colStart)/2 ;
            if(arr[row][mid] == target){
                return new int[]{row, mid};
            }
            if(arr[row][mid] < target){
                colStart = mid + 1 ;
            }
            else{
                colEnd = mid - 1 ;
            }
        }
        return new int[]{-1, -1};
    }

    // for the binary search in the mid col
    static int[] search(int[][] arr, int target){
        int row = arr.length;
        int col = arr[0].length;

        if(row == 1){
            return binary(arr, 0, 0, col-1, target);
        }

        int rowStart = 0;
        int rowEnd = row -1;
        int colMid = col/2;
        
        // run the code till only some rows were remaining
        while (rowStart < (rowEnd - 1)) {
            int mid = rowStart + (rowEnd - rowStart)/2 ;
            if(arr[mid][colMid] == target){
                return new int[]{mid, colMid};
            }
            if(arr[mid][colMid] < target){
                rowStart = mid;
            }
            else{
                rowEnd = mid;
            }
        }

    // now we have two remaining row
        // check whether the target is in col of remaining rows
        if(arr[rowStart][colMid] == target){
            return new int[]{rowStart, colMid};
        }
        if(arr[rowStart + 1][colMid] == target){
            return new int[]{rowStart + 1, colMid};
        }

        // serach in the remaining part of the row instead of col
        if(target <= arr[rowStart][colMid - 1]){
            return binary(arr, rowStart, 0, colMid - 1, target);
        }
        if(target >= arr[rowStart][colMid + 1] && target <= arr[rowStart][col - 1] ){
            return binary(arr, rowStart, colMid+1, col-1, target);
        }
        if(target <= arr[rowStart+1][colMid - 1]){
            return binary(arr, rowStart+1, 0, colMid - 1, target);
        }
        else{
            return binary(arr, rowStart+1, colMid+1, col-1, target);
        }

    }
    
}