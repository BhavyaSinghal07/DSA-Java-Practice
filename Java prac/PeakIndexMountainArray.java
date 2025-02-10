// https://leetcode.com/problems/peak-index-in-a-mountain-array/
// https://leetcode.com/problems/find-peak-element/        (ques 7)

// ques 6 from the binary search interview questions video of kunal kushwaha where BS stands for binary search
// mountain array is also called bitonic array, as it contains two level as the starting of the array is in increasing order then the ending of the array is in decreasing order
// find the peak of the mountain array


public class PeakIndexMountainArray {
    public static void main(String[] args) {
        
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
}
