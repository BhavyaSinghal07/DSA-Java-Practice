// pass the value of numbers when you are calling the method in main()
public class methodBasic1 {
    public static void main(String[] args) {
        int ans = sum(20,30);
        System.out.println("Sum is "+ans);
    }
    static int sum(int a, int b){
        int sum = a+b;
        return sum;
    }
}
