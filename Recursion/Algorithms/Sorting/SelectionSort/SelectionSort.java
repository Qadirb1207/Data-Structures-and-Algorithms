package SelectionSort;

import java.util.Arrays;
public class SelectionSort{
  public static void main(String[] args){
    int[] arr = {3, 6, 1, 0, 5, 9};
    System.out.println("Before Sorting: \n"+Arrays.toString(arr));
    selectionSort(arr, 0, arr.length-1);
    System.out.println("After Sorting:\n "+Arrays.toString(arr));
  }
  
  public static void selectionSort(int[] arr, int s, int e){
    //base case
    if(s == arr.length-2){
      return;
    }
    
    int min = minIndex(arr, s, e, s);
    int temp = arr[s];
    arr[s] = arr[min];
    arr[min] = temp;
    
    //recursive call
    selectionSort(arr, s+1, e);
  }
  
  public static int minIndex(int[] arr, int s, int e, int index){
    if(s == arr.length){
      return index;
    }
    if(arr[s] < arr[index]){
      index = s;
    }
    return minIndex(arr, s+1, e, index);
  }
}
