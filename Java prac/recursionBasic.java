// Recursion: a function is calling itself again and again
// base condition is the condition in the recursion at which the program will terminate
/* need of recursion: => it helps us in solving complex problem in a simpler way, 
   => we can convert recursion functions into iteration(loops) and vice versa
   => space complexity is not constant because of recursive calls 
   => it helps us in breaking down bigger problems into smaller problems
*/

/* Dynamic programming: I this type function does not evaluate same recursive part again and again this helps to reduce time complexity */

/* How the function calls work in language:
   => while the func. is not finish executing it will remain in stack
   => one by one each function go into the stack and after execution they pop one by one
*/


public class recursionBasic {
    public static void main(String[] args) {
        // write a function that takes a number and print it 
        // print first 5 numbers: 1 2 3 4 5
        // without the use of loops, don't repeat same method
        // use the method of calling function 

        print1(1);

        print(1);
    }


    // example of a function is calling another function and so on
    static void print1(int n){
        System.out.println(n);
        print2(2);      // it calls the next function/method 
    }
    static void print2(int n){
        System.out.println(n);
        print3(3);      // it calls the next function/method 
    }
    static void print3(int n){
        System.out.println(n);
        print4(4);      // it calls the next function/method 
    }
    static void print4(int n){
        System.out.println(n);
        print5(5);      // it calls the next function/method 
    }
    static void print5(int n){
        System.out.println(n);
    }


    // for recursion we write this instead of above code
    static void print(int n){
        if(n == 5){         // this is the base condition
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n+1);
    }

}
