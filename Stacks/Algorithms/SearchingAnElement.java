package Algorithms;

class Stack{
  private int[] arr;
  private int index;
  
  public Stack(){
    arr = new int[5];
    index = -1;
  }
  
  public Stack(int size){
    arr = new int[size];
    index = -1;
  }
  
  public void push(int e){
    if(index < arr.length-1){
      arr[++index] = e;
    }else{
      System.out.println("Stack is full");
    }
  }
  
  public int pop(){
    if(!isEmpty()){
      return arr[index--];
    }else{
      System.out.println("Stack is empty");
      return Integer.MIN_VALUE;
    }
  }
  
  private boolean isEmpty(){
    return index == -1;
  }
  
  public int search(int key){
    int keyIndex = -1;
    for(int i = 0; i < arr.length; i++){
      if(arr[i] == key){
        keyIndex = i;
        break;
      }
    }
    return keyIndex;
  }
}

public class SearchingAnElement{
  public static void main(String[] args){
    Stack stack = new Stack();
    stack.push(18);
    stack.push(23);
    stack.push(34);
    stack.push(54);
    stack.push(65);
    
    int ans = stack.search(65);
    if(ans > -1){
      System.out.println("The element is present at index: "+ans);
    }else{
      System.out.println("The element is not present ");
    }
  }
}
