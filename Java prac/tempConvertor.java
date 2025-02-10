import java.util.Scanner;

public class tempConvertor{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);  
        System.out.print("Please enter temp in Celcius: ");
        float tempC = in.nextFloat();
        float tempF = (tempC * 9/5) + 32;
        System.out.println(tempF);

        in.close();  // we use close to protect our data from leak
    }
}