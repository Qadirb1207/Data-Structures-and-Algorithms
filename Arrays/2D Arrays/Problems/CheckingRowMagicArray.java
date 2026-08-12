package Problems;

import java.util.Arrays;
public class CheckingRowMagicArray{
  
  public static boolean rowMagic(int[][] arr){
    int[] sums = new int[arr.length];
    int index = 0;
    boolean isRowMagic = false;
    for(int i = 0; i < arr.length; i++){
      int sum = 0;
      for(int j = 0; j < arr[i].length; j++){
        sum += arr[i][j];
      }
      sums[index++] = sum;
    }
    
    for(int i = 0; i < sums.length-1; i++){
      if(sums[i] == sums[i+1]){
        isRowMagic = true;
      }else{
        isRowMagic = false;
        break;
      }
    }
    return isRowMagic;
  } 
  
  public static void main(String[] args){
    int[][] arr = {
                      {1, 2, 3},
                      {0, 9, 0},
                      {2, 2, 2}
                  };
      for(int i = 0; i < arr.length; i++){
        System.out.println(Arrays.toString(arr[i]));
      }
    boolean ans = rowMagic(arr);
    if(ans){
      System.out.println("Array is Row Magic");
    }else{
      System.out.println("Array is not Row Magic");
    }
  }
}
