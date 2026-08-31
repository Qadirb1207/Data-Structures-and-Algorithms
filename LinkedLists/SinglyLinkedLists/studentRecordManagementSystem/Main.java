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
        
        stdRecord.addStudentFront(s1);
        stdRecord.addStudentFront(s2);
        stdRecord.addStudentBack(s3);
        stdRecord.addStudentBack(s4);
        
        stdRecord.displayStudents();
        
        stdRecord.addStudentBefore(103, s5);
        stdRecord.displayStudents();
        
        stdRecord.updateStudent(103, s6);
        stdRecord.displayStudents();
       // stdRecord.displayStudents();
        
      //  stdRecord.deleteStudentFront();
        //stdRecord.displayStudents();
        
         //stdRecord.deleteStudentBack();
        //stdRecord.displayStudents();
        
        stdRecord.searchStudent(19);
    }
}
