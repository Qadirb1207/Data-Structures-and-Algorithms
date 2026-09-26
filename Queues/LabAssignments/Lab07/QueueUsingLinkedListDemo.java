package Queues.LabAssignments.Lab07;

public class QueueUsingLinkedListDemo {
    public static void main(String[] args){
        //creating a queue
        QueueUsingLinkedList myQueue = new QueueUsingLinkedList();

        //enqueueing some elements
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);

        
        // displaying the peek
        System.out.println("Peek of the queue is: "+myQueue.peek());
        System.out.println();
        //dequeuing some elements
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());


        System.out.println();
        myQueue.enqueue(6);
        myQueue.enqueue(7);
        System.out.println("Peek of the queue is: "+myQueue.peek());
        System.out.println();
        System.out.println();

        //displaying the whole remaining queue
        myQueue.display();
    }
}
