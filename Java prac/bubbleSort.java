// bubble sort is a method to sort a sequence in ascending or descending 
// in this type of sorting, it compare each element in sequence with each other in steps and then after completion of each step we get largest element at the last of the sequence
// on second step 2nd largest element will come at 2nd last position and so on
// on each step there is one more largest element will add at right side which increase the length of sorted array, hence we use the pivot method to ignore the last sorted seq.
// for a particular step -> ith step j will not replace then the seq is sorted and program will end
// time complexity of bubble sort: best case is O(N) , worst case is O(N^2)
// space complexity: O(1)     because no extra space required

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 1, 2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){

        boolean swapped;    // for the no swap occurance we have to end the loop 

        // run the n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;

            // for each step, max item will come at last respective index
            for (int j = 1; j < arr.length-i; j++) {       // (j < arr.lenth-i) because jitni steps hm i ke krte rahenge utne hi right side sorted hote rahenge

                // swap if the item is smaller than the previous item
                if(arr[j] < arr[j-1]){    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }

            // if you didn't swap for a particular i, it means the array is sorted hence stop the program
            if(!swapped){     // (!false = true)
                break;
            }
        }
    }
}
