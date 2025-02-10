import java.util.Scanner;

public class countOccurance{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Any number: ");
        int n = input.nextInt();
        System.out.print("Number to find: ");
        int b = input.nextInt();

        int count=0;
        while(n>0){
            int rem = n%10;
            if(rem == b){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
        
        input.close();   // we use close to protect our data from leak
    }
}