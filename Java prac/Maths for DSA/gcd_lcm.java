// program to find out gcd and lcm
// gcd => greatest num which divides both a,b
// lcm => smallest num which is divisible by both a,b

/* let's say we've a,b and d = gcd(a, b)
   f = a/d, g = b/d which becomes a = fd, b = gd
   LCM(a, b) = c then it shoud also equals to LCM(fd, gd) = c 
   lcm = f*g*d
   => Also the fact is that f, g will not have any common factor
      ex: a = 9, b = 18 hence gcd = 9 = d
      then f = 1, g = 2, where both f, g don't have any common factor

   => formula: a*b = lcm * hcf
      as a*b = fd * gd = d * fgd,  where d=hcf, lcm = fgd
*/


public class gcd_lcm {
    public static void main(String[] args) {
        System.out.println(gcd(4, 8));
        System.out.println(lcm(4, 8));
    }

    // recursive approach to find gcd of two num
    static int gcd(int a, int b){       
        if(a == 0){
            return b;
        }
        return gcd(b%a, a);
    }


    static int lcm(int a, int b){
        return a*b / gcd(a,b);
    }
}
