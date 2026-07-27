package Problems;

class MyLinkedList{
  private Node head;
  private Node tail;
  private int size;
  
  public MyLinkedList(){
    this.size = 0;
  }
  
  public void addFirst(int val){
    Node node = new Node(val);
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
  
  public int maxElement(){
    int max = head.value;
    Node temp = head;
    while(temp != null){
      if(temp.value > max){
        max = temp.value;
      }
      temp = temp.next;
    }
    return max;
  }
  
  private class Node {
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

public class MaximumElementOfLinkedList{
  public static void main(String[] args){
    MyLinkedList linkedList = new MyLinkedList();
    
    linkedList.addFirst(12);
    linkedList.addFirst(23);
    linkedList.addFirst(20);
    linkedList.addFirst(28);
    linkedList.addFirst(27);
    linkedList.addFirst(289);
    linkedList.addFirst(59);
    
    System.out.println("Linked List is: "+linkedList);
    System.out.println("Maximum Element of Linked List is: "+linkedList.maxElement());
    
  }
}
