// https://leetcode.com/problems/set-mismatch/
// ques 5 from cyclic sort video of kunal kushwaha
// in this question we have to give the number i.e. missing and repeated both
/* Working: => missing number = wrong index + 1
            => repeated number = no. at missing index
*/ 


public class setMismatchCyclicSort{
    public static void main(String[] args) {
        
    }

    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] -1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }

        // search for missing number and also return the repeated value
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j + 1){
                return new int[]{nums[j], j+1};    // {wrong index value, index+1}
            }
        }
        return new int[]{-1, -1};
    
    }

    //program to swap 
    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }


}