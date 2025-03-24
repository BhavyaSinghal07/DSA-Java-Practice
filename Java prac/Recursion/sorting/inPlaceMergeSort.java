// modified version of merge sort

import java.util.Arrays;

public class inPlaceMergeSort {
    public static void main(String[] args) {
        
        int[] arr = {4, 5, 3, 2, 8, 6, 1};
        merge(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));

    }

    // contains all recursive approaches which calls the function
    static void merge (int[] arr, int s, int e){
        if(e - s == 1){            // base condition, when there is only one element left when we stop to dividing the array in parts it returns the array
            return;
        }

        int mid = (s + e) / 2;       // find the mid to apply dividation of array
        merge(arr, s, mid);          // jo array divide hua h left side ka uspe merge sort apply krna h upto start to mid
        merge(arr, mid , e); 
        
        mergeInPlace(arr, s, mid, e);   // calls the next function and doesn't return anything
    }


    // it does the process of comparing and storing in another array
    private static void mergeInPlace(int[] arr, int s, int m, int e){
        int[] mix = new int[e - s];   // create a new array of size which can contains all elements of previous array
        
        int i = s;      // here i starts comparing from start to mid hence it is initialize with s
        int j = m;      // here j starts comparing from mid to end hence it is initialize with m
        int k = 0;

        while (i < m && j < e ) {     // i applicable upto mid and j applicable upto end
            if(arr[i] < arr[j]){    
                mix[k] = arr[i];       // if i is small then using kth of mix store that element
                i++;
            }
            else{
                mix[k] = arr[j];     // if j is small then using kth of mix store that element
                j++;
            }
            k++;    // and correspondingly updating the k
        }

        // there may a condition that the elments in any one array can left, for that it store the remaining elements for that same
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        } 

        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        } 

        // to store the data of mix array to arr array
        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];      // initially the s is 0 and l is used to take the elemnts of mix and store in the arr for the same index value
        }
    }

}


