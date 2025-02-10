//  https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

// ques 5 from the binary search interview questions video of kunal kushwaha where BS stands for binary search
// GFG question : find the position of element in infinite sorted array , i.e. condition is that you can't apply array.length() function
// in this question we apply binary search on small chunks of the array i.e. we search element in chunks of array by applying binary search
// initially we start decide the chunk length 2 then on going further we double the length of chunk i.e. 4,8,16 and so on
// it will take (log N) steps in worst case


public class PositionOfElement {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(ans(arr, target));
    }


    static int ans(int[] arr, int target){
        // start with chunk of size 2
        int start = 0;
        int end = 1;

        // condition for the target to check in the range, if target is greater than end then it automatically greater than start hence here we check for end only
        // if target is greater than end keep doubling the chunk size
        while(target > arr[end]){
            int newStart = end + 1;
            end = end + 2*(end - start + 1);     // end = previous end + sizeOfBox*2
            start = newStart;
        }   

        return binary(arr, target, start, end);
    }


    static int binary(int[] arr, int target, int start, int end){
    
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
