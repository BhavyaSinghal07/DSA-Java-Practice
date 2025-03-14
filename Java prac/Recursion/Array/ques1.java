// ques1 is to check the array is sorted or not


public class ques1{
    public static void main(String args[]){
        int[] arr = {1, 2, 4, 3, 6, 7};
        System.out.println(isSorted(arr, 0));     // initially the index is 0
    }

    
    // ques1: to check the array is sorted or not
    static boolean isSorted(int[] arr, int i){
        if(i == arr.length -1){         // if index increement reaches to the last element of the array then it returns true
            return true;
        }
        return arr[i] < arr[i+1] && isSorted(arr, i+1);    // checking that they are sorted and increasing the index value
    }


    // ques2: search a num using linear serch method
    
}