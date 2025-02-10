// https://leetcode.com/problems/first-missing-positive/
// ques 6 from cyclic sort video of kunal kushwaha  (first missing positive)
// to find that smallest positive missing number
/* => ignore -ve number
   => after sorting start checking from 1 and then get the first missing number i.e. smallest positive
*/

public class firstMissingPositiveCyclicSort {
    public static void main(String[] args) {
        
    }

    public static int firstMissingPositive(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i]-1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]){    // nums[i]>0 to ignore -ve no
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }

        // search for missing number
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1){      // case 1
                return j+1;     // kyuki uss index pr wrong number hoga toh correct missing number (index+1)
            }
        }
                    
        return nums.length + 1;    // case 2    agr saare num shi h toh n+1 will be the ans
    }

    //program to swap 
    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}
