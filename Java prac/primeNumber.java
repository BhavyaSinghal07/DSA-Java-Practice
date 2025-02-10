import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        boolean ans = isPrime(n);
        System.out.println(ans);

        input.close();
    }

    static boolean isPrime(int n){

        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c <= n){
            if(n%c == 0){
                return false;
            }
            c++;
        }

        return c*c > n;  //it will return true if c*c>n otherwise return false, we can also write this statement in the form of if and else
    }
    
}
