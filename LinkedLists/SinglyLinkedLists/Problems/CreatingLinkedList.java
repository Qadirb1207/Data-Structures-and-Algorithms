package Problems;

class MyLinkedList{
  private Node head;
  private Node tail;
  private int size;
  
  MyLinkedList(){
    this.size = 0;
  }
  
  public void add(int val){
    Node n = new Node(val);
    n.next = head;
    this.head = n;
    if(tail == null){
      tail = head;
    }

    ++size;
  }
  
  public int totalNodes(){
    Node temp = head;
    int nodes = 0;
    while(temp != null){
      ++nodes;
      temp = temp.next;
    }
    return nodes;
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
    
    public Node(int val){
      this.value = val;
    }
    
    public Node(int val, Node n){
      this.value = val;
      this.next = n;
    }
  }
}

public class CreatingLinkedList{
  public static void main(String[] args){
    MyLinkedList list = new MyLinkedList();
    
    list.add(12);
    list.add(18);
    list.add(9);
    
    System.out.println(list);
    System.out.println("Total  Nodes in the list are: "+list.totalNodes());
  }
}
