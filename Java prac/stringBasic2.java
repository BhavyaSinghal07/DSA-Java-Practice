// println converts all type of in string on appling (.toString) method wether it is integer, array, string or any

import java.util.Arrays;

public class stringBasic2 {
    public static void main(String[] args) {
        System.out.println(7);
        System.out.println("bhavya");

        System.out.println(new int[]{7, 9, 4, 24});
        System.out.println(Arrays.toString(new int[]{7, 9, 4, 24}));  // it takes it's own method to convert it in string

        String a = null;
        System.out.println(a);
    }
}
