package SinglyLinkedLists.Algorithms;

import java.util.*;

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
  
  public String toString(){
    StringBuilder list = new StringBuilder();
    Node temp = head;
    while(temp != null){
      list.append(temp.value +", ");
      temp = temp.next;
    }
    return list.toString();
  }
  
  public boolean search(int value){
    Node temp = head;
    while(temp != null){
      if(temp.value == value){
        return true;
      }
      temp = temp.next;
    }
    return false;
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

public class SearchingAValue{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    LinkedList myList = new LinkedList();
    myList.add(129);
    myList.add(29);
    myList.add(19);
    myList.add(12);
    myList.add(49);
    
    System.out.println("List is: "+myList);
    System.out.print("Enter a number you want to search = ");
    int num = sc.nextInt();
    
    boolean result = myList.search(num);
    if(result){
      System.out.println("Element found!!!🤩");
    }else{
      System.out.println("Element not found!!!🥲");
    }
  }
}
