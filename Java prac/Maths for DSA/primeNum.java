// there is no need to check for each n-2 num because it is obvious that if 3*12 = 36 = 12*3, hence it only increases the time complexity hence to reduce this we check only for [ num <= sqrt(n)]

public class primeNum {
    public static void main(String[] args) {
        int n = 13;
        for (int c = 1; c <= n; c++) {
            System.out.println(c + " is a prime num: " + isPrime(c));
        }
    }

    static boolean isPrime(int n){

        if(n <= 1){
            return false;
        }
        
        int i = 2;
        while(i*i <= n){
            if(n%i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
