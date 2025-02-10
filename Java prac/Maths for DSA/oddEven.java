public class oddEven {
    public static void main(String[] args) {
        int n = 68;
        System.out.println(isOdd(n));
    }

    private static boolean isOdd(int n){
        return (n&1) == 1;  // if two inputs are 1 then their & operation provide 1, if it is one then number is odd otherwise even 
    }
}
