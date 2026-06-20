package InsertionSort;

import java.util.Arrays;

public class StudentRollNoCorrection {
    public static void main(String[] args) {
        int[] rollNumbers = {105, 101, 109, 103, 107};

        System.out.println("Unsorted Roll Numbers are: "+Arrays.toString(rollNumbers));
        System.out.println();
        correctRnos(rollNumbers);
        System.out.println("Sorted Roll Numbers are: "+Arrays.toString(rollNumbers));
    }

    public static void correctRnos(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else{
                    break;
                }
            }
        }
    }
}
