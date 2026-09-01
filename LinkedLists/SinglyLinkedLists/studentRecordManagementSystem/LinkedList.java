/**
                    STUDENT INFO
  Name:- QADIR BAKHSH
  CMS ID:- 053-25-0023
                               CLASS DESCRIPTION
                               
  This is the main Linked list class which contains all the methods for student record the methods include:
  1. addStudentFront():- This method adds the student at the front of the list. If the student added is the first one both the head and the tail points to it. 
  2. addStudentBack():- This method adds the student at the back of the list. IF the student added is the first one, both the head and the tail points to it
  
  3. deleteStudentFront();- This method deletes the very first student in the list. If the student deleted is the only student in the list both the head and tail are made null. If the student deleted is not the first then the head moves the student next to the one deleted.
  4. deleteStudentBack():- This method deletes the very last student in the list. If the student is the only student in the list both the head and tail are made null, if  not the tail is moved to the student back to the one deleted. for example students are with these ids 101, 103, 108 is the last student is deleted i.e 108 then the tail pointer points to 103 while the head remains the same.
  
  5. searchStudent():- This method searches the student through his ID, and prints the details of the student found otherwise prints "Sorry! Student does not exist". 
  6. displayStudents():- This method displays all the students currently present in the record.
  
  7.updateStudent():- This method updates the student's information by finding him through his ID.
  8. deleteStudent():- This method deletes the student by finding him through his id.
  
  9. addStudentBefore():- This method adds a particular student before a student with the given id, assuming that the student before whom we are adding the student exists in the list.
  10. addStudentAfter():- This method adds a particular student after a student with the given id, assuming that the student after whom we are adding the student exists in the list.
*/
package studentRecordManagementSystem;

public class LinkedList{
  private Node head;
  private Node tail;
  private int size;
  
  public LinkedList(){
    this.head = null;
    this.tail = null;
    this.size = 0;
  }
  
  public void addStudentFront(Student s){
    Node n = new Node(s);
    if(head != null){
      n.next = head;
      head = n;
    }else{
      head = n;
      tail = n;
    }
    ++size;
  }
  
  public void addStudentBack(Student s){
    Node n = new Node(s);
    if(tail != null){
      tail.next = n;
      tail = n;
    }else{
        tail = n;
        head = n;
    }
    ++size;
  }
  
  public void deleteStudentFront(){
    if(head != null){
      head = head.next;
      if(head == null){
        tail = null;
      }
    }else{
      System.out.println("Nothing to be deleted!!");
      return;
    }
    --size;
  }
  
  //56(0)(head) -> 89(1) -> 32(2) -> 67(3)(tail)
  public void deleteStudentBack(){
    Node n = head;
    int index = -1;
    while(n != null){
      ++index;
      n = n.next;
    }
    
    if(index == -1){
      deleteStudentFront();
      return;
    }

    Node node = head;
    for(int i = 0; i < index; i++){
      node = node.next;
    }
    node.next = null;
    --size;
  }
  
  public void searchStudent(int id){
    Node n = head;

    while(n != null){
      if(n.getStudent().getStudentId() == id){
        n.getStudent().displayInfo();
        return;
      }
      n = n.next;
    }
    
    System.out.println("Sorry! Student does not exist");
  }
  
  public void displayStudents(){
    Node n = head;
    while(n != null){
      n.getStudent().displayInfo();
      System.out.println("\n ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
      n = n.next;
    }
  }
  
  public void updateStudent(int id, Student std){
    Node n = head;
    while(n != null){
      if(n.getStudent().getStudentId() == id){
        n.setStudent(std);
        System.out.println("Record Updated Successfully!!!");
        return;
      }
      n = n.next;
    }
  }


  public void deleteStudent(int stdId){
    Node n = head;
    int index = -1;
    while(n != null){
      ++index;
      n = n.next;
    }
    if(index == -1){
      deleteStudentFront();
      --size;
      return;
    }else if(index == size-1){
      deleteStudentBack();
      --size;
      return;
    }else{
      Node node = head;
      for(int i = 0; i < index-1; i++){
        node = node.next;
      }
      node.next = node.next.next;
      --size;
    }
  }
  
  public void addStudentAfter(int id, Student std){
    int index = 0;

    Node newNode = new Node(std);

    Node n = head;
    while(n.getStudent().getStudentId() != id){
      ++index;
      n = n.next;
    }

    Node node = head;
    for(int i = 0; i < index; i++){
      node = node.next;
    }
    newNode.next = node.next;
    node.next = newNode;
    ++size;
  }
  

  public void addStudentBefore(int id, Student std){
    int index = -1;

    Node newNode = new Node(std);

    Node n = head;
    while(n.getStudent().getStudentId() != id){
      ++index;
      n = n.next;
    }

    Node node = head;
    for(int i = 0; i < index; i++){
      node = node.next;
    }
    newNode.next = node.next;
    node.next = newNode;
    ++size;
  }
  
}
