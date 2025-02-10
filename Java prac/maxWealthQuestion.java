// this is a leetcode question solution
// this program is used to find out the max wealth of a particular person in a bank account


public class maxWealthQuestion {
    public static void main(String[] args) {
        
        // this is the data for which we're checking the maxWealth 
        int[][] accounts = { {1, 2, 3},
                             {4, 5, 6},
                             {1, 4, 8}, };

        System.out.println("Maximum Wealth is: " + maxWealth(accounts));
    }

    static int maxWealth(int[][] accounts){

        int ans = Integer.MIN_VALUE;     // it gives a random min value which help us to compare it with sum to find max value

        // in these loops person is the row and account is the column
        for (int person = 0; person < accounts.length; person++) {     // this loop is for each person account length i.e.  hr ek person ke saare accounts ke liye
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {     // this loop is for the all accounts of a particular person 
                sum += accounts[person][account];      // it gives tha sum of accounts of each person
            }
            
            // find the max value of account by compare it with min value of ans
            if(sum > ans){
                ans = sum;
            }
        }

        return ans;
    }
}
