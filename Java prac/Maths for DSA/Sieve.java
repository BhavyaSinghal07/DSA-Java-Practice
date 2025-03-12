// Sieve of Eratosthenes

// question is based on that find aal the num less than n which are prime
// if a num is prime then all the multiples of num is not prime as: if 3 is prime then multiple of num is not prime, hence by avoiding multiples to check we can increase optimization of code
// here the time complexity is: O(N*log(log N))

public class Sieve {
    public static void main(String[] args) {
        int n = 40;
        boolean[] prime = new boolean[n+1];
        seive(n, prime);
    }

    // initially all the element are false, hence we let that the prime num is false and there multiples are true
    static void seive(int n, boolean[] prime){     // if a num is find to be prime then it stores in boolean array and then avoids all successive multiples of that num
        for (int i = 2; i*i <= n; i++) {

            if(!prime[i]){      // initially all num are false hence 
                for (int j = i*2; j <= n; j+=i) {      // usi false num ke multiples true krne ke liye
                    prime[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if(!prime[i]){                     // it print all those prime[i] which are false
                System.out.print(i + "  ");
            }
        }
    }
}
