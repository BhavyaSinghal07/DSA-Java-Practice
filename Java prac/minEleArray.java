// it will return the minimum element in the array

public class minEleArray {
    public static void main(String[] args) {
        int[] arr = {18, 78, -1, -4, 34};
        System.out.println(min(arr));
    }

    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
