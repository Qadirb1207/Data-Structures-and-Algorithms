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
      node.prev = null;
    }else{
      node.next = head;
      head.prev = node;
      head = node;
    }
    
    if(tail == null){
      tail = head;
      tail.next = null;
    }
    
    ++size;
    
  }
  
  public void deleteFirst(){
    head = head.next;
    if(head != null){
      head.prev = null;
    }
    else{
      tail = null;
    }
    
    --size;
  }
  
  public void deleteLast(){
    if(tail == null && head == null){
      System.out.println("List is already empty nothing to be deleted");
      return;
    }
    tail = tail.prev;
    if(tail != null)
      tail.next = null;
    else
      head = null;
    
    
    --size;
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
  
  public void deleteAt(int index){
    if(index == 0){
      deleteFirst();
      return;
    }
    
    if(index == size-1){
      deleteLast();
      return;
    }
    
    if(index < 0 || index > size-1){
      System.out.println("Invalid Index!!!");
      return;
    }
    Node temp = head;
    for(int i = 0; i < index-1; i++){
      temp = temp.next;
    }
    temp.next = temp.next.next;
    temp.next.next.prev = null;
    
    --size;
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
public class DeletingNodesInLinkedList{
  public static void main(String[] args){
    DoublyLinkedList list = new DoublyLinkedList();
    
    list.insertFirst(45);
    list.insertFirst(90);
    list.insertFirst(19);
    list.insertFirst(34);
    System.out.println("Original List: ");
    System.out.println(list);
    
    list.deleteFirst();
    System.out.println("After deleting first element: ");
    System.out.println(list);
    
    list.deleteLast();
    System.out.println("After deleting last element: ");
    System.out.println(list);
    
    int index = 1;
    list.deleteAt(index);
    System.out.println("After deleting element at index "+index+": ");
    System.out.println(list);
    // ERROR _________!!!! index 1 no longer exists now
    list.deleteAt(index);
    System.out.println("After deleting element at index "+index+": ");
    System.out.println(list);
  }
}
