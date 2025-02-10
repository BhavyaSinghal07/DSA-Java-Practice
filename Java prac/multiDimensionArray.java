// 2D array (matrics) : arrays of array
// if i find the data of arr[1][0] then if give the 1st element fron the array i.e. on the index 1 of the arr

/* Note: it is not compulsory to define the size of column whereas number of rows is mandatory because a array can be as:
    [  [1,2,3,4]
       [4,5]
       [6,7,8]   ]
   because it contains constant no of rows but variable number of columns
*/

import java.util.Arrays;
import java.util.Scanner;

public class multiDimensionArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


    // syntax to creating a 2D array
        int[][] arr = new int[3][2]; 
        // output of 2D array
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));  // another shortest and simplest way to print matrix
        }  


    System.out.println();    // just to get the gap between two matrices
    // or directly
        int[][] arr1 = {
            {1, 2, 3},
            {3, 4, 5},
            {5, 6, 7},
        };
        // output of directly formed 2D array
        for (int row = 0; row < arr1.length; row++) {
            System.out.println(Arrays.toString(arr1[row]));  // another shortest and simplest way to print matrix
        }


    System.out.println();    // just to get the gap between two matrices
    // variable no of column example
        int[][] arr2 = {
            {1, 2, 3, 8, 9},
            {3, 4, 5},
            {5, 6, 7, 4},
        };
        // output of the variable no of column matrix
        for (int row = 0; row < arr2.length; row++) {
            System.out.println(Arrays.toString(arr2[row]));  // another shortest and simplest way to print matrix
        }


    System.out.println();    // just to get the gap between two matrices
    // taking input for 2D array using for loop
        int[][] arr3 = new int[3][3]; 

        System.out.println("Enter the elements of the 2D array for 3x3 matrix: ");
        for (int row = 0; row < arr3.length; row++) {
            // for each column in every row we take input with the help of for loop
            for (int col = 0; col < arr3[row].length; col++) {    // size of the particular row
                arr3[row][col] = input.nextInt();
            }
        }

        // output of that above 2D array
        for (int row = 0; row < arr3.length; row++) {
            for (int col = 0; col < arr3[row].length; col++) {
                System.out.print(arr3[row][col] + "  ");
            }
            System.out.println();   // for the new line after each row
        }

        input.close();
    }
}
