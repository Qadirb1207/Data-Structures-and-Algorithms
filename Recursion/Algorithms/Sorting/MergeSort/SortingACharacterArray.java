package MergeSort;

import java.util.Arrays;
public class SortingACharacterArray{
  public static void main(String[] args){
    char[] arr = {'f', 'g', 'o', 'h', ';', 'l'};
    System.out.println("Before Sorting: \n"+Arrays.toString(arr));
    System.out.println("After Sorting: \n"+Arrays.toString(mergeSort(arr)));
  }
  
  public static char[] mergeSort(char[] arr){
    if(arr.length==1){
      return arr;
    }
    
    int mid = arr.length/2;
    
    char[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
    char[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
    
    return merging(left, right);
  }
  
  public static char[] merging(char[] first, char[] second){
    char[] merged = new char[first.length+second.length];
    int f = 0, s = 0, m = 0;
    while(f < first.length && s < second.length){
      if(first[f] < second[s]){
        merged[m] = first[f];
        ++f;
      }else{
        merged[m] = second[s];
        ++s;
      }
      ++m;
    }
    
    while(f < first.length){
      merged[m] = first[f];
      ++f;
      ++m;
    }
    
    while(s < second.length){
      merged[m] = second[s];
      ++s;
      ++m;
    }
    return merged;
  }
}
