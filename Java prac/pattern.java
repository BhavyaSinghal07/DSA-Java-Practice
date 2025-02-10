// ques 1 from kunal kushwaha pattern video
/* how to approach: -> outer for loop is for the number of rows and inner for loop is for columns
   -> identify for each row how many columns are used
   -> what do you need to print
   Note: Try to find the formula related to rows and columns
*/

public class pattern {
    public static void main(String[] args) {

        pattern1(4);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
        pattern17(5);
        pattern28(5);
        pattern30(5);
        pattern31(4);

    }


    static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();  // new line within pattern
        }

        System.out.println();   // new line for new pattern
    }

    
    static void pattern2(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();  // new line
        }

        System.out.println();   // new line for new pattern
    }


    static void pattern3(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("* ");
            }
            System.out.println();  // new line
        }

        System.out.println();   // new line for new pattern
    }


    static void pattern4(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();  // new line
        }

        System.out.println();   // new line for new pattern
    }


    static void pattern5(int n){
        for (int row = 1; row <= 2*n; row++) {
            int totalColInRow = row > n ? 2*n-row : row;
            for (int col = 1; col <= totalColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void pattern17(int n){
        for (int row = 1; row <= 2*n; row++) {

            int c = row > n ? 2*n-row : row;

            for (int space = 1; space <= n-c; space++) {     // loop for spaces
                System.out.print("  ");     // because of the space in numbers we have to add extra space in this loop
            }

            for (int col = c; col >=1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <=c; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }


    static void pattern28(int n){
        for (int row = 0; row < 2*n; row++) {

            int totalColInRow = row > n ? 2*n-row : row;

            for (int s = 0; s < n - totalColInRow; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    
    static void pattern30(int n){
        for (int row = 1; row <= n; row++) {

            for (int space = 1; space <= n-row; space++) {     // loop for spaces
                System.out.print("  ");     // because of the space in numbers we have to add extra space in this loop
            }

            for (int col = row; col >=1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <=row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        System.out.println();   // new line for new pattern
    }


    static void pattern31(int n){
        int originalN = n;
        for (int row = 0; row <= 2*n ; row++) {
            for (int col = 0; col <= 2*n ; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(2*n - row, 2*n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }


}
