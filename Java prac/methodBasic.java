// DRY: Don't Repeat Yourself
// functions in a class is called method 
// this is the example program for methods as using the sum example

// about the term "scope" in java, agr aapne koi cheeze bracket(block) ke bahar initialise ki h mtlb int a or something else toh hm usse bracket ke andar use kr skte h pr agr hm koi cheeze bracket(block) ke andar initialise karenge toh usse bracket ke bahar nhi use kr skte isse hi scoping kehte h

import java.util.Scanner;

public class methodBasic {
    public static void main(String[] args) {
        sum();  // calling the method
        
    }
    static void sum(){   // it is the method of sum
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int n1 = input.nextInt();
        System.out.print("Enter 2nd number: ");
        int n2 = input.nextInt();
        int sum = n1 + n2;
        System.out.println("The sum = "+sum);

        input.close();
    }
}
