// Permutation: it is a concept in which it provides all the possible answers for that problem


import java.util.*;

public class ques {
    public static void main(String[] args) {

        permutation("", "abc");

        ArrayList<String> ans = permutation1("", "abc");
        System.out.println(ans);

        System.out.println(permutation2("", "abc"));

    }


    // simple method to solve the permutation related question
    static void permutation(String p, String up){    // string p is ans and string up is string on which we apply operation
        if(up.isEmpty()){                            // base condition: if the up is empty then it prints the p as ans
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {        // start from 0 and go to the length of p
            String f = p.substring(0, i);   // extract element from 0 to i from p string and store it in f string
            String s = p.substring(i, p.length());     // extract element from i to p.length() from p string and store it in f string

            permutation(f + ch + s, up.substring(1));     // first elment + current element + remaining elemen
        }
    }


    // store the answer in an array list
    static ArrayList<String> permutation1(String p, String up){    // string p is ans and string up is string on which we apply operation
        if(up.isEmpty()){        // base condition: if the up is empty then it prints the p as ans
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {        // start from 0 and go to the length of p
            String f = p.substring(0, i);   // extract element from 0 to i from p string and store it in f string
            String s = p.substring(i, p.length());     // extract element from i to p.length() from p string and store it in f string

            ans.addAll(permutation1(f + ch + s, up.substring(1)));     // first elment + current element + remaining elemen
        }

        return ans;
    }


    // count the number of answers that we can get
    static int permutation2(String p, String up){    // string p is ans and string up is string on which we apply operation
        if(up.isEmpty()){                            // base condition: if the up is empty then it prints the p as ans
            return 1;
        }

        char ch = up.charAt(0);
        int count = 0;

        for (int i = 0; i <= p.length(); i++) {        // start from 0 and go to the length of p
            String f = p.substring(0, i);   // extract element from 0 to i from p string and store it in f string
            String s = p.substring(i, p.length());     // extract element from i to p.length() from p string and store it in f string

            count = count + permutation2(f + ch + s, up.substring(1));     // first elment + current element + remaining elemen
        }

        return count;
    }


}
