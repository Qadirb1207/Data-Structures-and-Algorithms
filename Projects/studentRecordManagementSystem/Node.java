/**
                  STUDENT INFO
  Name:- QADIR BAKHSH
  CMS ID:- 053-25-0023
                               CLASS DESCRIPTION
  This is the Node class which contains a Student reference variable along with a reference of the next
  Node named as "next".
*/

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

