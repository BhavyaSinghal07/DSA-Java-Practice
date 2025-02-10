// every thing which we are using in the main function we have to make it static, this is the basic defination in brief we will discuss later in oops

// Shadowing: when we are using variable with the same name in the same scope then the higher level variable hides it's value and prints new value this is called shadowing

public class shadowing {
    
    static int x = 10;  //it is available for the block of x i.e. main block this is called scoping
    public static void main(String[] args) {
        System.out.println(x);  // this gives 10 and this will be shadowed for x = 40

        int x;  // this is called declaring
        // System.out.println(x);    this gives error because we don't initialise x we only declare the x

        x = 40;  // this is called initialising
        System.out.println(x);  // this gives 40

        fun();  
    }

    static void fun(){
        System.out.println(x);  // this gives 10 
    }
}
