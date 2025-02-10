// (leetcode problem) program to find the even number of digit from the collection of element in the array
// ex:  num= {12,123,1234,45}; this program return 2 because there is only 2 elements which contain even number of digits

public class evenNoDigit {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumber(nums));
    }


    // count number of digits in a number
    static int digits(int num){

        if(num <0){            // if any digit is -ve it converts it in +ve
            num = num * -1;
        }

        int count = 0;
        while (num > 0){    // it checks for each particular number
            count ++;
            num = num/10;   
        }
        return count;
    }

    
    // now create a function to check whether a number contains even digits or not
    static boolean even(int num){

        int numberOfDigits  = digits(num);
        if (numberOfDigits % 2 == 0) {     // jo uppr individual digit ka count aaya h usse 2 se divide krke check kareha ki vo even h ya nhi
            return true;
        }
        return false;
    }


    // it count that how many num does nums contain i.e. even digit
    static int findNumber(int[] nums){
        int count = 0;
        // for each loop
        for (int num : nums) {
            if(even(num)){
                count ++;
            }
        }
        return count;     // vo jo even function h usse use keke ye count krta rahega ki kitne num h jo even h or hume final output dega
    }
    
}
