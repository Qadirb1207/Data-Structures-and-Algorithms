package Problems;

public class CycleDetection {
    private static boolean doesCycleExist(LinkedList list){
        Node slow = list.head;
        Node fast = list.head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        LinkedList list = new LinkedList();

        list.addLast(12);

        System.out.println("Does Cycle Exist? = "+doesCycleExist(list));
    }
}
