package Problems;

import java.util.Arrays;
public class FlippingArrayVertically{
  public static void flipVertically(int[][] arr){
    for(int i = 0;  i < arr.length; i++){
      for(int j = 0; j < arr[i].length; j++){
        if(i == 0){
          int temp = arr[i][j];
          arr[i][j] = arr[arr[i].length-1][j];
          arr[arr[i].length-1][j] = temp;
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
  
  flipVertically(arr);
  System.out.println("Vertically Flipped Array is: ");
  
    for(int i = 0; i < arr.length; i++){
    System.out.println(Arrays.toString(arr[i]));
  }
  }
}
