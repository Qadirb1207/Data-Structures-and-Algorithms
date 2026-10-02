package Queues.LabAssignments.Lab07;

public class CircularQueueDemo {
    public static void main(String[] args){
        CircularQueue queue = new CircularQueue(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        
        System.out.println("Peek is: "+queue.peek());

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        System.out.println("Peek is: "+queue.peek());

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());



    }
}
