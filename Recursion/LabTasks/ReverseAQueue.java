package Recursion.LabTasks;

class Queue{
    Node front;
    Node rear;
    private class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void enqueue(int value){
        Node node = new Node(value);
        if(isEmpty()){
            front = node;
            rear  = node;
            return;
        }
        rear.next = node;
        rear = node;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Cannot dequeue! Queue is empty!!");
            return -1;
        }
        int data = front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }
        return data;
    }

    public boolean isEmpty(){
        return this.front == null;
    }

    public void display(){
        Node node = front;
        while(node != null){
            System.out.print(node.data+" -> ");
            node = node.next;
        }
        System.out.println("NULL");
    }
}
public class ReverseAQueue {
    private static Queue reverse(Queue q){
        if(q.isEmpty()){
            return q;
        }
        int num = q.dequeue();
        Queue queue = reverse(q);
        queue.enqueue(num);
        return queue;
    }
    public static void main(String[] args){
        Queue q = new Queue();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        q.display();
        Queue reversed = reverse(q);
        reversed.display();
        
    }
}
