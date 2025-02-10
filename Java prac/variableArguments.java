// Variable abd Arguments: method that takes variable number of arguments is called VarArga method basically in this we dont know the number of arguments we pass

import java.util.Arrays;

public class variableArguments {
    public static void main(String[] args) {
        fun(2,3,4,5,56,67,78,27);   // this is the data of the array
        multipleArgs(2, 3, "Bhavya", "Singhal", "anything");  // it automatically takes first two values as a and b
    }

    static void fun(int...v){   // any number of arguments 
        System.out.println(Arrays.toString(v));   // here we are making an array in which we dont't know the length of array
    }
    
    // key word arguments
    static void multipleArgs(int a, int b, String...v){  // variable argument must be the last argument while we calling multiple arguments 
        
    }
}
