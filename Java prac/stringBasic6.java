// String Builder Class
// this is mutable, this doesn't create new object it modifies previous data


public class stringBasic6 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder.toString());

        builder.deleteCharAt(7);     // delete the char at 7 index
        System.out.println(builder.toString());

        builder.reverse();    // it reverse the new string that form after deletion of 7th index element
        System.out.println(builder.toString());
    }
}
