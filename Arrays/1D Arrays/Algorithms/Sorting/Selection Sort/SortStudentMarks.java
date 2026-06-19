package SelectionSort;

import java.util.Arrays;

public class SortStudentMarks{
  public static void main(String[] args){
    int[] marksArr = {78, 45, 92, 67, 81};
    
    System.out.println("Before Sorting: "+Arrays.toString(marksArr));
    System.out.println();
    
    selectionSort(marksArr);
    
    System.out.println("After Sorting: "+Arrays.toString(marksArr));
    
  }
  
  public static void selectionSort(int[] arr){
    int swaps = 0;
    for(int i = 0; i < arr.length; i++){
      int minIndex = i; 
      boolean minFound = false;
      for(int j = i+1;  j < arr.length; j++){
        if(arr[j] < arr[minIndex]){
          minIndex = j;
          minFound = true;
        }
      }
      if(minFound){
        int temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
        swaps++;
      }else{
        break;
      }
    }
    System.out.println("Swaps = "+swaps);
  }
}
