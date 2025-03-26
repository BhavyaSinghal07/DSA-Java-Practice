// These are based on the subset problems and how to apply subsets, basically these are the permutation and combination concepts
// ques 4: in this question it gives us all the possible subsets of the string
// ques 5: return an array list of string
// ques 6: return the ascii value of the char for the subset of the string
// ques 7: return the ascii value of the char in an ArrayList for the subset of the string


import java.util.ArrayList;

public class ques4_5_6_7 {
    public static void main(String[] args) {

        subset("", "abc");

        System.out.println(subsetArrayList("", "def"));

        subsetAscii(" ", "abc");

        System.out.println(subsetAsciiArrayList("", "def"));

    }


    // ques4
    static void subset(String p, String up){    // string p is ans and string up is string on which we apply operation
        if(up.isEmpty()){                       // base condition: if the up is empty then it prints the p as ans 
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        // there are two choices on each char if it adds to the subset string or not  
        subset(p + ch, up.substring(1));    // it concate that char at that subset string
        subset(p, up.substring(1));         // it doesn't concate that subset string
    }


    // ques5: store the ans in an array list
    static ArrayList<String> subsetArrayList(String p, String up){    // string p is ans and string up is string on which we apply operation
        if(up.isEmpty()){                       // base condition: if the up is empty then it prints the p as ans 
            ArrayList<String> list = new ArrayList<>();      // create a list and store the ans of p in list
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        // there are two choices on each char if it adds to the subset string or not  
        ArrayList<String> left = subsetArrayList(p + ch, up.substring(1));    // it concate that char at that subset string and store it to the left AraayList
        ArrayList<String> right = subsetArrayList(p, up.substring(1));         // it doesn't concate that subset string and store it to the right AraayList

        left.addAll(right);    // add all the elements of right ArrayList to left ArrayList
        return left;           // return the left ArrayList to the list ArrayList
    }


    // ques6:
    static void subsetAscii(String p, String up){    // string p is ans and string up is string on which we apply operation
        if(up.isEmpty()){                            // base condition: if the up is empty then it prints the p as ans 
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        // there are two choices on each char if it adds to the subset string or not  
        subsetAscii(p + ch, up.substring(1));         // it concate that char at that subset string
        subsetAscii(p, up.substring(1));              // it doesn't concate that subset string
        subsetAscii(p + (ch + 0), up.substring(1));   // (ch + 0) is a formula to give the ascii value of a char
    }


    // ques7: store the ascii value of char in an array list
    static ArrayList<String> subsetAsciiArrayList(String p, String up){    // string p is ans and string up is string on which we apply operation
        if(up.isEmpty()){                       // base condition: if the up is empty then it prints the p as ans 
            ArrayList<String> list = new ArrayList<>();      // create a list and store the ans of p in list
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        // there are two choices on each char if it adds to the subset string or not  
        ArrayList<String> first = subsetAsciiArrayList(p + ch, up.substring(1));        // it concate that char at that subset string and store it to the first AraayList
        ArrayList<String> second = subsetAsciiArrayList(p, up.substring(1));            // it doesn't concate that subset string and store it to the second AraayList
        ArrayList<String> third = subsetAsciiArrayList(p + (ch + 0), up.substring(1));  // it returns the ascii value of char in p and that  

        first.addAll(second);    // add all the elements of second ArrayList to first ArrayList
        first.addAll(third);     // add all the elements of third ArrayList to first ArrayList
        return first;           // return the first ArrayList to the list ArrayList
    }


    
}
