// "String" is a most used class of java
/* String a = "kunal";
   String b = "kunal"; 
*/
/* String pool: it is a seperate memory structure inside a heap memory, all the similar values inside a pool are not recreated hence both a,b are pointing to the same kunal
                it makes the program more optimistic
                we can't change the data/object of a variable because in java strings are immutable i.e. we can't change object after initialize them 
                for security reasons strings are immutable
                we can't change the data/object but we can create a new object through this we can overcome the immutable issue
*/


public class stringBasic1 {
    public static void main(String[] args) {
        String a = "Bhavya";
        String b = "Bhavya";
        System.out.println(a);
        System.out.println(b);

        System.out.println(a==b);    // abhi yaha a,b same object ko point krre h

        a = "Singhal";          //here we are creating a new object through this we can overcome the immutable issue
        System.out.println(a);
        System.out.println(b);  // it doesn't change because we create new object of "a" not edit the previous one

        System.out.println(a==b);    // a ka object change krdiya tha isliye false dera h



/*  Comparison of String: == method  {true, if both are pointing to the same object
                                      false, if both are pointing to the diff object}
                          .equals method   {it only compares the value no matters both are pointing to same or not}


    how to create a diff object of same value: String a = new String("Bhavya);
                                               String b = new String("Bhavya);
        this creates the value outside the pool but inside the heap and both are pointing to the diff Bhavya
*/

        String A = new String("Kunal");
        String B = new String("Kunal");

        System.out.println(A==B);
        System.out.println(A.equals(B));

        System.out.println(A.charAt(1));    // this method give the char at the index value

    }
}
