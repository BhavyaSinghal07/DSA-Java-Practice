// In this question we find a number occur only once and ignore others which occur twice
// note: this array only contains once or twice occuring numbers

public class oneTimeAppear {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,5,4,3,2};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr){
        int unique = 0;

        for(int n : arr){
            unique ^= n;  
        }
        return unique;
    }
}
