public class SortedArrayCheck{
  public static boolean isSorted(int[] arr){
      boolean sorted = true;
    for(int i = 0; i < arr.length-1; i++){  
      if(arr[i] > arr[i+1]){
        sorted = false;
        break;
      }
    }
    return sorted;
  }
  
  public static void main(String[] args){
    int[] arr = {12, 23, 34, 43, 40};
    
    if(isSorted(arr)){
      System.out.println("Array is Sorted!!!");
    }else{
      System.out.println("Array is not Sorted!!!");
    }
  }
}
