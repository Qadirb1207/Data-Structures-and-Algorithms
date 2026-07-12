package MergeSort;

import java.util.Arrays;
public class PrintingEveryMerge{
  public static void main(String[] args){
    int[] arr = {12, 8, 9, 17, 15, 19, 21, 23, 20, 27};
    mergeSort(arr);
  }
  
  public static int[] mergeSort(int[] arr){
    if(arr.length == 1){
      return arr;
    }
    
    int mid = arr.length/2;
    
    int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
    int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
    System.out.println("Merging:\n"+Arrays.toString(left)+"\n"+Arrays.toString(right)+"\n");
    System.out.println("Result:\n"+Arrays.toString(merge(left, right))+"\n");
    return merge(left, right);
  }
  
  public static int[] merge(int[] first, int[] second){
    int[] mergedArr = new int[first.length+second.length];
    int i = 0, j = 0, m = 0;
    
    while(i < first.length && j < second.length){
       if(first[i] < second[j]){
          mergedArr[m] = first[i];
          ++i;
       }
       else{
          mergedArr[m] = second[j];
          ++j;
       }
       ++m;
    }
    
    while(i < first.length){
      mergedArr[m] = first[i];
      ++i;
      ++m;
    }
    
    while(j < second.length){
      mergedArr[m] = second[j];
      ++j;
      ++m;
    }
    return mergedArr;
  }
}
