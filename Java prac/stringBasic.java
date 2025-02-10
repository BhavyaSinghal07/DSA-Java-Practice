import java.util.Scanner;

public class stringBasic {
    public static void main(String[] args) {
        // String message = greet();
        // System.out.println(message);
 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.next();
        String personalised = myGreet(name);
        System.out.println(personalised);

        input.close();
    }
    static String myGreet(String name){
        String message = "Hello "+name;
        return message;
    }

    static String greet(){
        String greeting = "How are you ? ";
        return greeting;
    }
}
