package Problems;

class Stack{
  private int[] data;
  private static final int DEFAULT_SIZE = 12;
  private int index;
  
  public Stack(){
    this.data = new int[DEFAULT_SIZE];
    this.index = -1;
  }
  
   public Stack(int size){
    this.data = new int[size];
    this.index = -1;
  }
  
  public void push(int e){
    if(index < data.length-1){
      this.data[++index] = e;
    }else{
      System.out.println("Sorry! Stack is Full!!");
    }
  }
  
  public int pop(){
    if(this.isEmpty()){
      System.out.println("Nothing to pop! Stack is empty");
      return Integer.MIN_VALUE;
    }else{
      return data[index--];
    }
  }
  
  public boolean isEmpty(){
    return index == -1;
  }
  
  public int peek(){
    if(!isEmpty()){
      return data[index];
    }else{
      System.out.println("Nothing is on the peek");
      return Integer.MAX_VALUE;
    }
  }  
}

public class CustomStack{
  public static void main(String[] args){
    Stack myStack = new Stack(3);
    myStack.push(9);
    myStack.push(10);
    myStack.push(14);
    //myStack.push(9);
    System.out.println(myStack.pop());
    System.out.println(myStack.pop());
    //System.out.println(myStack.pop());
   // System.out.println(myStack.pop());
    
    System.out.println("Peek is: "+myStack.peek());
  }
}
