import java.util.Scanner;
public class calculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int ans=0;
        while(true){
            System.out.print("Enter a operator: ");
            char op = input.next().trim().charAt(0);   // it is used to check the 0th indec character
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%' )    

            System.out.println("Input two numbers: ");
            int n1 = input.nextInt();
            int n2 = input.nextInt();

            if(op == '+'){
                ans = n1 + n2;
            }
            else if(op == '-'){
                ans = n1 - n2;
            }
            else if(op == '*'){
                ans = n1 * n2;
            }
            else if(op == '/'){
                ans = n1 / n2;
            }
            else if(op == '%'){
                ans = n1 % n2;
            }
            else{
                System.out.println("Wrong input");
                break;
            }

        System.out.println(ans);
        }

        input.close();   // we use close to protect our data from leak
    }
}