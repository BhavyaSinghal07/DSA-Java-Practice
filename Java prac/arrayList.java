// in this you don't know the size of array

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ArrayList<datatype> variable_name = new ArrayList<datatype>(capacity);    this is the syntax of array list
        ArrayList<Integer> list = new ArrayList<Integer>(5);

        // it will add these items in the array no matters about the initial capacity
        list.add(45);
        list.add(64);
        list.add(68);
        list.add(49);
        list.add(70);
        list.add(24);

        System.out.println(list);   // to print the items that we add  in this list

        System.out.println(list.contains(68));   // to check that this list contains 68 or not

        list.set(0, 85);     // it will change the item on 0th index
        System.out.println(list);

        list.remove(2);      // it remove particular index element
        System.out.println(list);

        System.out.println(list.get(3));   // to get(print) particular index element

        
// taking input using for loop to form an array list
    System.out.println();      // just to get the new line between these arrays

        ArrayList<Integer> list1 = new ArrayList<Integer>(5);    // creating a new list
        System.out.println("Enter the element of array: ");
        for (int i = 0; i < 5; i++) {
            list1.add(input.nextInt());
        }
        System.out.println(list1);

        input.close();
    }
}
