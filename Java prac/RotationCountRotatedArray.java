// ques 10 from the binary search interview questions video of kunal kushwaha where BS stands for binary search
// GFG question: Find the rotation count in the Rotated Sorted Array 
// in this question we count that how many times does the array is rotated
// the count for which the array is rotated is (pivot + 1)


public class RotationCountRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(CountRotation(arr));
    }


    // this counts the rotation
    private static int CountRotation(int[] arr){
        int pivot = findPivot(arr);
        return pivot + 1;
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