// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/      (google)
// ques 2 from cyclic sort video of kunal kushwaha

import java.util.ArrayList;
import java.util.List;

public class disappearedNumCyclicSort {
    public static void main(String[] args) {
        
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }

        // just find missng numbers
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index+1){    // ex: index 4 pr 5 hona chahiye toh yaha hm index+1 isliye krre h taaki index 5 se match kr ske
                ans.add(index+1);
            }
        }
        return ans;
    }

    //program to swap 
    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}
