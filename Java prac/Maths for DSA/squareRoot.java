// time complxity: O(log N)

public class squareRoot {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;        // precision
        System.out.printf("%.3f", sqrt(n, p));   // for only 3 digits after decimal
    }

    static double sqrt(int n, int p){
        int s = 0;
        int e = n;

        double root = 0.0;

        // now apply simple binary search
        while(s <= e){
            int m = s + (e-s)/2;    // find mid

            if(m*m == n){
                root = m;
                return m;
            }
            if(m*m > n){
                e = m-1;
            }
            else{
                s = m+1;
            }
        }

        // some increments in root to get precise answer
        double incr = 0.1;
        for (int i = 0; i < p; i++) {

            while(root*root <= n){
                root += incr;
            }

            root -= incr;     // if the while loop terminates then there is the increment in root which makes it grater than n, hence reduce the increment
            incr /= 10;       // for more precision update incr
        }

        return root;
    }
}
