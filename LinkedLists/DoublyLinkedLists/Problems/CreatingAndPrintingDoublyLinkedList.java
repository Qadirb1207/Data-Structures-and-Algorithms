package Problems;

class DoublyLinkedList{
  private Node head;
  private Node tail;
  private int size;
  
  public DoublyLinkedList(){
    this.size = 0;
  }

  //method for getting size
 public int getSize(){
  return this.size;
 }

  public void insertFirst(int value){
    Node node = new Node(value);
    
    if(head != null){
       node.next = head;
       head.prev = node;
       head = node;
   }else{
      head = node;
      head.prev = null;
   }
    
    if(tail == null){
      tail = head;
      tail.next = null;    
    }
    ++size;
  }
  
  public String toString(){
    StringBuilder list  = new StringBuilder();
    Node temp = tail;
    while(temp != null){
      list.append(temp.value+", ");
      temp = temp.prev;
    }
    return list.toString();
  }
  
  public void displayInReverse(){
    Node temp = head;
    while(temp != null){
      System.out.print(temp.value+", ");
      temp = temp.next;
    }
    System.out.println();
  }
  
  private class Node{
    private int value;
    private Node next;
    private Node prev;
    
    public Node(int value){
      this.value = value;
    }
  }
}

public class CreatingAndPrintingDoublyLinkedList{
  public static void main(String[] args){
    DoublyLinkedList myList = new DoublyLinkedList();
    
    myList.insertFirst(12);
    myList.insertFirst(19);
    myList.insertFirst(34);
    myList.insertFirst(45);
    myList.insertFirst(55);
    
    System.out.println("Printing original list: ");
    System.out.println(myList);
    System.out.println("Printing in reverse order: ");
    myList.displayInReverse();
  }
}
