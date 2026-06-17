/*PROBLEM STATEMENT
    Given an array of student marks, sort them in ascending order.
*/

import java.util.Arrays;

public class SortingStudentMarks {
    public static void main(String[] args) {
        int[] marksOutOf100 = {89, 78, 93, 95, 86};


        System.out.println("Marks before sorting: ");
        System.out.println(Arrays.toString(marksOutOf100));

        //sorting the marks
        bubbleSort(marksOutOf100);

        System.out.println("Marks after sorting: ");
        System.out.println(Arrays.toString(marksOutOf100));
    }

    public static void bubbleSort(int[] arr){
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
