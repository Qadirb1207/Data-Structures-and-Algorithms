package Algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearch{
  public static void main(String[] args){
    Scanner sc = new  Scanner(System.in);
    ArrayList<Integer> myList = new ArrayList<>();
    
    for(int i = 0; i < 5; i++){
      System.out.print("Enter number "+(i+1)+" = ");
      myList.add(sc.nextInt());
    }
    
    System.out.print("\n\nEnter the target to search from the list of numbers = ");
    int target = sc.nextInt();
    
    binarySearch(myList, target);
    
    sc.close();
  }
  
  public static void binarySearch(ArrayList<Integer> list, int target){
    int start = 0, end = list.size()-1;
    
    while(start <= end){
      int mid = start +(end-start)/2;
      if(list.get(mid) == target){
        System.out.println("Element found at index:"+ mid+" and position: "+(mid+1));
        return;
      }else if(target > list.get(mid)){
        start = mid+1;
      }else{
        end = mid-1;
      }
    }
    System.out.println("The element is not present");
  }
}
