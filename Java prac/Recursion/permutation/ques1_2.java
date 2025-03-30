// in these questions we are solving some google amazon problems 

// ques1: Leetcode problem 17th =>  https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
// in this question we have to give all the possible combination of ans that on clicking these num what are the possible combinations of letters that can form

// ques2: Dice problem => what are the combinations that a dice can throw to get the favourable outcome


import java.util.ArrayList;

public class ques1_2 {
    public static void main(String[] args) {

        pad("", "12");

        System.out.println(pad1("", "12"));

        System.out.println(permutationCount("", "12"));

        // ques 2
        dice("", 6);

        System.out.println(dice1("", 4));
    }


    // simple approach to solve this problem
    static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';      // it converts '2' into 2

        for (int i = (digit - 1) * 3; i < digit*3 ; i++) {
            char ch = (char)('a' + i);      // converts it into char and store it in ch char
            pad(p + ch, up.substring(1));
        }
    }


    // use ArrayList to solve this problem
    static ArrayList<String> pad1(String p, String up){
        if(up.isEmpty()){          // base condition: if the up is empty then it prints the p as ans
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';      // it converts '2' into 2
        ArrayList<String> list = new ArrayList<>();

        for (int i = (digit - 1) * 3; i < digit*3 ; i++) {
            char ch = (char)('a' + i);        // converts it into char and store it in ch char
            list.addAll(pad1(p + ch, up.substring(1)));
        }

        return list;
    }


    // count the number of attempts for which it is calling it the function
    static int permutationCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }

        int digit = up.charAt(0) - '0';      // it converts '2' into 2
        int count = 0;

        for (int i = (digit - 1) * 3; i < digit*3 ; i++) {
            char ch = (char)('a' + i);      // converts it into char and store it in ch char
            count = count + permutationCount(p + ch, up.substring(1));
        }

        return count;
    }



    // ques 2
    static void dice(String p, int target){
        if(target == 0){            // base conditions
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {   
            dice(p + i, target - i);       // new num will concatinate to the p and reduce that num from target 
        }
    }


    // using arraylist to solve ques 2
    static ArrayList<String> dice1(String p, int target){
        if(target == 0){            // base conditions
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i <= 6 && i <= target; i++) {   
            list.addAll(dice1(p + i, target - i));       // new num will concatinate to the p and reduce that num from target 
        }

        return list;
    }

}

// Note: As 'a' + 1 == b because it converts 'a' into it's ascii value add 1 and converts back to char which is b
