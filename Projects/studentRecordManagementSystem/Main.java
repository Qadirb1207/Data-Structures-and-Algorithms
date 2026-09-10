/**
            STUDENT INFO
  Name:- QADIR BAKHSH
  CMS ID:- 053-25-0023
                       CLASS DESCRIPTION
  This file is the Main file for testing the Linked List methods
*/

package studentRecordManagementSystem;

public class Main{
    public static void main(String[] args) {
        LinkedList stdRecord = new LinkedList();
        Student s1 = new Student(100, "Abrar", "Computer Science", 4, 3.45);
        Student s2 = new Student(101, "Qadir", "Software Engineering", 3, 3.35);
        Student s3 = new Student(102, "Vishal", "Artificial Intelligence", 3, 3.55);
        Student s4 = new Student(103, "Rauf", "Computer Science", 3, 3.75);
        Student s5 = new Student(104, "Noor", "Accounting and Finance", 1, 1.00);
        Student s6 = new Student(103, "Hira", "Accounting and Finance", 1, 1.00);
       
       System.out.println("Adding Students to the List!!");
        stdRecord.addStudentFront(s1);
        stdRecord.addStudentFront(s2);
        stdRecord.addStudentBack(s3);
        stdRecord.addStudentBack(s4);
        
        System.out.println("\n Students added in the List are: ");
        stdRecord.displayStudents();
        
        System.out.println("\nAdding a Student before the student with id: 103 \n");
        stdRecord.addStudentBefore(103, s5);
        System.out.println("\n Students added in the List are: ");
        stdRecord.displayStudents();
        System.out.println("\nUpdating the Student before the student with id: 103 \n");
       stdRecord.updateStudent(103, s6);
       System.out.println("\n Students added in the List are");
       stdRecord.displayStudents();
        
        System.out.println("\n Deleting the first student of the list");
       stdRecord.deleteStudentFront();
       System.out.println("\n Students added in the List are: ");
       stdRecord.displayStudents();
        System.out.println("\n Deleting the last student of the list");
       stdRecord.deleteStudentBack();
       System.out.println("\n Students added in the List are: ");
       stdRecord.displayStudents();
        System.out.println("\n Deleting the student with id 101 from the list");
        stdRecord.deleteStudent(101);
        System.out.println();
        System.out.println();
        System.out.println();
        stdRecord.displayStudents();
    }
}
