//  https://leetcode.com/problems/find-in-mountain-array/description/
// ques 7 from the binary search interview questions video of kunal kushwaha where BS stands for binary search
// in this we have to search the element in mountain array
// first find the peak element, then apply binary search in ascending array if you don't find the value the search in the descending array


public class MountainArray {
    public static void main(String[] args) {
        
    }


    // mainly this program is for the search in mountain array
    int search(int[] arr, int target){
        int peak = Mountain(arr);
        int firstTry = orderAgnostic(arr, target, 0, peak);   // this is to search in the ascending array
        if(firstTry != -1){
            return firstTry;
        }
        // try to search in second half
        return orderAgnostic(arr, target, peak+1, arr.length-1);    // this is to search in the descending array

    }


    static int Mountain(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;  
            if(arr[mid] > arr[mid+1]){
                end = mid;     // then it may be possible that you are in the decreasing part of the mountain array
            }
            else{
                start = mid + 1;    // then it may be possible that you are in the increasing part of the mountain array
            }
        }
        
        // start and end is always try to find the largest element hence the loop termination condition is that when (start == end)
        return start;    // or you can return end both are same
    }


    static int orderAgnostic(int[] arr, int target, int start, int end){

        // find whether the array is ascending or descending sorted
        boolean isAsc = arr[start] < arr[end] ;        // if condition is true it will retutn true otherwise it will return false, we can also write it in if else but to minimise or enhance we write it that way
        

        // normal binary search program
        while (start <= end) {
            // int mid = (start + end)/2;     there can be an error i.e. if (start+end) exceeds the range of the int then it might be show error
            // to resolve the above issue we did :
            int mid = start + (end - start) / 2;    // this is only the enhanced formula but does the same thing as the above formula

            if(arr[mid] == target){      // this is common for both ascending or descending
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else if(target > arr[mid]){       // we can also write it in only else
                    start = mid + 1;
                }
            }

            else{       // this is for descending order
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else if(target < arr[mid]){       // we can also write it in only else
                    start = mid + 1;
                }
            }
                        
        }
        return -1;   // element does not found
    }

}
