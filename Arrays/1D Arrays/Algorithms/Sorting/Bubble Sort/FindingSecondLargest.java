/*  PROBLEM STATEMENT
    Sort the array and print the second largest element.
 */
package BubbleSort;
import java.util.Arrays;
public class FindingSecondLargest {
    public static void main(String[] args) {
        int[] arr = {12, 14, 20, 2, 25, 35};
        System.out.println("Before Sorting the array is: \n"+Arrays.toString(arr)+"\n");
        System.out.println("After Sorting the second largest Element is: "+secondLargest(arr));
    }

    private static int secondLargest(int[] arr){
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
        return arr[arr.length-2];
    }
}
