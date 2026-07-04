package ArrayProblems;

public class MaximumOfArray{
  public static void main(String[] args){
    int[] arr = {-12, 7, -9, 10, 15};
    
    System.out.println("Maximum Element is: "+maxElement(arr));
  }
  static int i = 0;
  public static int maxElement(int[] arr){
    int max = arr[i];
    if(i == arr.length-1){
      return max;
    }
  
    if(arr[i] < arr[++i]){
      max = arr[i];
    }
    return maxElement(arr);
  }
}
