//  ques 2 from the binary search interview questions video of kunal kushwaha where BS stands for binary search
//  Floor of a Numer: finding the greatest element in array i.e. smaller than or equals to the target element, for example if we have to find 15 in array that does't exist in it whereas 14 exists in the array then we choose that because it is the greatest one i.e. smaller than the target element


public class FloorOfNumberBS {
    public static void main(String[] args) {
        int[] arr = {-17, -12, -7, 0, 12, 23, 45, 56, 67, 78, 89, 111, 147, 159};
        int ans = floor(arr,158);

        System.out.println("Index of the greatest no <= target element: " + ans);
    }

    // return the index of the greatest no <= target element
    static int floor(int[] arr, int target){
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
        
        // if the element does't find then there is the occurence of condition (start = end+1), hence there is we returning the end because it is the greatest no i.e. smaller than target element because start exceeds the value of target element
        return end;

    }

}
