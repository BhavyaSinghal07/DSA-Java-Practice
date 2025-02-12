// in this ques we find XOR between two range as XOR of 0^1^2^3^4 is 4


public class RangeXOR {
    public static void main(String[] args) {

        // range XOR for a, b = XOR(b) ^ XOR(a-1)
        int a = 3;
        int b = 9;
        int ans = XOR(b) ^ XOR(a-1);
        System.out.println(ans);

    }
    
    // this give XOR from 0 to a
    static int XOR(int a){
        if (a % 4 == 0){
            return a;
        }

        if (a % 4 == 1){
            return 1;
        }

        if (a % 4 == 2){
            return a+1;
        }

        return 0;
    }
}
