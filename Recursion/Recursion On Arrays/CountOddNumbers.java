package ArrayProblems;

public class CountOddNumbers{
  public static void main(String[] args){
    int[] arr = {13, 15, 12, 19, 11};
    
    System.out.println("Total Odd Numbers in the array are: "+countOdds(arr, 0));
  }
  private static int odds = 0;
  public static int countOdds(int[] arr, int index){
    if(index == arr.length){
      return 0;
    }
    
    if(arr[index] % 2 != 0){
      ++odds;
    }
    countOdds(arr, index+1);
    return odds;
  }
}
