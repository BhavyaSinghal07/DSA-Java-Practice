// in this ques we find the num of digit in base b
/* formula used: log a = x where log's base is b
   above log formula become a=b^x
*/

/* formula used: int(log n)+1 where log's base is b
   above log formula become: log a (where log's base is b) = log a / log b  (where log's base is x)
*/

public class noOfDigit {
    public static void main(String[] args) {
        int n = 10;
        int b = 2;
        int ans = (int)(Math.log(n) / Math.log(b)) + 1;
        System.out.println(ans);
    }
}
