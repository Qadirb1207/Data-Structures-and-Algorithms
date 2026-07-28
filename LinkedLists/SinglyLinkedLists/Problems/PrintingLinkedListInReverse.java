package Problems;

class LinkedList{
  private Node head;
  private Node tail;
  private int size;
  
  public LinkedList(){
    this.size = 0;
  }
  
  public Node getHead(){
    Node temp = head;
    return temp;
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
  
  public String toString(){
    StringBuilder list = new StringBuilder();
    Node temp = head;
    while(temp != null){
      list.append(temp.value+"\t");
      temp = temp.next;
    }
    return list.toString();
  }
  
  
  public void reversePrint(Node n){
    if(n == null){
      return;
    }
    reversePrint(n.next);
    
    System.out.print(n.value+"\t");
    
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

public class PrintingLinkedListInReverse{
  public static void main(String[] args){
    LinkedList myList = new LinkedList();
    myList.add(10);
    myList.add(15);
    myList.add(29);
    myList.add(35);
    
    System.out.println("Original List is: ");
    System.out.println(myList);
    
    System.out.println("Printing is in reverse order:");
    myList.reversePrint(myList.getHead());
        System.out.println();
    
  }
}
