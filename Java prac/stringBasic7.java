// String Methods

import java.util.Arrays;

public class stringBasic7 {
    public static void main(String[] args) {
        String name = "Bhavya Singhal";
        System.out.println(Arrays.toString(name.toCharArray()));    // it converts string to the character array
        System.out.println(name.toLowerCase());     // it converts string to the lowercase but not edit the real string
        System.out.println(name);
        System.out.println(name.indexOf('a'));    // give the index of first occurance
        System.out.println("    singhal    ".strip());    // it removes the extra space
        System.out.println(Arrays.toString(name.split(" ")));   // it cut the string at the point it gets space and storeit in array
    }
}
