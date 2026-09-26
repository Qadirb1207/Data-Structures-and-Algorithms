package Queues.LabAssignments.Lab07;

public class QueueUsingLinkedList {
    private Node front;
    private Node rear;

    public QueueUsingLinkedList(){
        this.front = null;
        this.rear = null;
    }

    //this is the method for enqueueing the elements in the queue
    public void enqueue(int value){
        Node node = new Node(value);
        if(front == null){
            front = node;
            rear = node;
            return;
        }
        rear.next = node;
        rear = node;
    }

    /*this is the method for dequeueing the elements from the queue. 
    It first check if the queue is not empty
    */
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        int num = front.data;
        front = front.next;
        return num;
    }

    /*this is the method for finding the peek of the queue. 
    It first checks if the queue is not empty*/
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty there is no peek!");
            return -1;
        }
        return front.data;
    }

    //this is the method for checking whether the queue is empty or not
    public boolean isEmpty(){
        return front == null;
    }


    //this is the method for displaying the queue
    public void display(){
        Node node = front;
        while(node != null){
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.println();
    }
    private class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
        
    }
}
