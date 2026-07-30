package Problems;

class DoublyLinkedList{
  private Node head;
  private Node tail;
  private int size;
  
  public DoublyLinkedList(){
    this.size = 0;
  }
  
  public void insertFirst(int value){
    Node node = new Node(value);
    
    if(head == null){
      head = node;
      head.prev = null;
    }else{
      node.next = head;
      head.prev = node;
      head = node;
    }
    
    if(tail == null){
      tail = head;
      tail.next = null;
    }
  }
  
  public void insertLast(int value){
    Node node = new Node(value);
    if(tail == null){
      tail = node;
      tail.next = null;
    }else{
      tail.next = node;
      node.prev = tail;
      tail = node;
    }
    
    if(head == null){
      head = tail;
      head.prev = null;
    }
    
    ++size;
  }
  
  public void insertAt(int value, int index){
    if(index == 0){
      insertFirst(value);
      return;
    }
    if(index == size-1){
      insertLast(value);
      return;
    }
    if(index >= size){
      System.out.println("Invalid Index!!");
      return;
    }
    Node node = new Node(value);
    Node temp = head;
    for(int i = 0; i < index-1; i++){
      temp  = temp.next;
    }
    temp.next = node;
    node.prev = temp;
    
    node.next = temp.next.next;
    temp.next.prev = node;
    
    ++size;
    System.out.println(value+" is inserted at "+index);
  }
  
  public String toString(){
    StringBuilder list = new StringBuilder();
    Node temp = tail;
    while(temp != null){
      list.append(temp.value+", ");
      temp = temp.prev;
    }
    return list.toString();
  }
  
  private class Node{
    private int value;
    private Node next;
    private Node prev;
    
    public Node(int value){
      this.value = value;
    }
    
    public Node(int value, Node next){
      this.value = value;
      this.next = next;
    }
    
    public Node(int value, Node next, Node prev){
      this.value = value;
      this.next = next;
      this.prev = prev;
    }
  }
}

public class InsertingInDoublyLinkedList{
  public static void main(String[] args){
    DoublyLinkedList list = new DoublyLinkedList();
    
    list.insertLast(34);
    list.insertLast(24);
    list.insertLast(89);
    list.insertLast(10);
    System.out.println(list);
    System.out.println();
    list.insertAt(19, 3);
    System.out.println(list);
    System.out.println();
  }
}
