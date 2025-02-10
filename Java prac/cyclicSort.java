// Cyclic Sort: when given numbers/elements from range (1 to N) use cyclic sort, in the one single pass or single loop, every unique item is swapped once 
// there must be a continuous number of elements
// note: (index = value - 1) because the indexing start from 0 (Ex: 0th index has value 1)
// time complexity: O(N) worst case

/*Note: if range = (0 to N) then every element will be at index = value
        if range = (1 to N) then every element will be at index = value - 1    */ 


import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 1, 2};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
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