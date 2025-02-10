// Concept of array by passing a function
// arrays are mutable in java i.e. we can changa the data of array where string are immutable

import java.util.Arrays;

public class arrayFunctions {
    public static void main(String[] args) {
       int[] num = {3,4,7,9};
       System.out.println(Arrays.toString(num));
       change(num); 
       System.out.println(Arrays.toString(num));
    }

    static void change(int[] arr){    // on calling this function the original data will also changes this shows arrays mutability
        arr[0] = 10;
    }
}
