package ArrayProblems;

public class LinearSearch{
  public static void main(String[] args){
    int[] arr = {12, 18, 19, 11, 11};
    int index = linearSearch(arr, 0, 11);
    if(index > -1){
      System.out.println("11 is present in the array at index: "+index);
    }else{
      System.out.println("Element is not present");
    }
    
  }
  private static int elementIndex = -1;
  public static int linearSearch(int[] arr, int index, int target){
    if(index == arr.length-1){
      return elementIndex;
    }
    
    if(arr[index] == target){
      elementIndex = index;
    }
    
    return linearSearch(arr, index+1, target);
  }
}
