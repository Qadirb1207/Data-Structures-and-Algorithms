import java.util.Arrays;
public class RemoveDuplicate{
  public static int[] removeDuplicates(int[] arr){
    int uniqueIndex = 0; //pointer for tracking uniqueIndices in the array
    for(int i = 0; i < arr.length - 1; i++){
      if(arr[i] != arr[i+1]){//if the two adjacent elements are not equal move the pointer to next one
        uniqueIndex++;
        //swap the element to which the pointer is pointing to and the element after it
        int temp = arr[i+1];
        arr[i+1] = arr[uniqueIndex];
        arr[uniqueIndex] = temp;
      }
    }
    System.out.println(uniqueIndex);
    int[] uniqueArr = new int[uniqueIndex+1];
    for(int i = 0; i < uniqueArr.length; i++){
      uniqueArr[i] = arr[i];
    }
    return uniqueArr;
  }
  
  public static void main(String[] args){
    int[] arr = {5, 6, 7, 6, 9};
    Arrays.sort(arr);
    int[] distinctArr = removeDuplicates(arr);
    for(int i = 0; i < distinctArr.length; i++){
      System.out.print(distinctArr[i] +" \t");
    }
  }
}
