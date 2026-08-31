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
    while(n != tail){
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
    while(n != null){
      if(n.getStudent().getStudentId() == stdId){
        if(n != head && n != tail){
          n.next = n.next.next;
          --size;
        }else if(n == head){
          deleteStudentFront();
        }else{
          deleteStudentBack();
        }
        return;
      }
      n = n.next;
    }
    
    System.out.println("No Student with ID: "+stdId+" found");
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
