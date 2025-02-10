// https://leetcode.com/problems/find-the-duplicate-number/ 
// ques 3 from cyclic sort video of kunal kushwaha
// here we are finding duplicate number

public class findDuplicateCyclicSort {
    public static void main(String[] args) {
        
    }

    public int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length){

            if(nums[i] != i+1){
                int correct = nums[i] - 1;
                if(nums[i] != nums[correct]){
                    swap(nums, i, correct);
                }
                else{
                    return nums[i];
                }
            }
            else{
                i++;
            } 
        }
        return -1;
    }

    //program to swap 
    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}
