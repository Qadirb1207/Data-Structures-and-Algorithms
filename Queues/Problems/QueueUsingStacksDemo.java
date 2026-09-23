package Queues.Problems;

public class QueueUsingStacksDemo{
  public static void main(String[] args){
    QueueUsingStacks queue = new QueueUsingStacks(5);
    
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    queue.enqueue(4);
    queue.enqueue(5);
    
    System.out.println("Queue's Peek is: "+queue.peek());
    System.out.println("Dequeueing some elements: ");
    System.out.println(queue.dequeue());
    System.out.println(queue.dequeue());
    System.out.println(queue.dequeue());
    
    queue.enqueue(6);
    queue.enqueue(7);
    queue.enqueue(8);
    //queue.enqueue(34);
    System.out.println("Queue's Peek is: "+queue.peek());
     System.out.println(queue.dequeue());
     System.out.println(queue.dequeue());
     System.out.println(queue.dequeue());
     
     System.out.println("Queue's Peek is: "+queue.peek());
     
    
    
  }
}
