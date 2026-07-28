package Problems;

class LinkedList{
  private Node head;
  private Node tail;
  private int size;
  
  public LinkedList(){
    this.size = 0;
  }
  
  public void addFirst(int value){
    Node node = new Node(value);
    node.next = head;
    head = node;
    if(tail == null){
      tail = head;
    }
    
    ++size;
  }
  
  public void addLast(int value){
    Node node = new Node(value);
    tail.next = node;
    tail = node;
    ++size;
  }
  
  
  public void addAt(int val, int index){
    if(index == 0){
      addFirst(val);
      return;
    }
    if(index == size){
      addLast(val);
      return;
    }
    
    if(index > size || index < 0){
      System.out.println("Invalid Index");
      return;
    }
    Node temp = head;
    for(int i = 1; i < index; i++){
      temp = temp.next;
    }
    Node n = temp.next;
    Node node = new Node(val);
    node.next = n;
    temp.next = node;
  }
  
  public void addBefore(int value, int before){
    int index = presentAt(before);
    if(index > -1){
      addAt(value, index);
    }else{
      System.out.println("Invalid value! Value is not present in the list");
    }
  }
  
  
  public void addAfter(int value, int after){
    int index = presentAt(after);
    if(index > -1){
      addAt(value, index+1);
    }else{
      System.out.println("Invalid value! Value is not present in the list");
    }
  }
  
  public String toString(){
    StringBuilder list = new StringBuilder();
    Node node = head;
    while(node != null){
      list.append(node.value+", ");
      node = node.next;
    }
    return list.toString();
  }
  private class Node{
    private int value;
    private Node next;
    
    public Node(int value){
      this.value = value;
    }
    
    public Node(int value, Node n){
      this.value = value;
      this.next = n;
    }
  }
  
  private int presentAt(int value){
    int index = -1;
    boolean found = false;
    Node temp = head;
    while(temp != null){
      ++index;
      if(temp.value == value){
        found = true;
        break;
      }
      temp = temp.next;
    }
    if(found){
      return index;
    }else{
      return -1;
    }
  }
}

public class InsertingInLinkedList{
  public static void main(String[] args){
    LinkedList list = new LinkedList();
    
    
    System.out.println("After adding some values list is: ");
    //adding some element at first
    list.addFirst(12);//0
    list.addFirst(18);//1
    list.addFirst(33);//2
    list.addFirst(45);//3
    
    //adding some elements at last
    list.addLast(19);//4
    list.addLast(22);//5
    list.addLast(23);//6
    
    //printing list
    System.out.println(list);
    
    System.out.println("\nAfter adding a value at index 4 list is: ");
    //adding at index 4
    list.addAt(60, 4);
    //printing list
    System.out.println(list);
      
    System.out.println("\nAfter adding a value before 60 list is: ");
    //adding before 60
    list.addBefore(29, 60);
    //printing list
    System.out.println(list);
    
    System.out.println("\nAfter adding a value after 60 list is: ");
    //adding after 60
    list.addAfter(100, 60);
    //printing list
    System.out.println(list);
  }
}
