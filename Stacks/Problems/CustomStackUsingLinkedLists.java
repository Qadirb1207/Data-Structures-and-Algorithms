package Problems;

class Stack{
  private LinkedList data;
  
  public Stack(){
    this.data = new LinkedList();
  }
  
  public Stack(int value){
    this();
  }
  
  public void push(int value){
    data.add(value);
    System.out.println("Element added");
  }
  
  public void pop(){
    if(!isEmpty()){
      System.out.print("Element popped is: ");
      System.out.println(data.remove());
    }else{
      System.out.println("Stack is Empty!! Nothing to be popped");
      return;
    }
  }  
  
  public boolean isEmpty(){
    return data.getHead() == null;
  }
  
  public int peek(){
    if(!isEmpty()){
      return data.getHead().getValue();
    }else{
      System.out.println("Stack is empty!!!");
      return Integer.MAX_VALUE;
    }
  }
  
  public void showStack(){
    System.out.println(data);
  }
  
}

class LinkedList{
  private Node head;
  private Node tail;
  private int size;
  
  public LinkedList(){
    this.size = 0;
  }
  
  
  public void add(int value){  
    Node node = new Node(value);
    node.next = head;
    head = node;
    if(tail == null){
      tail = head;
    }
    ++size;
  }
  
  public int remove(){
    Node temp = getNode(size-1);
    if(temp != null){
      if(temp == head){
        head = null;
      }
      int val = temp.value;
      tail = temp;
      temp.next = null;
      --size;
      return val;
    }else{
      System.out.println("Stack is empty!!");
      --size;
      return Integer.MIN_VALUE;
    }
  }
  
  public Node getHead(){
    return this.head;
  }
  
  private Node getNode(int index){
    Node n = head;
    for(int i = 0; i < index; i++){
      n = n.next;
    }
    return n;
  }
  
  public String toString(){
    StringBuilder list = new StringBuilder();
    Node node = head;
    while(node != null){
      list.append(node.value+"  ");
      node = node.next;
    }
    return list.toString();
  }
  
  public class Node{
    private int value;
    private Node next;
    
    public Node(int val){
      this.value = val;
    }
    
    public Node(int val, Node nex){
      this.value = val;
      this.next = nex;
    }
    
    public int getValue(){
      return this.value;
    }
  }
}

public class CustomStackUsingLinkedLists{
  public static void main(String[] args){
    Stack myStack = new Stack();
    myStack.push(13);
    myStack.push(21);
    myStack.push(76);
    myStack.push(10);
    myStack.push(24);
    
    System.out.println();
    myStack.showStack();
    System.out.println();
    
    myStack.pop();
    myStack.pop();
    myStack.pop();
    myStack.pop();
    
    
    System.out.println();
    myStack.showStack();
    System.out.println();
  }
}
