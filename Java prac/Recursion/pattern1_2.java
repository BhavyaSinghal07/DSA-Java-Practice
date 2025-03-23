// ques 1: prints reversed right angle triangle
// ques 2: prints simple right angle triangle


public class pattern1_2 {
    public static void main(String[] args) {

        pattern(4, 0);        // starting to print it as taking row seq 4 to 1
        pattern1(4, 0);

    }


    // ques 1:
    static void pattern(int r, int c){
        if (r == 0){
            return;
        }

        if (c < r){
            System.out.print("*");
            pattern(r, c+1);         // jaise jaise ye star print krta rahega, value of c will increases and initially r will be given value
        }
        else{
            System.out.println();
            pattern(r-1, 0);       // as it changes the line the value of r will decreases and value of c will increases
        }
    }


    // ques 2:
    static void pattern1(int r1, int c1){
        if (r1 == 0){
            return;
        }

        // in this it first recursively calls all the calls and store it in the stack memory and then after calling all calls it will prints the str through the reverse recursive calls
        if (c1 < r1){
            pattern1(r1, c1+1); 
            System.out.print("*");
        }
        else{
            pattern1(r1-1, 0);
            System.out.println();
        }
    }

}
