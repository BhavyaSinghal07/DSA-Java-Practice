// Insertion Sort: in this we are sorting the array partially
/*  -> initialise i=0 and so on and there always j=i+1
    -> on each step it sort the array upto jth index and then further i.e. from (0th to N-1) index
    -> if (j !< j-1) then break the loop because all the elements in left side is sorted
 */

// time complexity: O(N^2)  worst case,   O(N)  best case
// space complexity: O(1)     because no extra space required

/*Why use insertion sort? :
  => adaptive : steps get reduce if array is sorted
  => it is stable
  => it is used for smaller value of N: works good when array is partially sorted
 */

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 1, 2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {      // because j is i+1 hence last element is j, 2nd last is i and arr.length is last element means (N-1)
            for (int j = i+1; j > 0; j--) {      // because for the limit of i+1 index j sorts the array 
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
            }
        }
    }

    //program to swap 
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
