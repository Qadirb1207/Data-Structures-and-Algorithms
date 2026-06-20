package InsertionSort;

import java.util.Arrays;

public class SortingIntegersByAbsoluteValue {
    public static void main(String[] args) {
        int[] arr = {-12, -1, 0, 2, 3, 9, 17, 23};

        System.out.println("Original Array:\n"+Arrays.toString(arr));

        System.out.println();
        sortIntegersByAbsVal(arr);
        
        System.out.println("Array after sorting by absolute value: \n"+Arrays.toString(arr));
    }

    public static void sortIntegersByAbsVal(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for(int j = i+1; j > 0; j--){
                if(Math.abs(arr[j]) < Math.abs(arr[j-1])){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }else{
                    break;
                }
            }
        }
    }
}
