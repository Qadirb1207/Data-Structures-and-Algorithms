/* PROBLEM STATEMENT
    Given an array of names, sort them in dictionary order....
 */

package BubbleSort;

import java.util.Arrays;

public class SortingNames {
    public static void main(String[] args) {
        String[] names = {"Hania", "Asaad", "Saba", "Qavi", "Asim"};

        System.out.println("Before Sorting: ");
        System.out.println(Arrays.toString(names));
        System.out.println();

        sortAlphabetically(names);
        System.out.println("After Sorting: ");
        System.out.println(Arrays.toString(names));
    }

    public static void sortAlphabetically(String[] arr){
        for(int i = 0; i < arr.length-1; i++){
            boolean isSwapped = false;
            for(int j = 0; j < arr.length-1; j++){
                if(arr[j].compareTo(arr[j+1]) > 0){
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
