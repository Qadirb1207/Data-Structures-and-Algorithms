package Problems;

public class ReversingADoublyLinkedList {
    private static void reverseList(DoublyLinkedList list){
        if(list.isEmpty()){
            System.out.println("Empty List cannot Reverse it!!");
            return;
        }
        Node prev = null;
        Node next = null;
        Node curr = list.head;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        list.tail = list.head;
        list.head = prev;
    }
    public static void main(String[] args){
        DoublyLinkedList list = new DoublyLinkedList();

        list.addFirst(12);
        list.addFirst(13);
        list.addFirst(14);
        list.addFirst(15);
        list.addFirst(16);

        System.out.println("Before Reversing: ");
        list.displayForward();
        // list.displayBackward();

        reverseList(list);

        System.out.println("After Reversing: ");
        list.displayForward();
        // list.displayBackward();
    }
}

