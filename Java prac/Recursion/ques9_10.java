// in this ques we count the number of zeros in a digit
// ques 10 is to count steps: given a number 'n' and you have to give in how many steps does it give 0; if the num is even then divide it by 2 or odd the subtract 1 then divide by 2


public class ques9_10 {
    public static void main(String[] args) {

        System.out.println(countZero(302000507));
        System.out.println(countStep(41));

    }


    // ques9 : count the number of zeros in a digit 
    static int countZero(int n){
        return helper(n, 0);      // initially the count is 0
    }

    private static int helper(int n, int c){
        if(n == 0){       // if the n is empty
            return c;
        }

        int rem = n % 10;
        if(rem == 0){
            return helper(n/10, c+1);     // n ki ek digit reduce ke denge and count += 1
        }

        return helper(n/10, c);       // above updation will occur only when we get 0, otherwise there is only update in 'n'
    }


    // ques10: count steps
    static int countStep(int n){
        return hp(n, 0);      // initially the number of steps are 0
    }

    private static int hp(int n, int step){
        if (n == 0){
            return step;       // return number of steps
        }

        if (n%2 == 0){
            return hp(n/2, step+1);      // for a even num apply this operation
        }
        return hp(n-1, step+1);          // for a odd num apply this operation
    }

}
