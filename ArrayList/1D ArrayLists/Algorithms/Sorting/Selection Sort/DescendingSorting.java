package SelectionSort;

import java.util.ArrayList;

public class DescendingSorting{
  public static void main(String[] args){
    ArrayList<Integer> myList = new ArrayList<>();
    
    myList.add(10);
    myList.add(50);
    myList.add(20);
    myList.add(80);
    myList.add(30);
    
    System.out.println("Before Sorting:\n"+myList);
    selectionSort(myList);
    System.out.println("After Sorting:\n"+myList);
  }
  
  public static void selectionSort(ArrayList<Integer> list){
    for(int i = 0; i < list.size()-1; i++){
      int maxIndex = i;
      for(int j = i+1; j < list.size(); j++){
        if(list.get(j) > list.get(maxIndex)){
          maxIndex = j;
        }
      }
      int temp = list.get(maxIndex);
      list.set(maxIndex, list.get(i));
      list.set(i, temp);
    }
  }

}
