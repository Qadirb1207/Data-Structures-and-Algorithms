package MergeSort;

import java.util.Arrays;
public class SortingStringArray{
  public static void main(String[] args){
    String[] names = {"Qadir", "Masood", "Abrar", "Musab"};
    
    System.out.println("Before Sorting:\n"+Arrays.toString(names));
    names = mergeSort(names);
    System.out.println("After Sorting:\n"+Arrays.toString(names));
  }
  
  public static String[] mergeSort(String[] arr){
    if(arr.length == 1){
      return arr;
    }
    
    int mid = arr.length/2;
    String[] left = mergeSort(Arrays.copyOfRange(arr, 0,  mid));
    String[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
    
    return merging(left, right);
  }
  
  public static String[] merging(String[] first, String[] second){
    String[] mergedArr = new String[first.length+second.length];
    
    int i = 0, j = 0, m = 0;
    while(i < first.length && j < second.length){
      if(first[i].compareTo(second[j]) > 0){
        mergedArr[m] = second[j];
        ++j;
      }else{
        mergedArr[m] = first[i];
        ++i;
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
