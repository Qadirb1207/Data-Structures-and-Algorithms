package Algorithms;

import java.util.Arrays;
public class SortingCharArray{
  public static void main(String[] args){
    char[] arr = {'h', 'z', 'u', 'p' ,'r', 'l', 'j', 'i'};
    
    System.out.println("Original Array: "+Arrays.toString(arr));
    sortCharArray(arr, 0, arr.length-1);
    System.out.println("Sorted Array: "+Arrays.toString(arr));

    sortCharArray(arr, 0, arr.length-1, false);
    System.out.println("Sorted Array: "+Arrays.toString(arr));
    
  }
  
  public static void sortCharArray(char[] arr, int s, int e, boolean isSwapped){
    if(e == 0){
      return;
    }
    
    if(s < e){
      if(arr[s] > arr[s+1]){
        char temp = arr[s+1];
        arr[s+1] = arr[s];
        arr[s] = temp;
        isSwapped = true;
      }
      sortCharArray(arr, s+1, e, isSwapped);
    }else {
      if(isSwapped){
        sortCharArray(arr, 0, e-1, false);
      }
      return;
      
    }
  }
  
  public static void sortCharArray(char[] arr, int s, int e){
    if(e == 0){
      return;
    }
    
    if(s < e){
      if(arr[s] > arr[s+1]){
        char temp = arr[s+1];
        arr[s+1] = arr[s];
        arr[s] = temp;
      }
      sortCharArray(arr, s+1, e);
    }
    
    sortCharArray(arr, 0, e-1, false);
  }
}
