/**
                                STUDENT INFO
      Name:- QADIR BAKHSH
      CMS ID:- 053-25-0023
      
                              CLASS DESCRIPTION
                              
      This is the Student class, having attributes like id, name, dept, semester, and cgpa. It has a getter for id and setters for all the fields except id, because we have assumed that if  once the id is provided it cannot be changed again. It also has a method named as displayInfo() for printing the student info in a well formatted manner. 


*/

package studentRecordManagementSystem;

public class Student{
  private int studentId;
  private String name;
  private String department;
  private int semester;
  private double cgpa;
  
  public Student(int stdId, String name, String dept, int semester, double cgpa){
    if(stdId > 0 && semester > 0 && cgpa > 0 && !(name.isEmpty()) && !(dept.isEmpty())){
      this.studentId = stdId;
      this.name = name;
      this.semester = semester;
      this.department = dept;
      this.cgpa = cgpa;
    }else{
      System.out.println("Invalid Student Information");
    }
  }
  
  //setter for name
  public void setName(String name){
    if(!name.isEmpty()){
      this.name = name;
    }else{
      System.out.println("Invalid Name!!");
    }
  }
  
  //setter for semester
  public void setSemester(int sem){
    if(sem > 0){
      this.semester = sem;
    }else{
      System.out.println("Invalid Semester!!!");
    }
  }
  
  //setter for cgpa
  public void setCgpa(double cgpa){
    if(cgpa > 0.0){
      this.cgpa = cgpa;
    }else{
      System.out.println("Invalid CGPA! CGPA cannot be negative!!");
    }
  }
  
  //getter for studentId
  public int getStudentId(){
    return this.studentId;
  }
  
  //method for displaying student information
  public void displayInfo(){
    System.out.println("Student ID: "+this.studentId);
    System.out.println("Student Name: "+this.name);
    System.out.println("Department: "+this.department);
    System.out.println("Semester: "+this.semester);
    System.out.println("CGPA: "+this.cgpa);
  }
}
