// in this question we are trying to find nth magic num , as in this for a num find it as the power of 5
/* ex: 1 = oo1 as binary, now for magic num 5^3+5^2+5^1 there is only 5^1 exist because only for that binary of 1 is 1 hence it's magic num is 5
   ex: 3 = 011 as binary, now for magic num 5^3+5^2+5^1 there is only 5^2+5^1 exist because only for that binary of 3 is 1 hence it's magic num is 30
*/

public class n_thMagicNum {
    public static void main(String[] args) {
        int n = 1;   // iska hm magic num find krre h
        int ans = 0;  // initialize the ans variable
        int base = 5;  // base initialize 5 because we have to find pow of 5
        
        while(n>0){
            int last = n&1;   // it gives us the last because on and it with n if it only it 1 then it give 1
            n = n >> 1;       // right shift for the change in n
            ans += last*base;  // base ko ans m add krte jaynge
            base = base*5;     // base ki pow increement hoti jaygi
        }
        System.out.println(ans);
    }
}
