package CyclicSort;

import java.util.Arrays;

public class CyclicSortDemo {
    public static void main(String[] args) {
        int[] arr = {-1, 0, -2, -3, 1, 2, 3};

        System.out.println("Before Sorting:\n"+Arrays.toString(arr));
        System.out.println();
        cyclicSort(arr);
        System.out.println("After Sorting:\n"+Arrays.toString(arr));
    }   
    
    public static void cyclicSort(int[] arr){
        for(int i = 0; i < arr.length; ){
            int j = i + 1;
            
            if( j != arr[i]){
                int temp = arr[arr[i] - 1];
                arr[arr[i]-1] = arr[i];
                arr[i] = temp;
            }else{
                ++i;
            }
        }
    }
}
