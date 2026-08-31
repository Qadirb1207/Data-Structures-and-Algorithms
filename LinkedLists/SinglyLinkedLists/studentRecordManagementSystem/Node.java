package studentRecordManagementSystem;

public class Node{
  private Student std;
  Node next;
  
  public Node(Student std){
    if(std != null){
      this.std = std;
    }
    this.next = null;
  }

  public Student getStudent(){
    return this.std;
  }

  public void setStudent(Student st){
    this.std = st;
  }
}

