// ques1 is to check the array is sorted or not
// ques2 for linear search using 4 different methods
// ques3 for linear search on multiple occured index
// ques4  hoe to return an array list on linear search on multiple occured element 


import java.util.ArrayList;

public class ques1{
    public static void main(String args[]){

        int[] arr = {1, 2, 4, 3, 6, 7};
        System.out.println(isSorted(arr, 0));     // initially the index is 0

        System.out.println(isSearch(arr, 3, 0));            // search for 3 starting from 0th index
        System.out.println(isSearch1(arr, 7, 0));         // search for 7 starting from 0th index
        System.out.println(isSearch2(arr, 7, 0));         // search for 7 starting from 0th index and returns the index value
        System.out.println(isSearch3(arr, 3, arr.length -1));    // search for 3  from the last element of the array


        int[] arr1 = {1, 7, 2, 6, 4, 5, 3, 6, 6, 7};
        multipleIndex(arr1, 06, 0);       // call the finction
        System.out.println(list);                 // prints the indexes store in list

        multipleIndex1(arr1, 07, 0);  
        System.out.println(list1);

    }

    
    // ques1: to check the array is sorted or not
    static boolean isSorted(int[] arr, int i){
        if(i == arr.length -1){         // if index increement reaches to the last element of the array then it returns true
            return true;
        }
        return arr[i] < arr[i+1] && isSorted(arr, i+1);    // checking that they are sorted and increasing the index value
    }



    // ques2: search a num using linear serch method using recursion
    static boolean isSearch(int[] arr, int t, int ind){
        if(arr[ind] == t){         // if it gets target element on an index it returns true end exits
            return true;
        }
        return arr[ind] != t && isSearch(arr, t, ind+1);    // if it doesn't get then it updates the index value and search for the next
    }


    // another way to apply linear search
    static boolean isSearch1(int[] arr, int t1, int ind1){
        if(ind1 == arr.length){         // if index value reaches to the out of the array then it returns false and exit
            return false;
        }
        return arr[ind1] == t1 || isSearch1(arr, t1, ind1+1);    // if it gets element or it edits the index value
    }
    

    // another way to apply linear search in which it gives the index value on which it gets the element
    static int isSearch2(int[] arr, int t2, int ind2){

        if(ind2 == arr.length){      // if index value reaches to the out of the array then it returns -1 the element doesn't found and exit
            return -1;
        }
        if (arr[ind2] == t2) {       // if it gets element it returns the index value of it's location
            return ind2;
        }
        else{
            return isSearch2(arr, t2, ind2+1);    // otherwise edits in index value and calls function again
        }
    }


    // linear searching from the last element
    static int isSearch3(int[] arr, int t3, int ind3){

        if(ind3 == -1){      // if index value reaches to the out of the array then it returns -1 the element doesn't found and exit
            return -1;
        }
        if (arr[ind3] == t3) {       // if it gets element it returns the index value of it's location
            return ind3;
        }
        else{
            return isSearch3(arr, t3, ind3-1);    // otherwise edits in index value and calls function again
        }
    }



    // ques3: linear search on multiple occurance that returns all indexes

    static ArrayList<Integer> list = new ArrayList<>();       // create an array list to store the all index values of target element
    static void multipleIndex(int[] arr1, int t4, int ind4){

        if(ind4 == arr1.length){      // if index value reaches to the out of the array then it returns -1 the element doesn't found and exit
            return;
        }
        if (arr1[ind4] == t4) {       // if it gets element it returns the index value of it's location
            list.add(ind4);
        }
        multipleIndex(arr1, t4, ind4+1);    // otherwise edits in index value and calls function again
    }


    // another method to solve this problem this is also the ques4
    static ArrayList multipleIndex1(int[] arr1, int t5, int ind5, ArrayList<Integer> list1){

        if(ind5 == arr1.length){      // if index value reaches to the out of the array then it returns -1 the element doesn't found and exit
            return list1;
        }
        if (arr1[ind5] == t5) {       // if it gets element it returns the index value of it's location
            list1.add(ind5);
        }
        multipleIndex1(arr1, t5, ind5+1);    // otherwise edits in index value and calls function again
    }


}