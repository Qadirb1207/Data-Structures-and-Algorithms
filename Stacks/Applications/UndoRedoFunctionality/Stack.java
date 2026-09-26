package Applications.UndoRedoFunctionality;

public class Stack {
    private String[] array;
    private int size;
    private int top;

    public Stack(int size){
        this.array = new String[size];
        this.size = size;
        this.top = -1;
    }

    public void push(String str){
        if(isFull()){
            System.out.println("Stack is Full!");
            return;
        }
        array[++top] = str;
    }

    public String pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty!!");
            return "";
        }
        return array[top--];
    }

    public boolean isFull(){
        return top == size-1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void display(){
        for(int i = top; i >= 0; --i){
            System.out.println(array[i]);
        }
    }
}
