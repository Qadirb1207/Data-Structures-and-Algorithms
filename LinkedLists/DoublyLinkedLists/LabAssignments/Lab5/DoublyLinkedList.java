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
    public void deleteNode(int data){
        Node node = head;
        Node n = null;
        while(node != null){
            if(node.data == data){
                n = node;
                break;
            }
            node = node.next;
        }
        if(n == null){
            System.out.println("No such data exits");
            return;
        }
        if(n == head){
            deleteFirst();
            return;
        }
        if(n == tail){
            deleteBack();
            return;
        }
        n.prev.next = null;
        n.prev = null;
    }

    //method for adding data before a particular node
    public void addAfter(int targetData, int data){
        Node newNode = new Node(data);
        Node n = null;
        Node node = head;
        while(node != null){
            if(node.data == targetData){
                n = node;
                break;
            }
            node = node.next;
        }
        if(n == null){
            System.out.println("No node with data: "+targetData+" exists");
            return;
        }

        if(n == tail){
            addBack(data);
            return;
        }

        newNode.next = n.next;
        n.next.prev = newNode;
        n.next = newNode;
        newNode.prev = n;
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

    //method for displaying backward
    public void displayBackward(){
        Node node = tail;
        System.out.print("NULL <- ");
        while(node != null){
            System.out.print(node.data+" <-> ");
            node = node.prev;
        }
        System.out.println("-> NULL");
    }

    //method for adding a node before a particular node
    public void addBefore(int targetData, int data){
        Node newNode = new Node(data);
        Node node = head;
        if(node.data == targetData){
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            return;
        }

        if(tail.data == targetData){
            addBack(data);
            return;
        }
        while(node.next != null && node.next.data != targetData){
            node = node.next;
        }
        if(node.next != null){
            newNode.next = node.next;
            node.next.prev = newNode;
            newNode.prev = node;
            node.next = newNode;
        }else{
            System.out.println("There is no such node with data: "+targetData);
        }
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
