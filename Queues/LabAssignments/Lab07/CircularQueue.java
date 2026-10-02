package Queues.LabAssignments.Lab07;

public class CircularQueue {
    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    CircularQueue(int capacity){
        this.arr = new int[capacity];
        this.front = this.rear = this.size = 0;
        this.capacity = capacity;
    }

    public void enqueue(int value){
        if(isFull()){
            System.out.println("Queue is Full!");
            return;
        }

        arr[rear] = value;
        rear = (rear+1)%capacity;
        ++size;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty!");
            return -1;
        }
        int num = arr[front];
        front = (front+1)%capacity;
        --size;
        return num;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty!");
            return -1;
        }
        int num = arr[front];
        return num;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public boolean isFull(){
        return this.size == capacity;
    }
}
