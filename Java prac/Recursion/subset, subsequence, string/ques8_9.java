// In this we learn the iterative approach apply on subsequences

// ques 8: iterative program to print subsequences
// ques 9: if there is an duplicate element then how can we solve it

// time complexity: O(N * 2^N)
// Space complexity: O(2 * N)


import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ques8_9 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        List<List<Integer>> ans = subset(arr);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }

        int[] arr1 = {1, 2, 2};
        List<List<Integer>> ans1 = subsetDuplicate(arr1);
        for (List<Integer> list : ans1) {
            System.out.println(list);
        }

    }


    // ques 8: iterative program to print subsequenses using list of list
    static List<List<Integer>> subset(int[] arr){         // return type is list of list of Integer datatype
        List<List<Integer>> outer = new ArrayList<>();    // create an outer list

        outer.add(new ArrayList<>());            // add the elements of new arraylist to the outer list

        for (int num : arr){                 // take a for each loop for the nums of arr arrray
            int n = outer.size();            // n stores the size of an outer array
            for (int i = 0; i < n; i++) {    // loop works upto the n size
                List<Integer> internal = new ArrayList<>(outer.get(i));     //The purpose of this line is to create a new list (internal) based on the current subset (outer.get(i)) so that new elements (like nums from the arr ) can be added without modifying the original subset (outer.get(i)).   
                internal.add(num);           // num add to the internal list
                outer.add(internal);         // the elemnts of internal list are added to the outer list
            }
        }

        return outer;        // returns the outer list
    }


    // ques 9: avoid the duplicate elements of array in the subsequence
    static List<List<Integer>> subsetDuplicate(int[] arr1){         // return type is list of list of Integer datatype
        Arrays.sort(arr1);                                // we have to use the sorted hence apply inbuild sorting method
        List<List<Integer>> outer = new ArrayList<>();    // create an outer list

        outer.add(new ArrayList<>());            // add the elements of new arraylist to the outer list

        int start = 0;
        int end = 0;
        for (int i = 0; i < arr1.length; i++) {
            start = 0;

            // if current and previous element is same then s = e + 1
            if (i > 0 && arr1[i] == arr1[i-1]) {       //If the current element (arr[i]) is the same as the previous element (arr[i-1]), the starting index (start) for processing is updated to end . This ensures that new subsets are only created from subsets generated in the previous iteration, avoiding duplicates.
                start = end + 1;
            }
            end = outer.size() - 1;      // end works upto the size of outer list

            int n = outer.size();            // n stores the size of an outer array
            for (int j = start; j < n; j++) {    // loop works upto the n size
                List<Integer> internal = new ArrayList<>(outer.get(j));     //The purpose of this line is to create a new list (internal) based on the current subset (outer.get(i)) so that new elements (like nums from the arr ) can be added without modifying the original subset (outer.get(i)).   
                internal.add(arr1[i]);           // num add to the internal list
                outer.add(internal);         // the elemnts of internal list are added to the outer list
            }
        }

        return outer;        // returns the outer list
    }

}
