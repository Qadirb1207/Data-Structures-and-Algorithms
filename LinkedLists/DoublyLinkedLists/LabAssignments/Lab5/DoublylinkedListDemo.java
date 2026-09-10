package LabAssignments.Lab5;

public class DoublylinkedListDemo {
    public static void main(String[] args){
        DoublyLinkedList myList = new DoublyLinkedList();

        myList.addBack(13);
        myList.addBack(-10);
        myList.addBack(-19);
        
        myList.displayForward();

        myList.deleteFirst();

        myList.displayForward();

        myList.deleteBack();
        myList.displayForward();

        myList.searchNode(-10);
        

    }
}
