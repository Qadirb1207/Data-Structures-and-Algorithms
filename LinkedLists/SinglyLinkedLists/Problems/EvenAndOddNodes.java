package Problems;

class LinkedList{
  private Node head;
  private Node tail;
  private int size;
  
  public LinkedList(){
    this.size = 0;
  }
  
  public void add(int value){
    Node n = new Node(value);
    n.next = head;
    head = n;
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
      temp  = temp.next;
    }
    return list.toString();
  }
  
  public int evenNodes(){
    int evens = 0;
    Node temp = head;
    while(temp != null){
      if(temp.value % 2 == 0){
        ++evens;
      }
      temp = temp.next;
    }
    return evens;
  }
  
  public int oddNodes(){
    int odds = 0;
    Node temp = head;
    while(temp != null){
      if(temp.value % 2 != 0){
        ++odds;
      }
      temp = temp.next;
    }
    return odds;
  }

  public int getSize(){
    return this.size;
  }
  
  private class Node{
    private int value;
    private Node next;
    
    public Node(int val){
      this.value = val;
    }
  }
}

public class EvenAndOddNodes{
  public static void main(String[] args){
    LinkedList list = new LinkedList();
    list.add(19);
    list.add(98);
    list.add(95);
    list.add(89);
    list.add(88);
    
    System.out.println(list);
    System.out.println("Total Even Numbers are: "+list.evenNodes());
    System.out.println("Total Odd Numbers are: "+list.oddNodes());
    
  }
}
