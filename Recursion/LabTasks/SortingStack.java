package Recursion.LabTasks;
class Stack{
    int[] arr;
    int top;
    int capacity;
    Stack(int totalSize){
        this.arr = new int[totalSize];
        this.top = -1;
        this.capacity = totalSize;
    }

    public void push(int element){
        if(isFull()){
            System.out.println("Stack is full!!");
            return;
        }
        arr[++top] = element;
    }
    
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty!!");
            return -1;
        }
        return arr[top--];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == arr.length-1;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("No peek available!! Stack is Empty!!");
            return -1;
        }
        return arr[top];
    }

    public void display(){
        for(int i = top; i >= 0; i--){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
}
public class SortingStack {
    // private static Stack sortStack(Stack s){
    //     Stack temp = new Stack(s.capacity);
    //     if(s.isEmpty()){
    //         return temp;
    //     }
        
    //     temp.push(s.pop());
    //     int num2 = temp.pop();
    //     int num1 = s.pop();
    //     if(num2 < num1){
    //         s.push(num2);
    //         sortedInsert(temp, num1);
    //     }
    //     Stack sorted = sortStack(s);
    //     return sorted;
    // }
    private static Stack sortStack(Stack s){
        Stack temp = new Stack(s.capacity);
        int num1 = s.pop();
        temp.push(num1);
        while(!s.isEmpty()){
            int num2 = s.pop();

            if(temp.peek() > num2){
                temp.push(num2);
            }else{ 
                while(!temp.isEmpty() && num2 > temp.peek()){
                    s.push(temp.pop());
                }
                temp.push(num2);
               
                temp.push(s.pop());
            } 
        }
        return temp;
    }
    public static void sortedInsert(Stack s, int element){
        s.push(element);
    }
    public static void main(String[] args){
        Stack s = new Stack(4);

        s.push(3);
        s.push(4);
        s.push(9);
        s.push(2);
        s.display();
        Stack sorted = sortStack(s);
        
        sorted.display();
    }
}
