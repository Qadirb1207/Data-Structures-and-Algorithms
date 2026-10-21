package Problems;

public class DoublyLinkedList {
    Node head;
    Node tail;
    
    DoublyLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public void addFirst(int data){
        Node node = new Node(data);

        if(head == null){
            this.head = node;
            this.tail = head;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
    }

    public void addLast(int data){
        Node node = new Node(data);

        if(tail == null){
            this.tail = node;
            this.head = tail;
            return;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    public void removeFirst(){
        if(isEmpty()){
            System.out.println("List is empty!! Nothing to be removed!");
            return;
        }
        head.next.prev = null;
        head = head.next;
    }

    public void removeLast(){
        if(isEmpty()){
            System.out.println("List is Empty!!! Nothing to be removed!!");
            return;
        }

        tail = tail.prev;
        tail.next.prev = null;
        tail.next = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void displayForward(){
        Node node = head;
        System.out.print("NULL ");
        while(node != null){
            System.out.print(node.data+" -> ");
            node = node.next;
        }
        System.out.println("NULL");
    }

    public void displayBackward(){
        Node node = tail;
        System.out.print("NULL ");
        while(node != null){
            System.out.print(node.data+" -> ");
            node = node.prev;
        }
        System.out.println("NULL");
    }
}
