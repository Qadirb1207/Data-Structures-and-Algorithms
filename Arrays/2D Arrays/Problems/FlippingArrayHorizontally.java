package Problems;

import java.util.Arrays;
public class FlippingArrayHorizontally{
  public static void flipHorizontally(int[][] arr){
    if(arr.length == 0 || arr == null) return;
    for(int i = 0; i < arr.length; i++){
      for(int j = 0; j < arr[i].length; j++){
        if(i == 0){
          int temp = arr[j][i];
          arr[j][i] = arr[j][arr[i].length-1];
          arr[j][arr[i].length-1] = temp;
        }
      }
    }
  }
  public static void main(String[] args){
    int[][] arr = {
                    {12, 3, 92},
                    {8, 7, 65},
                    {14, 45, 90}
          };
          
    System.out.println("Original Array is: ");
    for(int i = 0; i < arr.length; i++){
      System.out.println(Arrays.toString(arr[i]));
    }
    System.out.println();
    
    System.out.println("After flipping the array,  Array is: ");
    
    //flipping array
    flipHorizontally(arr);
    
    for(int i = 0; i < arr.length; i++){
      System.out.println(Arrays.toString(arr[i]));
    }
  }
}
