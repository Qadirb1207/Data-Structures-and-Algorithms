package ArrayProblems;

public class MinimumOfArray{
  private static int i = 0;
  private  static int minIndex = i;
    
  public static int minElement(int[] arr){
   
    if(i == arr.length-1){
      return minIndex ;
    }
    
    if(arr[i] > arr[++i]){
      minIndex = i;
    }
    return minElement(arr);
  }
  
  
  public static void main(String[] args){
    int[] arr = {0, -12, 7, 17, 19, 24};
    int min = minElement(arr);
    System.out.println("Smallest element of array is: "+arr[min]);
  }
}
