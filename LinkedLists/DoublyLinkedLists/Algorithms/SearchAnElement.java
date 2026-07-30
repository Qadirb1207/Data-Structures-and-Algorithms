package Algorithms;

import java.util.Scanner;

class DoublyLinkedList{
  private Node head;
  private Node tail;
  private int size;
  
  public DoublyLinkedList(){
    this.size = 0;
  }
  
  public void add(int value){
    Node node = new Node(value);
    node.next = head;
    if(head != null){
      head.prev = node;
      head = node;
    }else{
      head = node;
      head.prev = null;
    }
    
    if(tail == null){
      tail = head;
      tail.next = null;
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
    boolean found = false;
    Node temp  = head;
    while(temp != null){
      if(temp.value == value){
        found = true;
        return found;
      }
      temp = temp.next;
    }
    return found;
  }
  
  private class Node{
    private int value;
    private Node next;
    private Node prev;
    
    public Node(int value){
      this.value = value;
    }
    
    public Node(int value, Node n, Node p){
      this.value = value;
      this.next = n;
      this.prev = p;
    }
  }
}

public class SearchAnElement{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    DoublyLinkedList list = new DoublyLinkedList();
    //adding some values in the list
    list.add(10);
    list.add(13);
    list.add(25);
    list.add(29);
    list.add(44);
    list.add(49);
    list.add(67);
    list.add(57);
    //displaying the list
    System.out.println(list);
    System.out.print("Enter number to search in the list = ");
    int num = sc.nextInt();
    boolean ans = list.search(num);//searching the number
    //printing the answer
    if(ans){
      System.out.println(num+" is present in the list");
    }else{
      System.out.println(num+" is not present in the list");
    }
    
    sc.close();
  }
}
