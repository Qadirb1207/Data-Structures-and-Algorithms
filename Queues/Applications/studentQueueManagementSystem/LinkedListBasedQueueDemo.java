package Queues.Applications.studentQueueManagementSystem;

import Queues.Applications.studentRecordManagementSystem.Student;

public class LinkedListBasedQueueDemo {
    public static void main(String[] args){
        LinkedListBasedQueue queue = new LinkedListBasedQueue();
        
        //creating some students
        Student std1 = new Student(100, "Abrar", 19, 3.25, 78.5);
        Student std2 = new Student(101, "Qadir", 19, 3.20, 79.5);
        Student std3 = new Student(102, "Rauf", 20, 3.12, 74.5);
        Student std4 = new Student(103, "Vishal", 19, 3.16, 73);
        Student std5 = new Student(104, "Noor", 21, 3.00, 71);

        //adding these to record (i.e queue in this case)
        //queue.enqueue(std1);
        queue.enqueue(std1);
        queue.enqueue(std2);
        queue.enqueue(std3);
        queue.enqueue(std4);

        //displaying them
        queue.display();

        System.out.println(queue.dequeue());
        // System.out.println("\n");
        // queue.display();

        System.out.println(queue.peek());

        System.out.println("Size of the queue is: "+queue.size());

    }
}
