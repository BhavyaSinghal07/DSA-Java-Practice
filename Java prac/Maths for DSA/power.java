// this ques find the value of a number after apply power on that

public class power {
    public static void main(String[] args) {
        int base = 3;
        int power = 6;
        int ans = 1;

        while(power > 0){

            if((power & 1) == 1){    // agr & apply krke 1 milega toh mtlb koi value h jiski power nikalni h 
                ans *= base;         // base store krte rhenge as ans in ans variable
            }

            base *= base;         // multipying base by number of times as the power of base
            power = power >> 1;   // apply right shift on binary of power
        }

        System.out.println(ans);

    }
}
