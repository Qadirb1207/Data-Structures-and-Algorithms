
public class SecondLargestElement{
  public static int findSecondLargest(int[] arr){
    int max = arr[0];
    int secondMax = arr[1];
    for(int i = 2; i < arr.length; i++){
      if(arr[i] > secondMax && arr[i] < max){
        secondMax =  arr[i] ;
      }else{
        secondMax = max;
        max = arr[i];
      }
    }
    return secondMax;
  }
  public static void main(String[] args){
    int arr[] = {1, 4, 3, 9, 7, 10};
    System.out.println("Second Largest Element is: "+findSecondLargest(arr));
  }
}
