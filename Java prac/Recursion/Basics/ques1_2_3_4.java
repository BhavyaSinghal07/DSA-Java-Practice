// in this question we print the num from n to 1 and 1 to n using recursion approach
// ques 3 to print the factorial of a num
// ques 4 to print the sum of a n num


public class ques1_2_3_4 {
    public static void main(String[] args) {
        nto1(5);
        pass(5);
        oneToN(5);
        
        System.out.println(factorial(5));
        System.out.println(sum(5));
    }


    // ques1: print num from n to 1
    static void nto1(int n){
        if(n==0){
            return;      // not do anything just return, this is the base condition
        }
        System.out.println(n);     // we apply print operation first hence it give output in reverse order
        nto1(n-1);
    }


    // concept of passing a number
    static void pass(int n){
        if(n==0){
            return;    
        }
        System.out.println(n);    
        // pass(n--);     this only pass or prints 5 multiple times, because it pass the value first then subtrat it
        pass(--n);        // here this works as it subtracts the value then pass the n 
    }


    // ques2: print num from 1 to n
    static void oneToN(int n){
        if(n==0){
            return;      // not do anything just return, this is the base condition
        }
        oneToN(n-1);
        System.out.println(n);     // here we apply print operation later the main operation, hence it first find all the numbers for func call then prints the last call first and proceed in this sequence
    }


    // ques3: to get the factorial of a num
    static int factorial(int n){     // here we use int in place of void because we want an integer from function
        if(n <= 1){
            return 1;      
        }
        return n*factorial(n-1);
    }


    // ques4: to get the sum of a n num
    static int sum(int n){     // here we use int in place of void because we want an integer from function
        if(n <= 1){
            return 1;      
        }
        return n + sum(n-1);
    }

}
