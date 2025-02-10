// this ques is the part of string video of kunal kushwaha


public class palindrom {
    public static void main(String[] args) {
        String str = "asdhdsa";
        System.out.println(isPalindrom(str));
    }

    static boolean isPalindrom(String str){

        if(str == null || str.length()==0){    // agr string null or empty hoga toh bhi pallindrom hoga
            return true;
        }

        str = str.toLowerCase();
        for (int i = 0; i <= str.length()/2; i++) {

            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);   // end last element se decrease hota jayga jaise jaise i increase hoga

            if(start != end){
                return false;
            }
        }
        return true;
    }
}
