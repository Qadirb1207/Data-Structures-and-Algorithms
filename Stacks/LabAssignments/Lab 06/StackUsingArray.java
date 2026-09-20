class Stack{
    private int[] arr;
    private int index;

    public Stack(int capacity){
        if(capacity > 0){
            this.arr = new int[capacity];
            this.index = -1;
        }
        else{
            System.out.println("Invalid Capacity!! Capacity cannot be negative");
        }
    }

    public void push(int num) throws Exception{
        if(isFull()){
            throw new Exception("Stack is Full");
        }
        arr[++index] = num;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty!!");
        }
        return arr[index--];
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty");
        }
        return arr[index];
    }

    public boolean isFull() {
        return index == arr.length-1;
    }

    public boolean isEmpty() {
        return index == -1;
    }

    public void display() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty!!");
        }
        for(int i = 0; i <= index; ++i){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
    }
}

public class StackUsingArray {
    public static void main(String[] args) throws Exception{
        Stack myStack = new Stack(4);

        myStack.push(12);
        myStack.push(14);
        myStack.push(18);
        myStack.push(21);
        // myStack.push(15);
        // myStack.push(90);
        // myStack.push(78);

        myStack.display();
    }
}
