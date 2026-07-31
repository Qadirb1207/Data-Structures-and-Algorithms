package Problems;

class CircularLinkedList{
  private Node head;
  private Node tail;
  private int size;
  
  public CircularLinkedList(){
    this.size = 0;
  }
  
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
  
  public String toString(){
    StringBuilder list = new StringBuilder();
    Node n = head;
    do{
      list.append(n.value+", ");
      n = n.next;
    }while(n != head);
    list.append(" END");
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

public class CreatingAndPrintingACircularLinkedList{
  public static void main(String[] args){
    CircularLinkedList list = new CircularLinkedList();
    list.insert(3);
    list.insert(19);
    list.insert(10);
    list.insert(13);
    list.insert(18);
    
    System.out.println(list);
  }
}
