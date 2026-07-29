package Problems;

class LinkedList{
  private Node head;
  private Node tail;
  private int size;
  
  public LinkedList(){
    this.size = 0;
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
  
  public void deleteFirst(){
    head = head.next;
    if(head == null){
      tail = null;
    }
    --size;
  }
  
  public void deleteLast(){
    Node temp = getReference(size-2);
    
    tail = temp;
    tail.next = null;
    --size;
  }
  
  public void delete(int index){
    if(index == 0){
      deleteFirst();
      return;
    }
    if(index == size-1){
      deleteLast();
      return;
    }
    if(index >= size){
      System.out.println("Invalid Index");
      return;
    }
    Node node = getReference(index);
    Node prevNode = getReference(index-1);
    Node nextNode = getReference(index+1);
    prevNode.next = nextNode;
    node.next = null;
    --size;
  }
  
  public void deleteByValue(int val){
    int index = search(val);
    if(index < 0){
      System.out.println("There is no value "+val);
      return;
    }
    if(index == 0){
      deleteFirst();
      return;
    }
    if(index == size-1){
      deleteLast();
      return;
    }
    Node prev = getReference(index-1);
    prev.next = prev.next.next;
    --size;
  }
  
  
  
  private int search(int value){
    Node node = head;
    int index = -1;
    while(node != null){
      ++index;
      if(node.value == value){
        return index;
      }
      node = node.next;
    }
    return index;
  }
  
  
  private Node getReference(int index){
    Node node = head;
    for(int i = 0; i < index; i++){
      node = node.next;
    }
    return node;
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
    
    public Node(int value){
      this.value = value;
    }
    
    public Node(int value, Node next){
      this.value = value;
      this.next = next;
    }
  }
}

public class DeletingNodes{
  public static void main(String[] args){
    LinkedList myList = new LinkedList();
    
    myList.add(12);
    myList.add(29);
    myList.add(20);
    myList.add(27);
    myList.add(19);
    myList.add(34);
    myList.add(38);
    myList.add(49);
    
    System.out.println("Original List is: "+myList);
    //myList.deleteFirst();
   //System.out.println("After deleting first element the List is: "+myList);
    myList.deleteLast();
    System.out.println("After deleting last element the List is: "+myList);
    myList.delete(2);
    System.out.println("After deleting the element at 2nd index the List is: "+myList);
    int value = 27;
    myList.deleteByValue(value);
    System.out.println("After deleting "+value+" from the list, the List is: "+myList);
    
  }
}
