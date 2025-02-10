public class searchInStrings {
    public static void main(String[] args) {
        String name = "Bhavya";
        char target = 'v';
        System.out.println(search(name, target));
    }

    static boolean search(String str, char target){
        if(str.length() == 0){     // here internally str.length() is a function
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        
        return false;


        // by using for each loop in place of for loop
        // for(char ch : str.toCharArray()){      here we are converting the string into the char array
        //     if (ch == target) {
        //         return true;
        //     }
        // }

    }
}
