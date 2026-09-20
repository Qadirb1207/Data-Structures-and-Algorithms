package LabAssignments.Lab6;

class Stack{
    private Node top;
    private Node bottom;

    public void push(int num){
        Node newNode = new Node(num);
        if(isEmpty()){
            top = newNode;
            bottom = newNode;
            return;
        }
        
        newNode.next = top;
        top = newNode;
    }


    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty!!");
        }
        int data = top.data;
        top = top.next;
        return data;
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty!!");
        }
        return top.data;
    }

    public boolean isEmpty() {
        return this.top == null;
    }

    public void display(){
        Node node = top;
        while(node != null){
            System.out.print(node.data+" -> ");
            node = node.next;
        }
        System.out.println("NULL");
    }
    private class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
}
public class StackUsingLinkedList {
    public static void main(String[] args){
        Stack myStack = new Stack();

        myStack.push(9);
        myStack.push(17);
        myStack.push(18);
        myStack.push(15);
        myStack.push(13);
        myStack.push(12);

        myStack.display();
    }
}
