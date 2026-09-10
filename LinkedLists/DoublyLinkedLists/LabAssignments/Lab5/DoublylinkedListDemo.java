package LabAssignments.Lab5;

public class DoublylinkedListDemo {
    public static void main(String[] args){
        DoublyLinkedList myList = new DoublyLinkedList();

        myList.addBack(13);
        myList.addBack(-10);
        myList.addBack(-19);
        
        myList.displayForward();
        myList.searchNode(-10);

        myList.addAfter(-19, 10);
        myList.displayForward();

    }
}
