// in this we swap the elements of particular index of array

import java.util.Arrays;

public class swapArray {
    public static void main(String[] args) {
        int[] arr = {1,2,10,4,5,7,9};
        swap(arr, 1, 3);    // call the finction swap to swap index (1, 3) elements

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = temp;
    }
}
