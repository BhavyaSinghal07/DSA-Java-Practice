// it prints all the 3 digit armstong number

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//      System.out.print("Enter a number: ");
//      int n = input.nextInt();

//      boolean ans = isArmstrong(n);
//      System.out.println(ans);      this will only check a particular number

        // this gives all the armstrong numbers
        for(int i=100; i<1000; i++){
            if(isArmstrong(i)){
                System.out.print(i + "  ");
            }
        }

        input.close();
    }

    static boolean isArmstrong(int n){
        int m = n;
        int sum = 0;

        while(n>0){
            int rem = n%10;
            sum = sum + rem*rem*rem;
            n = n/10;
        }
        
        return sum == m;  //it will return true if sum == m otherwise return false, we can also write this statement in the form of if and else
    }
}
