package ArrayProblems;

public class CheckAllEvens{
  public static void main(String[] args){
    int[] arr = {12, 14, 18, 16};
    
    System.out.println("Are all elements even? = "+isAllEvens(arr, 0, false));
  }
  
  public static boolean isAllEvens(int[] arr, int index, boolean isEven){
    if(index == arr.length){
      return isEven;
    }
    
    if(arr[index] % 2 == 0){
      isEven = true;
    }else{
      isEven = false;
      return isEven;
    }
    
    return isAllEvens(arr, index+1, isEven);
  }
}
