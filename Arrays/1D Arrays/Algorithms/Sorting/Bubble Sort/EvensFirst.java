/*  PROBLEM STATEMENT
    Sort the array so that all even numbers come before odd numbers.
 */
package BubbleSort;

import java.util.Arrays;

public class EvensFirst {
    public static void main(String[] args) {
        int[] arr = {4, 7, 6, 9, -2};
        System.out.println("Original Array: \n"+Arrays.toString(arr)+"\n");
        placeEvenFirst(arr);
        System.out.println("After moving even first: \n"+Arrays.toString(arr));
    }

    public static void placeEvenFirst(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length-1; j++){
                if(!isEven(arr[j]) && isEven(arr[j+1])){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    private static boolean isEven(int num){
        return num%2==0;
    }
}
