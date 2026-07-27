package Problems;

public class CustomLinkedList{
  private Node head;
  private Node tail;
  private int size;
  
  
  public CustomLinkedList(){
    this.size = 0;
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
  
   public void addFirst(int val){
    Node node = new Node(val);
    node.next = head;
    head = node;
    
    if(tail == null){
      tail = head;
    } 
    ++size;
  }
  
  public void addLast(int val){
    Node node = new Node(val);
    tail.next = node;
    tail = node;
    ++size;
  }
  
  public void add(int val, int index){
    
      if(index == 0){
        addFirst(val);
        return;
      }
      
      if(index == size){
        addLast(val);
        return;
      }
      if(index > size){
        System.out.println("Invalid index");
        return; 
      }
      Node temp = head;
      for(int i = 1; i < index; i++){
        temp = temp.next;
      }
      
      Node node = new Node(val, temp.next);
      temp.next = node;
      size++;
    }
  
  
  
  public String toString(){
    StringBuilder list = new StringBuilder();
    Node temp = head;
    while(temp != null){
      list.append(temp.value+" ");
      temp = temp.next;
    }
    return list.toString();
  }
  
}
