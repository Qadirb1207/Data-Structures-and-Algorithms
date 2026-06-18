package SelectionSort;

import java.util.Arrays;

public class SortingBasedOnDistanceFromZero{
  public static void main(String[] args){
    int[] distances = {-20, 19, 13, 10, 0, -1, -4, -15};
    System.out.println("Original Distances: \n"+Arrays.toString(distances));
    System.out.println();
    sortBasedOnDistanceFromZero(distances);
    System.out.println("Sorted Distances Based On Distance from Zero: \n"+Arrays.toString(distances));
  }
  
  public static void sortBasedOnDistanceFromZero(int[] nums){
    for(int i = 0; i < nums.length; i++){
      int minIndex = i; 
      for(int j = i+1; j < nums.length; j++){
        if(Math.abs(nums[j]) < Math.abs(nums[minIndex])){
          minIndex = j;
        }
      }
      int temp = nums[i];
      nums[i] = nums[minIndex];
      nums[minIndex] = temp;
    }
  }
}
