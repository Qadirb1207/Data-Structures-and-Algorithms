/* PROBLEM STATEMENT:
A weather station records temperatures throughout the day. Sort them from coldest to hottest.*/

import java.util.Arrays;

public class SortingTemperatures {
    public static void main(String[] args) {
        int[] temperatures = {12, 33, 34, 37, 44, 47, 30};

        System.out.println("Before Sorting: ");
        System.out.println(Arrays.toString(temperatures));

        //sorting the temperatures
        sortTemps(temperatures);
        System.out.println("After Sorting: ");
        System.out.println(Arrays.toString(temperatures));
    }

    public static void sortTemps(int[] arr){
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
