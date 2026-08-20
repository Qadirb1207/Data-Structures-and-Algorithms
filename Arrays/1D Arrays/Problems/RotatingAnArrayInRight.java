package Problems;

import java.util.Arrays;
public class RotatingAnArrayInRight{
  public static void rotate(int[] nums, int k){
    if ( k > nums.length){
      System.out.println("Invalid steps! Steps should be less than the size of the array!");
      return;
    }
    for(int i = k; i > 0; i--){
      int temp = nums[nums.length-1];
      for(int j = nums.length-1; j > 0; j--){
        nums[j] = nums[j-1];
      }
      nums[0] = temp;
    }
  }
  public static void main(String[] args){
    int[] arr = {1, 2, 3, 4, 5, 6, 7};
    int steps = 3;
    System.out.println("Original Array is: "+Arrays.toString(arr));
    rotate(arr, steps);
    System.out.println("After rotating the Array is: "+Arrays.toString(arr));
  }
}
