// https://leetcode.com/problems/missing-number/        (amazon)
// ques 1 from cyclic sort video of kunal kushwaha
// initially we sort the array and the compare that with it's index, the index which doesn't match is the ans


public class missingNumCyclicSort{

    public static void main(String[] args) {
        int[] nums = {4, 0, 2, 1};
        System.out.println(missingNumber(nums));
    }
    
    public static int missingNumber(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }

        // search for missing number
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j){      // case 1
                return j;
            }
        }
                    
        return nums.length;    // case 2
    }

    //program to swap 
    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}