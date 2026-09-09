package Queues.Problems;

class Queue{
    private int[] data;
    private int size;
    private int currentSize;
    private static final int totalDefaultSize = 10;

    public Queue(){
        this(totalDefaultSize);
    }

    public Queue(int size){
        if(size > 0){
            this.size = size;
            this.data = new int[size];
            this.currentSize = 0;
        }else{
            System.out.println("Invalid Size! Size cannot be negative!!");
        }
    }

    //method for enqueuing 
    public void enqueue(int num){
        if(isFull()){
            System.out.println("Cannot add more elements! Queue is Full");
            return;
        }
        if(currentSize == 0){
            data[0] = num;
            ++currentSize;
            return;
        }
        int[] newArr = new int[data.length+1];
        for(int i = 0; i < data.length; i++){
            newArr[i] = data[i];
        }

        for(int i = newArr.length-1; i > 0; --i){
            newArr[i] = newArr[i-1];
        }
        newArr[0] = num;
        this.data = newArr;
        ++currentSize;
    }

    //method for dequeuing 
    public void dequeue(){
        if(isEmpty()){
            System.out.println("The Queue is Empty!");
            return;
        }

        int[] newArr = new int[data.length-1];
        for(int i = 0; i < newArr.length; ++i){
            newArr[i] = data[i];
        }
        this.data = newArr;
        --currentSize;
    }

    //method for checking whether the queue is full or not
    public boolean isFull(){
        return this.currentSize > size-1;
    }

    //method for checking whether the queue is empty or not
    public boolean isEmpty(){
        return currentSize == 0;
    }

    //method for displaying elements
    public void displayQueue(){
        for(int i = 0; i < currentSize; i++){
            System.out.print(data[i]+"  ");
        }
        System.out.println();
    }
}
public class QueueUsingArray {
    public static void main(String[] args){
        Queue myQueue = new Queue(4);

        myQueue.enqueue(12);
        myQueue.enqueue(18);
        myQueue.enqueue(10);
        myQueue.enqueue(30);
        myQueue.enqueue(17);
        myQueue.enqueue(24);
        myQueue.enqueue(19);

        myQueue.displayQueue();
        
        myQueue.dequeue();
        myQueue.displayQueue();
    }
}
