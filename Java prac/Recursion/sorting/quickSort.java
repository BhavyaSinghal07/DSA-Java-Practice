// pivot is an element that on first pass all the elements left side of p are small and right side are large
/* quick sort is not stable as if there are two elements having the same value than it is not must that after sorting they will be in same order */


import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {

        int[] arr = {4, 5, 3, 1, 6, 8};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

        // Arrays.sort(arr);           this is the inbuild method to apply sorting
        // System.out.println(Arrays.toString(arr));

    }


    static void sort (int[] num, int low, int high){
        if (low >= high){
            return;
        }

        int s = low;
        int e = high;
        int m = s + (e - s)/2;
        int pivot = num[m];     // initially the pivot will be the mid element

        // jb tk s index is smaller or equals to e index it checks fo these condition 
        while(s <= e){
            while (num[s] < pivot) {   // comparing sth element to mid and pointer shifting to right
                s++;
            }
            while (num[e] > pivot) {   // comparing eth element to mid and pointer shifting to left
                e--;
            }

            // this checking of if condition is must because if the array is sorted then it will not swap
            if(s <= e){
                int temp = num[s];
                num[s] = num[e];
                num[e] = temp;
                s++;
                e--;
            }
        }

        // nw my pivot is at the correct index
        sort(num, low, e);
        sort(num, s, high);
    }

}
