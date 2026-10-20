package Problems;

public class FindingNthNode {
    //This method finds the nth node from the back side of the linkedlist and returns it
    /* *
        Here we are Defining two pointers (slow and fast THIS TECHNIQUE IS CALLED IS CALLED TWO-POINTER TECHNIQUE).
        In this, first we move the fast n node ahead of the slow pointer and then we move the both together until
        fast becomes null. When the fast becomes null slow points to our required node(i.e Nth Node from the end).
    
     */
    private static Node nthNode(LinkedList list, int n){
        if(list.isEmpty()){
            System.out.println("List is empty!! Cannot find any node");
            return null;
        }

        if(n <= 0){
            System.out.println("Invalid number of node!!");
            return null;
        }
        Node slow = list.head;
        Node fast = list.head;
        for(int i = 0; i < n; i++){
            if(fast == null){
                return null;
            }
            fast = fast.next;
        }

        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.addLast(8);
        list.addLast(9);
        list.addLast(10);

        int n = 1;
        Node node = nthNode(list, n);
        if(node != null){
            System.out.println(n+"th node in the list is: "+node.data);
        }else{
            System.out.println("No node exists!");
        }
    }
}
