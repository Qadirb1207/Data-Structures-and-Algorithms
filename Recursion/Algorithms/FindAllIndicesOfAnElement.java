package ArrayProblems;

import java.util.ArrayList;
public class FindAllIndicesOfAnElement{
  public static void main(String[] args){
    int[] arr = {5, 4, 4, 6};
    int key = 4;
    ArrayList<Integer> answers = findAllIndices(arr, 0, key);
    System.out.println(answers);
  }
  
  public static ArrayList<Integer> findAllIndices(int[] arr, int index, int target){
    ArrayList<Integer> indices = new ArrayList<>();
    if(index == arr.length){
      return indices;
    }
    
    if(arr[index] == target){
      indices.add(index);
    }
    
    ArrayList<Integer> allIndices = findAllIndices(arr, index+1, target);//index = 1 ; allIndices = [1]; index = 2; allIndices = [1, 2]
    indices.addAll(allIndices);
    return indices;
  }
}
