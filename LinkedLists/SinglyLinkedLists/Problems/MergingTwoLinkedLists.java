package Problems;

public class MergingTwoLinkedLists {
    private static LinkedList listMerger(LinkedList l1, LinkedList l2){
        Node curr1 = l1.head;
        Node curr2 = l2.head;
        LinkedList sortedList = new LinkedList();
        while(curr1 != null && curr2 != null){
            if(curr1.data < curr2.data){
                sortedList.addLast(curr1.data);
                curr1 = curr1.next;
            }else if(curr1.data > curr2.data){
                sortedList.addLast(curr2.data);
                curr2 = curr2.next;
            }else{
                sortedList.addLast(curr1.data);
                sortedList.addLast(curr2.data);

                curr2 = curr2.next;
                curr1 = curr1.next;
            }
            
            
        }

        while(curr1 != null){
            sortedList.addLast(curr1.data);
            curr1= curr1.next;
        }


        while(curr2 != null){
            sortedList.addLast(curr2.data);
            curr2= curr2.next;
        }

        return sortedList;
    }

    public static void main(String[] args){
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(3);
        list1.addLast(4);
        list1.addLast(5);
        list1.addLast(6);

        list2.addLast(7);
        list2.addLast(8);
        list2.addLast(9);
        list2.addLast(10);
        list2.addLast(11);

        LinkedList mergedList = listMerger(list1, list2);

        mergedList.display();
    }
}
