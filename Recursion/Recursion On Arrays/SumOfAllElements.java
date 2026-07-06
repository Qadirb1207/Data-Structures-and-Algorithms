package ArrayProblems;

public class SumOfAllElements{
  public static void main(String[] args){
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    
    int sum = sumOfAllElements(arr, 0, 0);
    
    System.out.println("Sum of all elements of the array is: "+sum);
  }
  
  public static int sumOfAllElements(int[] arr, int index){
    int sum = 0;
    if(index == arr.length){
      return 0;
    }
    
    sum += arr[index];
    int sum2 = sumOfAllElements(arr, index+1);
    sum += sum2;
    return sum;
  }
  
  
  public static int sumOfAllElements(int[] arr, int index, int sum){
    if(index == arr.length){
      return sum;
    }
    
    sum += arr[index];
    
    return sumOfAllElements(arr, index+1, sum);
  }
}
