package Queues.Applications.studentQueueManagementSystem;
import Queues.Applications.studentRecordManagementSystem.Student;
public class Node {
    private Student std;
    private Node next;

    public Node(Student std){
        this.std = std;
        this.next = null;
    }

    public Student getStudent(){
        return this.std;
    }
}
