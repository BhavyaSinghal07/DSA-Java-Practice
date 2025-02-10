// string performance
// in this type on each turn of loop series create a new object because here it is immutable
// there is a wastage of space occur hence it is bad way of concatenation
// we can solve this issue by using string builder class


public class stringBasic5 {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);   // this performs type casting that concatenates with number and convert it in char
            System.out.println(ch);
            series = series + ch;   // this also do the same thing as above but it concatenate all ch in same line
        }
        System.out.println(series);  
    }
}
