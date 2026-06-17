/*  PROBLEM STATEMENT
    Sort the Strings according to their length.
 */

package BubbleSort;

import java.util.Arrays;

public class SortingByLength {
    public static void main(String[] args) {
        String[] arr = {"Java", "C++", "Fortran", "DSA", "SDA"};
        System.out.println("Before Sorting: \n"+Arrays.toString(arr)+"\n");
        sortByLen(arr);
        System.out.println("\nAfter Sorting: \n"+Arrays.toString(arr));
    }

    public static void sortByLen(String[] arr){
        for(int i = 0; i < arr.length-1; i++){
            boolean isSwapped = false;
            for(int j = 0; j < arr.length-1; j++){
                if(arr[j].length() > arr[j+1].length()){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped){
                break;
            }
        }
    }
}
