package ArrayProblems;

public class AverageOfArray{
  public static void main(String[] args){
    int[] arr = {12, 14, 21, 25, 23};
    System.out.println("Average of array is: "+average(arr, 0, 0));
  }
  
  public static double average(int[] arr, int index, double sum){
    if(index == arr.length){
      return sum/arr.length;
    }
    
    sum += arr[index];
    return average(arr, index+1, sum);
  }
}
