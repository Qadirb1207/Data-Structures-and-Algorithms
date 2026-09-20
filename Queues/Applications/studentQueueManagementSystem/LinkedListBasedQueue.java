package Queues.Applications.studentQueueManagementSystem;
import Queues.Applications.studentRecordManagementSystem.Student;

public class LinkedListBasedQueue {
    private Node front;
    private Node rear;
    private int size;
    public LinkedListBasedQueue(){
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public void enqueue(Student student){
        Node node = new Node(student);
        if(rear == null){
            rear = node;
            front = node;
            ++size;
            return;        
        }
        rear.next = node;
        rear = node;
        ++size;
    }


    public Student dequeue(){
        if(isEmpty()){
            System.out.println("Nothing is in the queue");
            return null;
        }
        Student std = front.std;
        front = front.next;
        --size;
        return std;
    }

    public Student peek(){
        if(isEmpty()){
            System.out.println("Nothing is on the peek");
            return null;
        }
        return front.std;
    }

    
    public boolean isEmpty() {
        return size == 0;
    }

    public int size(){
        return size;
    }

    public void display(){
        Node node = front;
        while(node != null){
            System.out.println(node.std);
            System.out.println();
            node = node.next;
        }
    }
    private class Node {
        private Student std;
        private Node next;

        public Node(Student std){
            this.std = std;
            this.next = null;
        }
    }
}
