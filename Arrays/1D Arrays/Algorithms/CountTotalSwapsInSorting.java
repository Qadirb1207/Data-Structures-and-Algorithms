public class CountTotalSwapsInSorting{
  public static void main(String[] args){
    int[] arr = {12, 3, 10, 5, 7, 6};
    System.out.println("Total swaps in sorting the array are: "+totalSwaps(arr));
  }
  
  public static int totalSwaps(int[] arr){
    int swaps = 0;
    for(int i = 0; i < arr.length-1; i++){
      boolean isSwapped  = false;
      for(int j = 1; j <= arr.length-i-1; j++){
        if(arr[j-1] > arr[j]){
          swaps++;
          isSwapped = true;
        }
      }
      if(!isSwapped){
        break;
      }
    }
    return swaps;
  }
}
