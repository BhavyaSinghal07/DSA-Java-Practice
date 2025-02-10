// reverse the array using swap function
// this method is also known as two pointer method because one pointer is on start and second is on end

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,10,4,5,7,9};

        reverse(arr);    // calling the reverse method
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr){    // method to reverse the array
        int start =0;
        int end = arr.length-1;

        while(start<end){ 
            swap(arr, start, end);    // calling the swap method 
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int index1, int index2){     // method to swap the array which we call in the reverse method
        int temp = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = temp;
    }

}
