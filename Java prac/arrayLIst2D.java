// multi-dimentional array list

import java.util.ArrayList;
import java.util.Scanner;

public class arrayLIst2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();   // it will only create the outer array list not those which are inside it
        
        // initializing the array list 
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());     // basically it forms the array list in the array list i.e. it creates small array list in a outer array list
        }
        // add elements
        System.out.println("Enter elements of 2D array list: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(input.nextInt());
            }
        }
        System.out.println(list);

        input.close();
    }
}
