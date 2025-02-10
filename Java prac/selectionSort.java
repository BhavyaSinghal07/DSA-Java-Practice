//  Selection Sort: select an item and swap it with correct index element
/*  steps of doing this:
    -> find the largest element in the sequence
    -> than swap that largest element to the correct index element
*/

// time complexity: O(N^2)  for both best case and worst case
// space complexity: O(1)     because no extra space required
// use case: it performs well in small list/ array and it is not stable

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 1, 2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            // find the max element and swap it with correct index
            int last = arr.length - 1 - i;    // because after each step there is 1 element add in right
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);   // calling the swap
        }
    }

    // to give the max index
    static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }

        return max;
    }

    //program to swap 
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
