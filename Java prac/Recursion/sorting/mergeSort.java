// time complexity: O(N * logN)
// space complexity: O(N logN)


import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        
        int[] arr = {4, 5, 3, 2, 8, 6, 1};
    /*  arr = merge(arr);         if we want to update the original array then we have to write this otherwise we can it in ans that can't update original array
        ex:  ans = merge(arr);    then not the original array update */ 
        System.out.println(Arrays.toString(merge(arr)));
    }


    // contains all recursive approaches which calls the function
    static int[] merge (int[] arr){     // because the return type of function is array
        if(arr.length == 1){            // base condition, when there is only one element left when we stop to dividing the aaray in parts it returns the array
            return arr;
        }

        int mid = arr.length / 2;       // find the mid to apply dividation on array
        int[] left = merge(Arrays.copyOfRange(arr, 0, mid));          // jo array divide hua h left side ka uspe merge sort apply krna hin the range of ( 0 to mid )
        int[] right = merge(Arrays.copyOfRange(arr, mid , arr.length)); 
        
        return add(left, right);
    }


    // it does the process of comparing and storing in another array
    private static int[] add(int[] first, int[] second){
        int[] mix = new int[first .length + second.length];   // create a new array of size which can contains first and second array
        
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length ) {     // i applicable for the elements of first and j applicable for the elements of second
            if(first[i] < second[j]){    
                mix[k] = first[i];       // if i is small then using kth of mix store that element
                i++;
            }
            else{
                mix[k] = second[j];     // if j is small then using kth of mix store that element
                j++;
            }
            k++;    // and correspondingly updating the k
        }

        // there may a condition that the elments in any one array can left, for that it store the remaining elements for that same
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        } 

        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        } 

        return mix;
    }

}