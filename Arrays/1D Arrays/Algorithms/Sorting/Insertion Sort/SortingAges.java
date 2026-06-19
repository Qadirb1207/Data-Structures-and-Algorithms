package InsertionSort;

import java.util.Arrays;

public class SortingAges {
    public static void main(String[] args) {
        int[] ages = {19, 17, 15, 46, 42, 7};

        System.out.println("Family Ages Before Sorting: \n"+Arrays.toString(ages));
        System.out.println();
        sortAges(ages);
        System.out.println("Family Ages After Sorting: \n"+Arrays.toString(ages));
    }

    public static void sortAges(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j > 0; j--){
                if(arr[j] < arr[j-1]){
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
