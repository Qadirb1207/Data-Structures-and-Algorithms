package ArrayProblems;

import java.util.Arrays;
public class ReverseAnArray{
  public static void main(String[] args){
    int[] originalArr = {1, 4, 18, 9, 10, 15};
    
    System.out.println("Original Array: \n"+ Arrays.toString(originalArr));
    reverse(originalArr, 0, originalArr.length-1);
    System.out.println("Reversed Array: \n"+Arrays.toString(originalArr));
  }
  
  public static void reverse(int[] arr, int s, int e){
    if(s >= e){
      return;
    }
    int temp = arr[s];
    arr[s] = arr[e];
    arr[e] = temp;
    reverse(arr, s+1, e-1);
  }
}
