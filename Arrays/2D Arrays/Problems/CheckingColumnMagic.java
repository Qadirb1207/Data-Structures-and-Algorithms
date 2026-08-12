package Problems;

import java.util.Arrays;
public class CheckingColumnMagic{
  public static boolean columnMagic(int[][] arr){
    boolean isColumnMagic = false;
    if(arr == null || arr.length == 0) return isColumnMagic;
    
    int[] sums = new int[arr[0].length];
    for(int i = 0; i < arr[0].length; i++){
      int sum = 0;
      for(int j = 0; j < arr.length; j++){
        sum += arr[j][i];
      }
      sums[i] = sum;
    }
    
    for(int i = 0; i < sums.length-1; i++){
      if(sums[i] == sums[i+1]){
        isColumnMagic = true;
      }else{
        isColumnMagic = false;
        break;
      }
    }
    return isColumnMagic;
  }
  public static void main(String[] args){
    int[][] arr = {
                      {4, 2, 9},
                      {7, 6, 3},
                      {2, 5, 1}
              };
      for(int i = 0; i < arr.length; i++){
        System.out.println(Arrays.toString(arr[i]));
      }
      
      boolean ans = columnMagic(arr);
      if(ans){
        System.out.println("Array is column Magic");
      }else{
        System.out.println("Array is not column Magic");
      }
  }
}
