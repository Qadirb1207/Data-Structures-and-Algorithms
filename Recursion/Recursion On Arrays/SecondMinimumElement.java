package ArrayProblems;

public class SecondMinimumElement{
  public static void main(String[] args){
    int[] arr = {-12, -10, -9, -28, - 18, 0, 1};
    int secondSmallest = secondMin(arr, 2, arr[0], arr[1]);
    System.out.println("Second Minimum Element is: "+secondSmallest);
  }
  
  public static int secondMin(int[] arr, int index, int min, int secMin){
    if(index == arr.length){
      return secMin;
    }
    
    if(arr[index] < secMin){
      if(arr[index] > min){
        secMin = arr[index];
      }else{
        secMin = min;
        min = arr[index];
      }
    }
    return secondMin(arr, index+1, min, secMin);
  }
}
