//  https://leetcode.com/problems/search-in-rotated-sorted-array/

// ques 8 from the binary search interview questions video of kunal kushwaha where BS stands for binary search
// Search in the Rotated Sorted Array
// in this rotated sorted array all the elements are sorted and all the values are distinct
// clockwise rotated sorted array are that the last element of array will shift to the 1st element of array as 1st rotation and further

/*  we solve this problem as :
    =>  find the pivot(the largest element in the array) or (from pivot all the elements starts to be as ascending order)
    =>  now apply binary search in 1st half as (0, pivot)
    =>  otherwise search in next half as (pivot+1, end)    */

/*  now how to find pivot in rotated sorted array :
    => when you find (mid > mid+1) then you found mid is pivot because all the no. are in ascending order except them
    => if (mid < mid-1) then mid-1 is pivot
    => if (start > mid) then all the elements from mid are < start, so we have to find pivot in left half
    => if (start < mid) then the start become mid+1     */


public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
    }


    // finding the pivot here if the array has distinct elements
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start) / 2;  

            // 4 cases to find pivot
            if (mid < end && arr[mid] > arr[mid+1]){     // to avoid the condition that mid is last element then how to find mid+1
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid-1]){     // to avoid the condition that mid is first element then how to find mid-1
                return mid-1 ;
            }
            if (arr[mid] <= arr[start]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }

        }
        return -1;    // if element doen't found
    }


    // apply binary search after find pivot
    static int search(int[] nums, int target){
        int pivot = findPivot(nums);

        // if you don't get pivot then the array is not rotated
        if(pivot == -1){
            // apply simple binary search
            return binary(nums, target, 0, nums.length-1);
        }

        // if pivot is found
        if (nums[pivot] == target){
            return pivot;
        }
        if (target >= nums[0]){
            return binary(nums, target, 0, pivot-1);    // after pivot all elements are less than start and pivot
        }

        return binary(nums, target, pivot+1, nums.length-1);    // because after pivot all elements are less than start and pivot

    }


    // simple binary search
    static int binary(int[] arr, int target, int start, int end){

        while (start <= end) {
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



// ques 9 from the binary search interview questions video of kunal kushwaha where BS stands for binary search
// finding the pivot here if the array has duplicate elements
    static int findPivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start) / 2;  

            if (mid < end && arr[mid] > arr[mid+1]){     // to avoid the condition that mid is last element then how to find mid+1
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid-1]){     // to avoid the condition that mid is first element then how to find mid-1
                return mid-1 ;
            }
            
            // if elements at mid, start, end are duplicate then just skip the duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                // before skipping just check that is the pivot is on start or end
                if (arr[start] > arr[start+1]){
                    return start;
                }
                start++;
                if (arr[end] < arr[end-1]){
                    return end-1 ;
                }
                end--;
            }

            //left side is sorted so pivot should be in right
            else if(arr[mid] > arr[start] || arr[mid] == arr[start] && arr[mid] > arr[end]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }

        }
        return -1;    // if element doen't found
    }

    
}
