// in this searching technique we take a first element of the array and compare it to the throughout to the length of the array and find the target element

public class linearSearch {
    public static void main(String[] args) {
        int[] num = {23,45,67,89,34,72,84};
        int target = 89;

        int ans = search(num, target);
        System.out.println(ans);
    }

    static int search(int[] arr, int target){

        // it checks that the array is null or not, if null then it returns -1
        if(arr.length == 0){
            return -1 ;
        }

        // it search the target in the array
        for (int i = 0; i < arr.length; i++) {             
            if(arr[i] == target){
                return i ;
            }
        }

        return -1 ;   // this will only execute when target doesn't found

    }
}
