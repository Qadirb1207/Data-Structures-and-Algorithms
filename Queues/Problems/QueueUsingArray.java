package Queues.Problems;

class Queue{
    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public Queue(int capacity){
        if(capacity > 0){
            this.arr = new int[capacity];
            this.front = 0;
            this.rear = 0;
            this.size = 0;
            this.capacity = capacity;
        }else{
            System.out.println("Invalid capacity!!");
        }
    }

    public void enqueue(int num){
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        }
            arr[rear] = num;
            rear = (rear+1)%capacity;
            ++size;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty!!!");
            return Integer.MIN_VALUE;
        }
        int value = arr[front];
        front = (front+1)%capacity;
        return value;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    private boolean isFull() {
        return size == capacity;
    }
    
    public int peek(){
        return this.arr[front];
    }

    public void displayQueue(){
        for(int i = front; i < size; i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
}

public class QueueUsingArray{
    public static void main(String[] args){
        Queue queue = new Queue(5);
        queue.enqueue(12);
        queue.enqueue(13);
        queue.enqueue(14);
        queue.enqueue(16);
        queue.enqueue(17);
        queue.enqueue(19);

        queue.displayQueue();

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        queue.displayQueue();
    }
}
