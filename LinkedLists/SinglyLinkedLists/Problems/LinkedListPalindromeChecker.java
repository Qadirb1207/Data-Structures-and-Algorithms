package Problems;

public class LinkedListPalindromeChecker {
    private static boolean isPalindrome(LinkedList list){
        boolean isPalindrome = true;
        Node slow = list.head;
        Node fast = list.head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast != null){
            slow = slow.next;
        }

        Node prev = null;
        Node next = null;
        Node current = slow;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }


        Node node1 = list.head;
        Node node2 = prev;
        while(node2 != null ){
            if(node1.data != node2.data){
                isPalindrome = false;
                break;
            }
            node1 = node1.next;
            node2 = node2.next;
        }

        Node p = null;
        Node n = null;
        Node curr = prev;
        while(curr != null){
            n = curr.next;
            curr.next = p;
            p = curr;
            curr = n;
        }

        return isPalindrome;
        
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();

        list.addLast(1);
        list.addLast(2);
        // list.addLast();
        list.addLast(3);
        list.addLast(4);

        System.out.println(isPalindrome(list));

        list.display();
    }
}
