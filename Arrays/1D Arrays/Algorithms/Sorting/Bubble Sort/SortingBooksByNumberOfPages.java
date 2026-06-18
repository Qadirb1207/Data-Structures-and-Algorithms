/*  PROBLEM STATEMENT
    Given page count of books arrange them from shortest to longest.
 */
package BubbleSort;

import java.util.Arrays;

public class SortingBooksByNumberOfPages {
    public static void main(String[] args) {
        int[] pages = {100, 250, 256, 544, 396, 432};

        System.out.println("Before Sorting, the pages of the books are: ");
        System.out.println(Arrays.toString(pages));

        System.out.println();
        sortByPages(pages);
        System.out.println("After sorting by number of pages: "+Arrays.toString(pages));
    }   
    
    public static void sortByPages(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            boolean isSwapped = false;
            for(int j = 0; j < arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
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

