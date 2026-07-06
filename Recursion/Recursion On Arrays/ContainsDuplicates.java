package ArrayProblems;

public class ContainsDuplicates{
  public static void main(String[] args){
    int[] arr = {12, 13, 13, 19};
    System.out.println("Does Array contain duplicates? : "+ containsDuplicates(arr, 0));
  }
  
  public static boolean containsDuplicates(int[] arr, int index){
    if(index == arr.length){
      return false;
    }
    
    if(arr[index] == arr[index+1]){
      return true;
    }
    return containsDuplicates(arr, index+1);
  }
}
