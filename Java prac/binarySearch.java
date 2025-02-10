// in this question elements of array are sorted in ascending order
// in this type of searching technique we initially find the mid element and then compare it from the target that the mid element is less or greater then fix the new starting and ending point of the array

public class binarySearch {
    public static void main(String[] args){
        int[] arr = {-17, -12, -7, 0, 12, 23, 45, 56, 67, 78, 89, 111, 147, 159};
        int ans = binary(arr,158);

        // printing the ans with the condition that element found or not
        if (ans >= 0){
            System.out.println("Index at which target is present: " + ans);
        }
        else{
            System.out.println("Element doesn't found");
        }

    }

    static int binary(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1 ;

        while (start <= end) {
            // int mid = (start + end)/2;     there can be an error i.e. if (start+end) exceeds the range of the int then it might be show error
            // to resolve the above issue we did :
            int mid = start + (end - start) / 2;    // this is only the enhanced formula but does the same thing as the above formula

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;   // element found
            }
        }
        return -1;   // element does not found
    }
}
