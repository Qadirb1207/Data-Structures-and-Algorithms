package SinglyLinkedLists;

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
  
  public String toString(){
    StringBuilder list = new StringBuilder();
    Node temp = head;
    while(temp != null){
      list.append(temp.value+", ");
      temp = temp.next;
    }
    return list.toString();
  }
  
  public int minElement(){
    int min = head.value;
    Node temp = head;
    while(temp != null){
      if(temp.value < min){
        min = temp.value;
      }
      temp = temp.next;
    }
    return min;
  }
  
  private class Node{
    private int value;
    private Node next;
    
    public Node(int value){
      this.value = value;
    }
    
    public Node(int value, Node next){
      this.value = value;
      this.next = next;
    }
  }
}

public class MinimumElementOfLinkedList{
  public static void main(String[] args){
    LinkedList myList = new LinkedList();
    
    myList.add(12);
    myList.add(24);
    myList.add(76);
    myList.add(89);
    myList.add(67);
    
    System.out.println("My Linked List is: "+myList);
    System.out.println("Minimum Element of My LinkedList is : "+myList.minElement());
    
  }
}
