package Problems;

import java.util.Arrays;
public class FrequencyOfEachElement{
  public static void frequencyOfAll(int[] arr){
    boolean[] bool = new boolean[arr.length];
    for(int i = 0; i < arr.length; i++){
      int count = 1;
      for(int j = i+1; j < arr.length; j++){
        if(!bool[i]){
          if(arr[i] == arr[j]){
            ++count;
            bool[j] = true;
          }
        }
      }
      if(!bool[i])
        System.out.println(arr[i]+ " comes "+count+" times");
    }
  }
  public static void main(String[] args){
    int[] arr = {1, 1, 2, 3, 4, 5, 5, 4, 6};
    frequencyOfAll(arr);
  }
}
