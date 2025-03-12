// root = sqrt(x+(n/x))/2,  where x is the guess root as approx the sqrt of n
// time complexity: O((log N) F(N)), where F(N) is cost of calculating f(n)/f'(n) with n-bit precision


public class newtonRaphson {
    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }

    static double sqrt(double n){
        double x = n;
        double root;

        while(true){
            root = 0.5 * (x + (n/x));
            if (Math.abs(root - x) < 0.5) {        // precision only allow upto 0.5
                break;
            }
            x = root;
        }
        return root;

    }
}
