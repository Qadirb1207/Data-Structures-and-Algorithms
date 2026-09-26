package Queues.LabAssignments.Lab07;

public class Queue {
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    public Queue(int capacity){
        this.arr = new int[capacity];
        this.capacity = capacity;
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    //this is the method for enqueueing the element in the queue, it first checks if the queue is not full
    public void enqueue(int value){
        if(isFull()){
            System.out.println("Array is Full!!");
            return;
        }
        arr[rear++] = value;
        ++size;
    }

    //this is the method for dequeueing the element from the queue, it first checks if the queue is not empty
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty!!");
            return -1;
        }
        int num = arr[front++];
        if(front == rear){
            front = rear = 0;
        }
        --size;
        return num;
    }

    //this is the method for just showing the peek of the queue, it also checks if the queue is not empty
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty There is no peek!");
            return -1;
        }
        return arr[front];
    }

    //this is the method for checking whether the queue is full or not
    public boolean isFull(){
        return this.size == capacity;
    }

    //this is the method for checking whether the queue is empty or not
    public boolean isEmpty(){
        return size == 0;
    }

    //this is the method for displaying the queue
    public void display(){
        for(int i = front; i < rear; i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
}
