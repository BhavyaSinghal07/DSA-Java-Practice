// string operators

import java.util.ArrayList;

public class stringBasic4 {
    public static void main(String[] args) {
        System.out.println('a'+'b');   // add the ascii value of char because it is not a string
        System.out.println("a"+"b");   // add char (concatenation) because here we use string
        System.out.println('a'+3);
        System.out.println((char)('a'+3));   // type casting 
        System.out.println("a"+3);   // integer will convert into Integer i.e. .toString and then concatenate with string
        System.out.println("a"+'a');

        System.out.println("Bhavya" + new ArrayList<>());
//      System.out.println("Bhavya" + new Integer(07));

    }
}
