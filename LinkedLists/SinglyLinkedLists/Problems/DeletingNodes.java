package Problems;

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
  
  public void deleteFirst(){
    head = head.next;
  }
  
  public void deleteLast(){
    Node temp = head;
    for(int i = 1; i < size; i++){
      temp = temp.next;
    }
    
    tail = temp;
    temp.next = null;
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

public class DeletingNodes{
  public static void main(String[] args){
    LinkedList myList = new LinkedList();
    
    myList.add(12);
    myList.add(29);
    myList.add(20);
    myList.add(27);
    
    System.out.println("Original List is: "+myList);
    myList.deleteFirst();
    System.out.println("After deleting first element the List is: "+myList);
    myList.deleteLast();
    System.out.println("After deleting last element the List is: "+myList);
  }
}
