// two or more functions of the same name can exist if the datatype or the number of parameters are different this concept is called overloading

public class overloading {
    public static void main(String[] args) {
        fun(79);  // here we are providing integer hence it can automatically determines which function we are calling
        fun("bhavya");  // here we are providing string hence it can automatically determines which function we are calling
    }

    static void fun(int a){
        System.out.println(a);
    }
    
    static void fun(String a){
        System.out.println(a);
    }
}
// here two function have same name fun() but different datatype of parametes hence overloading works 
