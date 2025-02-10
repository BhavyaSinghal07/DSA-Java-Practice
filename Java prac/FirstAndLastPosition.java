// ques 4 from the binary search interview questions video of kunal kushwaha where BS stands for binary search
// find first and last position element in the sorted array
// in this quest a sorted array is given and a target is given we have to give the index no from which that target element start and the ends, if the element doesn't present then it gives [-1,-1]


public class FirstAndLastPosition {
    public static void main(String[] args) {
        
    }


    public int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};   // initially the ans is this, if the doesn't found then it returns this

        // check for the first occurrence if target is first
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;
        return ans;
        
    }


    // this function just return the index value of the target
    int search(int[] nums, int target, boolean findStartIndex){   // for this it will do (end = mid -1)
        
        int ans = -1;   // initially the ans is this, if the doesn't found then it returns this

        int start = 0;
        int end = nums.length - 1 ;

        while (start <= end) {

            int mid = start + (end - start) / 2;    
            if(target < nums[mid]){
                end = mid - 1;
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }

            else{
                ans = mid;     // agr humein mid pr ans mil gaya h then there may be chance ki target element left side bhi ho, left side search ke liye hum (end = mid -1) kr denge vrana hum right side search karenge jiske liye (start = mid +1) hoga
                if( findStartIndex ){     // findStartIndex is itself a boolean expression hence there is no need to compare it with true, it automatically returns true
                    end = mid -1;
                }
                else{
                    start = mid +1;
                }
            }

        }

        return ans;
    }

}
