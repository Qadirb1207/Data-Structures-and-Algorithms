package Algorithms;

import java.util.Arrays;
public class TotalComparisons{
  public static void main(String[] args){
    int[] arr = {5, 3, 9, 1, 2, 3, 6, 0};
    System.out.println("Total Comparisons made while sorting the array : "+Arrays.toString(arr)+"\n Total Comparisons = "+totalComps(arr, 0, arr.length-1, 0));
  }
  
  public static int totalComps(int[] arr, int s, int e, int comps){
    if(e == 0){
      return comps;
    }
    
    if(s < e){
      if(arr[s] > arr[s+1]){
        int temp = arr[s];
        arr[s] = arr[s+1];
        arr[s+1] = temp;
      }
      comps++;
      return totalComps(arr, s+1, e, comps);
    }
    return totalComps(arr, 0, e-1, comps);
  }
}
