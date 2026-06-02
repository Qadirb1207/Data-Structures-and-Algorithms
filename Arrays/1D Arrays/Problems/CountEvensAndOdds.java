
public class CountEvensAndOdds{
  public static void countEvensAndOdds(int[] arr){
    int evenCount = 0, oddCount = 0;
    for(int i = 0; i < arr.length; i++){
      if(arr[i] % 2 == 0){
        evenCount++;
      }else{
        oddCount++;
      }
   }
   System.out.println(" Total Even Numbers: "+evenCount+"\n Total Odd Numbers: "+oddCount+"\n Total: "+(evenCount+oddCount));
  }
  public static void main(String[] args){
    int arr[] = {12, 1, 3, 5, 4, 6, 8, 9, 10};
    countEvensAndOdds(arr);
  }
}
