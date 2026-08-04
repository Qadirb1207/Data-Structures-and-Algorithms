package Problems;

class Stack{
  private int[] data;
  private int index;
  private static final int DEFAULT_SIZE = 10;
  
  public Stack(){
    this(DEFAULT_SIZE);
  }
  
  public Stack(int size){
    this.data = new int[size];
    this.index = -1;
  }
  
  public void push(int e){
    if(index < data.length-1){
      data[++index] = e;
    }else{
      System.out.println("Stack is Full!!");
      return;
    }
  }
  
  //this method is kept private because it is used inside this class only
  private int pop(){
    if(!isEmpty()){
      return data[index--];
    }else{
      System.out.println("Stack is empty");
      return Integer.MAX_VALUE;
    }
  }
  
  private boolean isEmpty(){
    return index == -1;
  }
  
  public void printReverse(){
    for(int i = 0; i < this.data.length; i++){
      System.out.println(this.pop());
    }
  }
}

public class PrintingStackInReverse{
  public static void main(String[] args){
    Stack myStack = new Stack(4);
    myStack.push(10);
    myStack.push(20);
    myStack.push(30);
    myStack.push(40);
    
    
    myStack.printReverse();
  }
}
