package ArrayProblems;

public class CountZeros{
  public static void main(String[] args){
    int[] arr = {1, 0, 0, 1, 0, 0, 1, 1, 1, 0};
    int zeros = countZeros(arr, 0, 0);
    System.out.println("Number of zeros in the array is : "+zeros);
  }
  
  public static int countZeros(int[] arr, int index, int count){
    if(index == arr.length){
      return count;
    }
    
    if(arr[index] == 0){
      return countZeros(arr, index+1, ++count);
    }
    return countZeros(arr, index+1, count);
  }
}
