package Queues.Applications.studentRecordManagementSystem;

public class ArrayBasedQueue {
    private Student[] data;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public ArrayBasedQueue(int capacity){
        this.data = new Student[capacity];
        this.capacity = capacity;
        this.front = this.rear = this.size = 0;
    }

    public void enqueue(Student student){
        if(isFull()){
            System.out.println("Queue is Full!!!");
            return;
        }

        data[rear] = student;
        rear = (rear+1)%capacity;
        ++size;
    }

    public Student dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty!!!");
            return null;
        }

        Student std = data[front];
        front = (front +1)%capacity;
        --size;
        return std;
    }

    public Student peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty! Nothing is on its peek");
            return null;
        }
        return data[rear];
    }


    public boolean isFull() {
        return this.size == capacity-1;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size(){
        return this.size;
    }

    public int capacity(){
        return this.capacity;
    }

    public void display(){
        for(int i = front; i < rear; i++){
            System.out.println(data[i]);
            System.out.println();
        }
    }
}
