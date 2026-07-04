package ArrayProblems;

public class CountOccurrences{
  
  public static void main(String[] args){
    int[] arr = {12, 18, 19, 11, 11};
    int occurrenceCount = occurrences(arr, 0, 11);
    if(occurrenceCount > 0){
      System.out.println("11 is present in the array "+occurrenceCount+" times");
    }else{
      System.out.println("Element is not present");
    }
  }
  static  int count = 0;
  public static int occurrences(int[] arr, int index, int element){
   
    if(index == arr.length-1){
      return count;
    }
    
    if(arr[index] == element){
      ++count;
    }
    return count+occurrences(arr, index+1, element);
    
  }
}
