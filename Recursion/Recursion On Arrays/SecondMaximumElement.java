package ArrayProblems;

public class SecondMaximumElement{
  public static void main(String[] args){
    int[] arr = {-12, -10, - 9, 0, -1, 19};
    int secondLargest = secondMax(arr, 2, arr[0], arr[1]);
    System.out.println("Second Largest Element is: "+secondLargest);
  }
  
  public static int secondMax(int[] arr, int index, int max, int secMax){
    if(index == arr.length){
      return secMax;
    }
    
    if(arr[index] > secMax){
      if(arr[index] < max){
        secMax = arr[index];
      }else{
        secMax = max;
      max = arr[index];
      }
    }
    return secondMax(arr, index+1, max, secMax);
  }
}
