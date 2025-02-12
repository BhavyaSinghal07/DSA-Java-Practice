// in this ques we have given a number and we have to check that it is power of two or not
/* in this process we know that 1000000 = 111111 & 1 as we discuss before we can get LHS with RHS
   if 1000000 is n then 111111 is (n-1)
   hence it shows that if [n & (n-1) == 0] then the num is pow of two

   Note: only one digit can be one in binary of that num hence it is pow of 2 otherwise not
*/

public class powOfTwo{
    public static void main(String[] args) {
        int n = 8;
        boolean ans = (n & (n-1)) == 0;
        System.out.println(ans);
    }
}