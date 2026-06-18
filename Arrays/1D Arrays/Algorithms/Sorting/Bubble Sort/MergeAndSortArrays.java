/* PROBLEM STATEMENT
    Combine two arrays and sort the result
 */
package BubbleSort;


import java.util.Arrays;

public class MergeAndSortArrays {
    public static void main(String[] args) {
        int[] arr1 = {12, 10, 14, 11};
        int[] arr2 = {1, 9, 7, 8, 6};

        System.out.println("Before Merging: ");
        System.out.println(Arrays.toString(arr1)+"\n"+Arrays.toString(arr2));
        //merging both arrays
        int[] allTogether= merge(arr1, arr2);
        //printing merged array
        System.out.println("After Merging: ");
        System.out.println(Arrays.toString(allTogether));
        //sorting merged array
        sort(allTogether);
        //printing sorted array
        System.out.println("After Sorting: "+Arrays.toString(allTogether));
    }

    public static int[] merge(int[] arr1, int[] arr2){
        int[] mergedArray = new int[arr1.length+arr2.length];
        int index = 0;
        for(int i = 0; i < mergedArray.length; i++){
            if(i < arr1.length){
                mergedArray[i] = arr1[i];
            }else{
                mergedArray[i] = arr2[index++];
            }
        }
        return mergedArray;
    }

    public static void sort(int[] arr){
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
