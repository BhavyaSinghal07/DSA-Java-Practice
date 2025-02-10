// Note: We can use .equals in place of == 

import java.util.Scanner;
public class switchBasic{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a fruit name: ");
        String fruit = input.next();
    
        // switch(fruit){
        //     case "Mango":
        //         System.out.println("King of fruits");
        //         break;
        //     case "Apple":
        //         System.out.println("Red fruit");
        //         break;
        //     case "Banana":
        //         System.out.println("Energetic fruit");
        //         break;
        //     case "Orange":
        //         System.out.println("Winter's fruit");
        //         break;
        //     default:
        //         System.out.println("Wrong input");
        // }

        //Note: We can write this code as this , here there is no need for break statement
        switch(fruit){
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("Red fruit");
            case "Banana" -> System.out.println("Energetic fruit");
            case "Orange" -> System.out.println("Winter's fruit");
            default -> System.out.println("Wrong input");
        }

        input.close();   // we use close to protect our data from leak
    }
}