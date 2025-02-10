//  https://leetcode.com/problems/split-array-largest-sum/
//  ques 11 from the binary search interview questions video of kunal kushwaha where BS stands for binary search
//  leetcode Google level problem: split array largest sum
//  in this question we have to divide the array in the given "m" numbers, after forming sub-array you have to give the smallest sum of these diff. possible arrays i.e. jb m sub- array ka sum karungi toh unn sb possible outcome m phle largest ka sum dekhungi phir ye jo sum aaynge unm sbse km jo hoga vo ans h 

//here the max ans can be the sum of all the elements in array and the min ans can be the largest elements of the array
// here we are going to search in a particular range and find mid hence we apply binary search for this question

/*  how to solve the problem :
    => find the mid as taking the { mid = (max ans + min ans)/2 }
    => now compare that mid as with other elements of array as can their sum give the other possible min ans
 */


public class SplitArrayLargestSum {
    public static void main(String[] args) {
        
    }

    public int SplitArray(int[] nums, int m){
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);   // in the end of the loop this will contain the max item of the array
            end += nums[i];
        }

        // binary search
        while (start < end) {
            // try for the middle as potential ans
            int mid = start + (end - start) / 2;

            // calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;  // initially

            // creating the possible sub-array
            for(int num : nums) {    // every num in mums
                if (sum + num > mid) {
                    // you cannot add this in this subarray, make new one
                    // say you add this num in new subarray, then sum = num
                    sum = num;
                    pieces++;
                }
                else {
                    sum += num;
                }
            }

            // compare it with number of pieces as given in question and make the new possible start value to create new sub-array
            if (pieces > m) {
                start = mid + 1;
            }
            else {
                end = mid;
            }

        }

        return end; // here start == end
    }

}


