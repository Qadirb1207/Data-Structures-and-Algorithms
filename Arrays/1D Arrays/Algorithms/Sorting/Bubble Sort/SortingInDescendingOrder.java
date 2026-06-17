/* PROBLEM STATEMENT
    Sort the numbers from smallest to largest...
 */

package BubbleSort;

import java.util.Arrays;

public class SortingInDescendingOrder {
    public static void main(String[] args) {
        int[] arr = {-12, 5};
        System.out.println("Before Sorting: ");
        System.out.println(Arrays.toString(arr));
        System.out.println();
        descendingSorting(arr);
        System.out.println("After Sorting: ");
        System.out.println(Arrays.toString(arr));
    }

    public static void descendingSorting(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            boolean isSwapped = false;
            for(int j = 0; j < arr.length-1; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped){
                break;
            }
        }
    }
}
