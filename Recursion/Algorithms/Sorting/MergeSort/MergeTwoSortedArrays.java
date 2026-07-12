package MergeSort;

import java.util.Arrays;
public class MergeTwoSortedArrays{
  public static void main(String[] args){
    int[] arr1 = {-1, 0, 1, 2, 3, 30};
    int[] arr2 = {2, 3, 4, 5, 6, 7, 8, 9, 10};
    System.out.println("Sorted Arrays are: \n"+Arrays.toString(arr1)+"\n"+Arrays.toString(arr2));
    System.out.println("Merged Array is: \n"+Arrays.toString(mergeArrays(arr1, arr2)));
  }
  
  public static int[] mergeArrays(int[] arr1, int[] arr2){
    int[] mergedArr = new int[arr1.length+arr2.length];
    int i = 0, j = 0, m = 0;
    while(i < arr1.length && j < arr2.length){
      if(arr1[i] < arr2[j]){
        mergedArr[m] = arr1[i];
        ++i;
      }else{
        mergedArr[m] = arr2[j];
        ++j;
      }
      ++m;
    }
    
    while(i < arr1.length){
      mergedArr[m] = arr1[i];
      ++i; 
      ++m;
    }
    
    while(j < arr2.length){
      mergedArr[m] = arr2[j];
      ++j;
      ++m;
    }
    return mergedArr;
  }
}
