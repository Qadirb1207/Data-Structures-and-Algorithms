package Recursion.LabTasks;

public class ReversingALinkedList {
    private static Node reverse(Node n){
        return reverseRecursively(null, n, null);
    }

    private static Node reverseRecursively(Node prev, Node curr, Node next){
        if(curr == null){
            return prev;
        }
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
        return reverseRecursively(prev, curr, next);
    }
    public static void main(String[] args){
        LinkedList list =  new LinkedList();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        System.out.println("Before Reversal: ");
        list.display();

        Node newHead = reverse(list.head);
        System.out.println("After Reversal: ");
        list.display(newHead);

        
    }
}

