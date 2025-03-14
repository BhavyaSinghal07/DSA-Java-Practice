// in this question we do sum of digits as: if n = 1234 then the sum of digits is 1+2+3+4 = 10
// ques 6 to get product of digit
// ques 7 to get the reverse of a number
// ques 8 to check pallindrom


public class ques5_6_7_8 {
    public static void main(String[] args) {
        System.out.println(sum(1235));
        System.out.println(product(1235));

        reverse1(1234);
        System.out.println(s);

        System.out.println(reverse2(1234));

        System.out.println(palin(121));    // because the main function which gives true or false is named as palin
    }


    // ques5: to get the sum of digits of num
    static int sum(int n){
        if (n == 0) {
            return 0;
        }
        
        return sum(n/10) + (n%10);
    }


    // ques6: to get the product of digits of num
    static int product(int n){
        if (n%10 == n) {       // if there is only one digit remain then it returns only that digit
            return n;          // because if it returns 0 then whole answer will be 0
        }
        
        return product(n/10) * (n%10);
    }


    // ques7(1): to get the reverse of a num
    // this is not the pure recursion program because i use extra variable as 's'
    static int s = 0;
    static void reverse1(int n){
        if(n==0){
            return;
        }

        int rem = n%10;
        s = s*10 + rem;
        reverse1(n/10);
    }


    // ques7(2): to get the reverse of a num
    // by adding the base condition wemake it pure recursive program 
    static int reverse2(int n){
        // sometimes you need some extra varibale in a function so that you can make a new helper function
        int digit = (int)(Math.log10(n)) + 1;
        return helper(n, digit);
    }

    private static int helper(int n, int digit){
        if(n%10 == n){
            return n;
        }
        int rem1 = n % 10;
        return rem1 * (int)(Math.pow(10, digit-1)) + helper(n/10, digit-1);
    }


    // ques8: to check pallindrom
    static int rev(int n){
        // sometimes you need some extra varibale in a function so that you can make a new helper function
        int digit = (int)(Math.log10(n)) + 1;
        return hp(n, digit);
    }

    private static int hp(int n, int digit){
        if(n%10 == n){
            return n;
        }
        int rem1 = n % 10;
        return rem1 * (int)(Math.pow(10, digit-1)) + hp(n/10, digit-1);
    }

    static boolean palin(int n){
        return n == rev(n);
    }

    
}
