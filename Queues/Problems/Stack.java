package Queues.Problems;

public class Stack{
  private int[] array;
  private int top;
  private int size;
  
  public Stack(int size){
    this.array = new int[size];
    this.top = -1;
    this.size = size;
  }
  
  public void push(int e){
    if(isFull()){
      System.out.println("Full!!");
      return;
    }
    array[++top] = e;
  }
  
  public int pop(){
    if(isEmpty()){
      System.out.println("Stack is Empty!!!");
      return Integer.MIN_VALUE;
    }
    return array[top--];
  }
  
  public int peek(){
    if(!isEmpty()){
      return array[top];
    }else{
      return -100000;
    }
  }
  public boolean isEmpty(){
    return top == -1;
  }
  
  public boolean isFull(){
    return top == size-1;
  }
}
