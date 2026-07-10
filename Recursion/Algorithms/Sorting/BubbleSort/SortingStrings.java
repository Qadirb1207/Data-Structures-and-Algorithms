package Algorithms;

import java.util.Arrays;

public class SortingStrings{
  public static void main(String[] args){
    String[] names = {"Masood", "Qadir", "Abrar", "Qutib", "Iqra"};
    System.out.println("Before Sorting: "+Arrays.toString(names));
    sortNames(names, 0, names.length-1);
    System.out.println("After Sorting: "+Arrays.toString(names));
  }
  
  public static void sortNames(String[] arr, int s, int e){
    if(e == 0){
      return;
    }
    if(s < e){
      if(arr[s].compareTo(arr[s+1]) > 0){
        String temp = arr[s];
        arr[s] = arr[s+1];
        arr[s+1] = temp;
      }
      sortNames(arr, s+1, e);
    }
    sortNames(arr, 0, e-1);
  }
}
