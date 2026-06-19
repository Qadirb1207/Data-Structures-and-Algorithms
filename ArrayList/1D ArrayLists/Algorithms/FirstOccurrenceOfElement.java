package Algorithms;

import java.util.ArrayList;

public class FirstOccurrenceOfElement{
  public static void main(String[] args){
    ArrayList<Integer> myList = new ArrayList<>();
    myList.add(19);
    myList.add(1);
    myList.add(-1);
    myList.add(-9);
    myList.add(-9);
    System.out.println(myList);
    System.out.println("First occurrence of -9 in the list is at: "+firstOccurrence(myList, -9));
  }
  
  public static int firstOccurrence(ArrayList<Integer> list, int target){
    int start = 0, end = list.size()-1;
    int firstIndex = -1;
    while(start <= end){
      int mid = start +(end-start)/2;
      
      if(list.get(mid) == target){
        if(list.get(mid-1) != target){
          firstIndex = mid;
        }else{
          firstIndex = mid-1;
        }
        start = mid+1;
      }else if(list.get(mid) < target){
        end = mid-1;
      }else{
        start = mid+1;
      }
    }
    return firstIndex;
  }
}
