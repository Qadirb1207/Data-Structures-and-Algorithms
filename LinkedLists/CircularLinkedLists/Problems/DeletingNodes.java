package Problems;

class CircularLinkedList{
  private Node head;
  private Node tail;
  private int size;
  
  public void insert(int value){
    Node node = new Node(value);
    if(head == null){
      head = node;
      tail = node;
      ++size;
      return;
    }
    tail.next = node;
    node.next = head;
    tail = node;
    ++size;
  }

  public void deleteFirst(){
    if(head == tail){
      head = null;
      tail = null;
      return;
    }
    head = head.next;
    if(tail != null){
      tail.next = head;
    }
    --size;
  }
  
 //method for getting size
 public int getSize(){
  return this.size;
 }

  public String toString(){
    StringBuilder list = new StringBuilder();
    Node node = head;
    if(node == null){
      list.append("List is null");
      return list.toString();
    }
    do{
      list.append(node.value+", ");
      node = node.next;
    }while(node != head);
    
    return list.toString();
  }
  
  
  private class Node{
    private int value;
    private Node next;
    
    public Node(int value){
      this.value = value;
    }
  }
}

public class DeletingNodes{
  public static void main(String[] args){
    CircularLinkedList list = new CircularLinkedList();
    list.insert(12);
    list.insert(14);
    list.insert(23);
    list.insert(29);
    list.insert(28);
    
    System.out.println("Original list is: \n"+list);
    list.deleteFirst();
    System.out.println("After deleting first node, list is: \n"+list);
    list.deleteFirst();
    System.out.println("After deleting first node, list is: \n"+list);
    list.deleteFirst();
    System.out.println("After deleting first node, list is: \n"+list);
    list.deleteFirst();
    System.out.println("After deleting first node, list is: \n"+list);
    list.deleteFirst();
   System.out.println("After deleting first node, list is: \n"+list);
  }
}
