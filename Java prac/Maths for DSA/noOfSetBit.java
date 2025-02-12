// in this question we find the number of set of bits in it
/* ex: n = 9; => n= 1001 then it contain 2 set of bit
   basically gives the number of 1 in binary number
*/

public class noOfSetBit {
    public static void main(String[] args) {
        int n = 45;
        System.out.println(Integer.toBinaryString(n));    // converts a num integer to binary

        System.out.println(countBit(n));
    }

    private static int countBit(int n){
        int count = 0;
        
        while (n>0){
            count++;
            n -= (n & -n);  

           // n = n & (n-1);     ye bhi use kr skte h uppr vaale formule ki place pr
        }

        return count;
    }
}
