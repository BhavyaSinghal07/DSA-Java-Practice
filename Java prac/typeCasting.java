// type casting is basically to convert one datatype in other datatype
// for changing the large data type in small data type we use type casting because if if we give int value and want float then it can automatically convert it but if we give float and want int then there is a need if typecasting in it 

import java.util.Scanner;
public class typeCasting{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // float num = input.nextInt();    it automatically converts it into float
        int num = (int)(input.nextFloat());  // this is used to take input of float we can replace it by any other value without take input 
        System.out.println(num);
        
        /* int num1 = (int)(79.04);
           System.out.println(num1);  */


        // automatic type promotion 
        byte a = 1;
        byte b = 10;
        int c = a + b;  // while we are performing any expression on byte datatype then it aitomatically converts into int datatype
        System.out.println(c);

        /* byte b = 50;
           b = b * 2;    it doesn't work because noe it is int and we don't assign it byte */


        // example to clear all doubts
        byte t = 42;
        char h = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f*t)+(i/h)-(d-s);
        System.out.println((f*t)+"  "+(i/h)+"  "+(d-s));
        System.out.println(result);

        input.close();   // we use close to protect our data from leak
    }
}