// program to find multiples and factors of a number
// the standard method also creates repeatation as 20%4 = 5*4 and also 20%5 = 5*4 which creates repeatation hence we use 

import java.util.ArrayList;

public class Multiples_Factors {
    public static void main(String[] args) {
        facts(10);
        facts1(20);
        facts2(20);
    }


    // O(N)
    static void facts(int n){
        for (int i = 1; i <= n; i++) {
            if(n%i == 0){
                System.out.println(i + " ");
            }
        }
    }


    // O(sqrt(N))
    // now it only prints the single pair of factor don't repeat them
    static void facts1(int n){
        for (int i = 1; i <= Math.sqrt(n); i++) {

            if(n%i == 0){
                if (n/i == i) {              // means that i is aquare of n hence print it only once
                    System.out.println(i);
                }
                else{
                    System.out.println(i + " " + n/i);
                }
            }
        }
    }


    // above one gives factor not in sorted manner, hence it is the program which gives us answer in sorted array
    static void facts2(int n){

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {

            if(n%i == 0){
                if (n/i == i) {    
                    System.out.println(i + " ");
                }
                else{
                    System.out.println(i + " ");
                    list.add(n/i);      // in this array the second half will store as in descending order
                }
            }
        }

        // to print all the second halfs in ascending order
        for (int i = list.size() - 1; i >= 0 ; i--) {         // condition applies upto the 0th index of list
            System.out.println(list.get(i) + " ");
        }
    }
}

