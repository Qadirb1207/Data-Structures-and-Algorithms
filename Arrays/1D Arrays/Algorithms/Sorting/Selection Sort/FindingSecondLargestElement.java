package SelectionSort;

public class FindingSecondLargestElement{
  public static void main(String[] args){
    int[] arr = {12, 32, 11, 28, 29};
    System.out.println("Second Largest Element is: "+secondLargestElement(arr));
  }
  
  public static int secondLargestElement(int[] arr){
    for(int i = 0; i < arr.length; i++){
      int minIndex = i;
      for(int j = i+1; j < arr.length; j++){
        if(arr[j] < arr[minIndex]){
          minIndex = j;
        }
      }
      int temp = arr[i]; 
      arr[i] = arr[minIndex];
      arr[minIndex] = temp;
    }
    return arr[arr.length-2];
  }
}
