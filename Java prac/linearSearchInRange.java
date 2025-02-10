public class linearSearchInRange {
    public static void main(String[] args) {
        int[] num = {23,45,67,89,34,72,84};
        int target = 72;

        int ans = search(num, target, 1, 3);
        System.out.println(ans);
    }

    static int search(int[] arr, int target, int start, int end){

        // it checks that the array is null or not, if null then it returns -1
        if(arr.length == 0){
            return -1 ;
        }

        // it search the target in the array
        for (int i = start; i <= end; i++) {             
            if(arr[i] == target){
                return i ;
            }
        }

        return -1 ;   // this will only execute when target doesn't found

    }
}
