/* 1. In java array object are in heap
   2. Heap objects are not continuous
   3. Dynamic memory allocation
    hence the elements of the array store in java are not in continuous memory allocation
*/

import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // datatype[] variable_name = new datatype[size];    It is the syntax to create the array
        int[] arr = new int[5];   // new is used to create an object

        // or directly
        int[] arr1 = {21, 34, 45, 12, 56};
        System.out.println(Arrays.toString(arr1));    // it prints the whole array

        // using for each loop 
        System.out.print("Enter 5 elements: ");
        for(int i=0 ; i<arr.length; i++){
            arr[i] = input.nextInt();
        }

        for (int i : arr) {    
            System.out.print(i + "  ");
        }

        input.close();
    }
}
