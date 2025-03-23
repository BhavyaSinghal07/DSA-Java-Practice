// ques 5: return the list without passing the arguments
// ques 6: rotated binary search

import java.util.ArrayList;

public class ques5_6 {
    public static void main(String[] args) {

        int[] arr = {1, 7, 2, 6, 4, 5, 3, 6, 6, 7};
        System.out.println(multipleIndex(arr, 7, 0));

        int[] arr1 = {5, 6, 7, 8, 1, 2, 3};
        System.out.println(search(arr1, 7, 0, arr1.length -1));
    }



    // ques5: in this we want to return a list without pasing it in argument as a parameter but initialize it in body 
    // challenge in solving this is that : buecause list initializatin is in the body hence on each call it creates a new list, it does not merge for the main list
    static ArrayList<Integer> multipleIndex(int[] arr, int t, int ind){
        ArrayList<Integer> list = new ArrayList<>();

        if(ind == arr.length){      // if index value reaches to the out of the array then it returns -1 the element doesn't found and exit
            return list;
        }
        // this contain answer for that function list only
        if (arr[ind] == t) {       // if it gets element it returns the index value of it's location
            list.add(ind);
        }

        ArrayList<Integer> ans = multipleIndex(arr, t, ind+1);    // calls the function and stores in the ans ArrayList
        list.addAll(ans);       // add all the ans in list
        return list;
    }



    // ques 6: apply the binary search on the rotated array
    static int search(int[] arr1, int target, int s, int e){
        if(s > e){
            return -1;     // base condition, if starting index going max to end index
        }

        int m = s + (e-s)/2;

        if(arr1[m] == target){
            return m;        // return the index of mid element
        }

        if(arr1[s] <= arr1[m]){
            if(target >= arr1[s] && target <= arr1[m]){
                return search(arr1, target, s, m-1);      // searches up to mid-1 element
            }
            else{
                return search(arr1, target, m+1, e);     // searching start from mid+1 element
            }
        }

        // we repeat this operation again because above we check it only for those array whose s <= m but this can applicable for as [5,4,1,2,3] => s > m
        if(target >= arr1[m] && target <= arr1[e]){
            return search(arr1, target, m+1, e);      // searching start from mid+1 element
        }
        else{
            return search(arr1, target, s, m-1);
        } 
    }

}
