package Queues.LabAssignments.Lab07;
class Stack{
    private int[] arr;
    private int top;

    Stack(int capacity){
        this.arr = new int[capacity];
        this.top = -1;
    }

    public void push(int value){
        if(isFull()){
            System.out.println("Array is Full");
            return;
        }
        arr[++top] = value;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty!");
            return -1;
        }

        return arr[top--];
    }
    public boolean isFull(){
        return top == arr.length-1;
    }

    public boolean isEmpty(){
        return top == -1;
    }
}

class Queue{
    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public Queue(int capacity){
        this.arr = new int[capacity];
        this.capacity = capacity;
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    public void enqueue(int value){
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        }
        arr[rear++] = value;
        ++size;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty!");
            return -1;
        }
        int num = arr[front];
        front++;
        --size;
        if(front == rear){
            front = rear = 0;
        }
        return num;
    }

    public boolean isFull(){
        return size == capacity;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("No Peek exists! Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    public void reverse(){
        if(isEmpty()){
            System.out.println("Queue is Empty! Cannot reverse it");
            return;
        }


        Stack stack = new Stack(capacity);
        for(int i = 0; i < capacity; i++){
            stack.push(dequeue());
        }

        for(int i = 0; i < capacity; i++){
            enqueue(stack.pop());
        }
    }

    public void display(){
        for(int i = front; i < rear; ++i){
            System.out.print(arr[i] +"  ");
        }
        System.out.println();
    }
}
public class ReversingAQueue {
    public static void main(String[] args){
        Queue myQueue = new Queue(5);

        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);

        System.out.println("Original Queue: ");
        myQueue.display();

        myQueue.reverse();

        System.out.println("Reversed Queue: ");
        myQueue.display();
    }
}
