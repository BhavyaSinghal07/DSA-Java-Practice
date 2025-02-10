import java.util.Scanner;

public class sum{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);  // to take input fron system
        int num1 = input.nextInt();  // Int is used for integer value
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum = "+ sum);

        input.close();   // we use close to protect our data from leak
    }
}