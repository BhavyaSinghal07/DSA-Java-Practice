import java.util.Scanner;
public class nestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Employ ID: ");
        int empID = input.nextInt();
        System.out.print("Enter Department of Employ: ");
        String department = input.next();

        switch (empID) {
            case 1:
                System.out.println("Bhavya Singhal");
                break;
            case 2:
                System.out.println("Khushi Gupta");
                break;
            case 3:
                switch (department) {
                    case "AI":
                        System.out.println("Artificial Intelligence");
                        break;
                    case "AIML":
                        System.out.println("Artificial Intelligence with Machine Learning");
                        break;
                    default:
                        System.out.println("Enter valid input");
                }
                break;
                
            default:
                System.out.println("Enter valid input");
        }

        input.close();
    }
}
