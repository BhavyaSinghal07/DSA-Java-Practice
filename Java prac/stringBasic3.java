// pretty printing: to get particular length output, for example input a large value but print only 2 digits of that after decimal
// it also provide the estimated value
// printf: formatted string
// placeholder: %s, %f, %d, %t, %e, %o, %x, %u  e.t.c


public class stringBasic3 {
    public static void main(String[] args){
        float a = 432.87654f; 
        System.out.printf("Formatted value is %.2f", a);   // to print only 2 digit after decimal we use %.2f and for others we use accordingly

        System.out.println(); // for next line
        System.out.printf("Pie: %.3f", Math.PI);

        System.out.println();
        System.out.printf("Hello my name is %s and surname is %s", "Bhavya", "Singhal");
    }
}
