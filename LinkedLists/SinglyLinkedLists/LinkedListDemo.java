package SinglyLinkedLists;

public class LinkedListDemo{
  public static void main(String[] args){
    CustomLinkedList linkedList = new CustomLinkedList();
    
    linkedList.addFirst(34);
    linkedList.add(1, 1);
    linkedList.addLast(3);
    //linkedList.addFirst(45);
    //linkedList.addFirst(67);
    //linkedList.addFirst(49);
    
    System.out.print(linkedList);    
  }
}
