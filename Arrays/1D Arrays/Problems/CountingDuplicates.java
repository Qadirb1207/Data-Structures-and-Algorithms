package Problems;

import java.util.Arrays;
public class CountingDuplicates{
  public static int totalDups(int[] arr){
    int count = 0;
    for(int i = 0; i < arr.length-1; i++){
      for(int j = i+1; j < arr.length; j++){
         if(arr[i] == arr[j]){
          ++count;
          break;
        }
      }  
    }
    return count;
  }
  public static void main(String[] args){
    int[] arr = {12, 43, 23, 43, 23, 12};
    System.out.println("Total Duplicate elements are: "+totalDups(arr));
  }
}
