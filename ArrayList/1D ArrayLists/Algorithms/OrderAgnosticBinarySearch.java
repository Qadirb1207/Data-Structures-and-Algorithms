package Algorithms;

import java.util.ArrayList;

class IntegerArrayList{
  private ArrayList<Integer> list;
  private int pointer;
  private boolean isSorted;
  
  public IntegerArrayList(){
    this.list = new ArrayList<>();
    this.pointer= 0;
  }
  
  public IntegerArrayList(int initialCap){
    this.list = new ArrayList<>(initialCap);
    this.pointer = 0;
  }
  
   private void isSortedAsc(){
    if(list.get(0) > list.get(list.size()-1))){
      this.isSorted = true;
    }else{
      this.isSorted = false;
    }
  }
  private void isSortedDesc(){
     if(list.get(0) < list.get(list.size()-1))){
      this.isSorted = true;
    }else{
      this.isSorted = false;
    }
  }
  
  public void add(int num){
    this.list.add(num);
  }
  
  public int get(int index){
    return this.list.get(index);
  }
  
  public void display(){
    System.out.println(this.list);
  }
  public void search(int target){
    if(this.isSorted){
      int start = 0, end = list.size()-1;
      boolean isAsc = arr[start] < arr[end];
      while(start <= end){
        int mid = start + (end - start)/2;
        if(arr[mid] == target){
          System.out.println("Element found at the index: "+mid);
          return;
        }
      
        if(isAsc){
          if(target > arr[mid]){
            start = mid+1;
          }else{
            end = mid - 1;
          }
        }else{
          if(target > arr[mid]){
            end = mid - 1;
          }else{
            start = mid + 1;
          }
        }
      }
    }
  }else{
     System.out.println("Please Sort the list first using sortAscending() or sortDescending() method");
  }
  
  public void sortAscending(){
    for(int i = 0; i < list.size()-1; i++){
      int minIndex = i;
     for(int j = i+1; j < list.size(); j++){
      if(list.get(j) < list.get(minIndex)){
        minIndex = j;
      }
     }
     int temp = list.get(i);
     list.set(i, list.get(minIndex));
     list.set(minIndex, temp);      
    }
    isSortedAsc();
  }
}
