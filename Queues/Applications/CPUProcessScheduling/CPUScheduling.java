package Queues.Applications.CPUProcessScheduling;

public class CPUScheduling {
    private String[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;


    public CPUScheduling(int capacity){
        this.arr = new String[capacity];
        this.front = this.rear = this.size = 0;
        this.capacity = capacity;
    }

    public void addProcess(String processName){
        if(isFull()){
            System.out.println("Processing Queue is Full!");
            return;
        }

        arr[rear++] = processName;
        ++size;
    }

    public String executeProcess(){
        if(isEmpty()){
            System.out.println("Processing Queue is Empty!");
            return "";
        }

        String current = arr[front];
        front += 1;
        if(front == rear){
            front = rear = 0;
        }
        
        --size;
        return current;
    }

    public void displayProcesses(){
        if(isEmpty()){
            System.out.println("Processing Queue is Empty");
            return;
        }

        for(int i = front;  i < rear; i++){
            System.out.print(arr[i]+" -> ");
        }
        System.out.println();
    }

    public boolean isFull(){
        return this.size == capacity;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }
}
