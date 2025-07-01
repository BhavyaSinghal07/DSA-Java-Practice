// in linear and binary search we know that the elements are always in sorted manner but that can be ascending or descending hence to check they are ascending or descending we use the concept "Order Agnostic" in binary search

public class orderAgnosticBinarySearch {
    public static void main(String[] args) {

    //  int[] arr = {-17, -12, -7, 0, 12, 23, 45, 56, 67, 78, 89, 111, 147, 159};      ascending array
        int[] arr = {159, 147, 111, 89, 78, 67, 56, 45, 23, 12, 0, -7, -12, -17};       // descending array

        int ans = orderAgnostic(arr,111);

        // printing the ans with the condition that element found or not
        if (ans >= 0){
            System.out.println("Index at which target is present: " + ans);
        }
        else{
            System.out.println("Element doesn't found");
        }

    }

    static int orderAgnostic(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1 ;

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
