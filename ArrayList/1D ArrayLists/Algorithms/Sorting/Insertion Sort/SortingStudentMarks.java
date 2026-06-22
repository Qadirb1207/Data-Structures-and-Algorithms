package InsertionSort;

import java.util.ArrayList;
public class SortingStudentMarks{
  public static void main(String[] args){
    ArrayList <Integer> myList = new ArrayList<>();
    
    myList.add(78);
    myList.add(45);
    myList.add(93);
    myList.add(62);
    myList.add(55);
    myList.add(44);
    myList.add(80);   
    
    System.out.println("Before Sorting:\n"+myList);
    insertionSort(myList);
    System.out.println("After Sorting: \n"+myList);
    
  }
  
  public static void insertionSort(ArrayList<Integer> list){
    for(int i = 0; i < list.size()-1; i++){
      for(int j = i+1; j > 0; j--){
        if(list.get(j) > list.get(j-1)){
          int temp = list.get(j-1);
          list.set(j-1, list.get(j));
          list.set(j, temp);
        }else{
          break;
        }
      }
    }
  }
}
