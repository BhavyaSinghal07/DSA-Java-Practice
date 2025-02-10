// ques 3 from the binary search interview questions video of kunal kushwaha where BS stands for binary search
// finding the smallest letter which is greater than target letter here we are finding the character according to it's ascii value
// in this question array is sorted in the ascending order
// in this ques we also focus on the letter wrap around : if the target is "z" but we have b,c,d in array then the answer is "b" because "b" is at 0th index we consider 0th index element as the ans, --> we are doing this with the help of % as (start = start % lenOfArray)


public class CellingOfLetter {
    public static void main(String[] args) {
        char[] letter = { 'c', 'd', 'f', 'j', 'l', 'm' };
        char ans = celling(letter, 'n' );

        System.out.println("Index of the smallest no > target element: " + ans);
    }

    // return the smallest letter > target element
    static char celling(char[] letter, char target){
        
        int start = 0;
        int end = letter.length - 1 ;

        while (start <= end) {
            // int mid = (start + end)/2;     there can be an error i.e. if (start+end) exceeds the range of the int then it might be show error
            // to resolve the above issue we did :
            int mid = start + (end - start) / 2;    // this is only the enhanced formula but does the same thing as the above formula

            if(target < letter[mid]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
            
        }

        // if the element does't find then it wraps the letter and returns the 0th index element
        return letter[ start % letter.length ] ;

    }

}
