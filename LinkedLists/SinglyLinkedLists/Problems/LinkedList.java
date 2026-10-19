package Problems;


public class LinkedList{
    protected Node head;
    protected Node tail;


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


    public void reverseLinkedList(Node head2) {
    }
    

}
