package Problems;

class LinkedList{
    private Node head;
    private Node tail;


    public void addFirst(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            tail = head;
            return;
        }
        node.next = head;
        head = node;
    }

    public void addLast(int data){
        Node node = new Node(data);
        if(tail == null){
            tail = node;
            head = tail;
            return;
        }
        tail.next = node;
        tail = node;
    }

    public void removeFirst(){
        if(isEmpty()){
            System.out.println("List is empty!! Nothing to be deleted!!!");
            return;
        }    
        head = head.next;
    }

    public void removeLast(){
        if(isEmpty()){
            System.out.println("List is Empty!! Nothing to be deleted!!");
            return;
        }
        Node node = head;
        while(node.next.next != null){
            node = node.next;
        }
        node.next = null;
        tail = node;
    }



    public boolean isEmpty(){
        return head == null;
    }


    public void display(){
        Node node = head;
        while(node != null){
            System.out.print(node.data+" -> ");
            node = node.next;
        }
        System.out.println("NULL");
    }

    //======== METHOD FOR REVERSING THE LINKEDLIST
    public void reverseLinkedList(){
        Node prev = null;
        Node next = null;
        Node current = head;
        while(current != null){
            next = current.next;//storing the next node in order to preserve the remaining list
            current.next = prev;//reversing the current node at which we are currently standing
            prev = current;//moving the prev one step ahead
            current = next;//moving the current a step ahead
        }
        tail = head;
        head = prev;
    }
    private class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
}
public class ReversingASinglyLinkedList {
    public static void main(String[] args){
        LinkedList list = new LinkedList();

        list.addFirst(12);
        list.addFirst(15);
        list.addFirst(10);
        list.addFirst(16);
        list.addFirst(13);

        list.display();
        list.removeFirst();

        list.display();

        list.reverseLinkedList();
        list.display();
    }
}