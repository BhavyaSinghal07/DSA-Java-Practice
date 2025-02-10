//  ques 1 from the binary search interview questions video of kunal kushwaha where BS stands for binary search
// Celling of a Numer: finding the smallest element in array i.e. greater than or equals to the target element, for example if we have to find 15 in array that does't exist in it whereas 16 exists in the array then we choose that because it is the smallest one i.e. greater than the target element


public class CellingOfNumberBS {
    public static void main(String[] args) {
        int[] arr = {-17, -12, -7, 0, 12, 23, 45, 56, 67, 78, 89, 111, 147, 159};
        int ans = celling(arr,158);

        System.out.println("Index of the smallest no >= target element: " + ans);
    }
    
    // return the index of the smallest no >= target element
    static int celling(int[] arr, int target){

        // but what if the target is greater than the greatest number in the array
        if(target > arr[arr.length-1]){
            return -1;
        }

        
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

        // if the element does't find then there is the occurence of condition (start > end), hence there is we returning the start because it is the smallest no i.e. greater than target element because end is less than the target element
        return start;
    }

}