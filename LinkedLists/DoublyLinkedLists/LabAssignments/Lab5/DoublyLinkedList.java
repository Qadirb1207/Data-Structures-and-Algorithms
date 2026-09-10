package LabAssignments.Lab5;

public class DoublyLinkedList {
    private Node head;
    private Node tail;

    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
    }

    //method for adding an element at the Back
    public void addBack(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    //method for deleting the element at the Beginning
    public void deleteFirst(){
        if(head == null){
            System.out.println("Nothing is in the List! ");
            return;
        }

        head = head.next;

        if(head != null){
            head.prev = null;
            return;
        }
    }

    //method for deleting the last element
    public void deleteBack(){
        if(tail == null){
            System.out.println("Nothing is in the list!");
            return;
        }
        tail.prev.next = null;
    }

    //method for searching data
    public void searchNode(int data){
        Node node = head;
        while(node != null){
            if(node.data == data){
                System.out.println("Data found");
                return;
            }
            node = node.next;
        }
        System.out.println("Data Not Found");
    }

    //method for deleting a particular node
    public void deletingNode(int data){
        
    }

    //method for displaying forward
    public void displayForward(){
        Node node = head;
        System.out.print("NULL <- ");
        while(node != null){
            System.out.print(node.data+" <-> ");
            node = node.next;
        }
        System.out.println("-> NULL");
    }


    private class Node{
        private int data;
        private Node next;
        private Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }
}
