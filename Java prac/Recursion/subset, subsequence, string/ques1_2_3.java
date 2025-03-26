// These questions are based on the string problems
// ques 1: (Skip Character)=> in this question we are removing a character from a string
// ques 2: (Skip String)=> in this question we are removing a string from a string
// ques 3: skip a string when it's not equals to string, ex: if we don't get 'apple' string then we can skip the 'app' string or it we get apple the we don't skip app


public class ques1_2_3 {
    public static void main(String[] args) {

        skip("", "bhavya");              // initially p is empty

        System.out.println(skip1("bhavya"));

        System.out.println(skipApple("bhaapplevya"));

        System.out.println(skipAppNotApple("bhaapplevya"));     // doesn't skip app because there is apple present
        System.out.println(skipAppNotApple("bhaappvya"));       // skip app because no apple present
    }


    // ques1: method 1 to aolve this problem
    static void skip(String p, String up){    // string p is ans and string up is string on which we apply operation
        if(up.isEmpty()){                     // base condition: if the up is empty then it prints the p as ans
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            skip(p, up.substring(1));        // if 'a' found then it doesn't add it in ans and shift pointer on up upto next char
        }
        else{
            skip(p + ch, up.substring(1));   // if 'a' doesn't found it add ch char in ans and shift pointer on up upto next char
        }

    }


    // ques1: method 2 to aolve this problem
    static String skip1(String up){      // string up is string on which we apply operation
        if(up.isEmpty()){                // base condition: if the up string is empty then it returns the required sring 
            return " ";
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            return skip1(up.substring(1));        // if 'a' found then it doesn't add it in ans and shift pointer on up upto next char
        }
        else{
            return ch + skip1(up.substring(1));   // if 'a' doesn't found it add ch char in ans and shift pointer on up upto next char
        }

    }


    // ques2: method 2 to aolve this problem
    static String skipApple(String up){      // string up is string on which we apply operation
        if(up.isEmpty()){                // base condition: if the up string is empty then it returns the required sring 
            return " ";
        }

        if (up.startsWith("apple")) {
            return skipApple(up.substring(5));        // if 'apple' found then it doesn't add it in ans and shift pointer on up upto next 5 char to skip apple string
        }
        else{
            return up.charAt(0) + skipApple(up.substring(1));   // if 'apple' doesn't found it add char at 0 index in ans and shift pointer on upstring upto next char
        }

    }


    //ques3: it only skip the app if it is not apple
    static String skipAppNotApple(String up){      // string up is string on which we apply operation
        if(up.isEmpty()){                // base condition: if the up string is empty then it returns the required sring 
            return " ";
        }

        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipAppNotApple(up.substring(3));        // if 'apple' found then it doesn't add it in ans and shift pointer on up upto next 5 char to skip apple string
        }
        else{
            return up.charAt(0) + skipAppNotApple(up.substring(1));   // if 'apple' doesn't found it add char at 0 index in ans and shift pointer on upstring upto next char
        }

    }


}
