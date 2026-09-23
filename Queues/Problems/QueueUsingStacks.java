package Queues.Problems;

public class QueueUsingStacks{
  private Stack stack1;
  private Stack stack2;
  
  public QueueUsingStacks(int size){
    this.stack1 = new Stack(size);
    this.stack2 = new Stack(size);
  }
  
  public void enqueue(int num){
    if(stack1.isFull()){
      System.out.println("Queue is Full!!");
      return;
    }
    stack1.push(num);
  }
  
  public int dequeue(){
     while(!stack1.isEmpty()){
       stack2.push(stack1.pop());
     }
    
    int num = stack2.pop();
    while(!stack2.isEmpty()){
      stack1.push(stack2.pop());
    }
    return num;
  }
  
  
  public int peek(){
    while(!stack1.isEmpty()){
      stack2.push(stack1.pop());
    }
    
    int num = stack2.peek();
    while(!stack2.isEmpty()){
      stack1.push(stack2.pop());
    }
    
    return num;
  }
  
  public boolean isEmpty(){
    return stack1.isEmpty();
  }
}
