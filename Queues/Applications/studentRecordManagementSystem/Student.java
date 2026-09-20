package Queues.Applications.studentRecordManagementSystem;

public class Student{
    private int studentId;
    private String studentName;
    private int studentAge;
    private double studentCGPA;
    private double studentInterPercentage;

    public Student(int studentId, String studentName, int studentAge, double studentCGPA,
            double studentInterPercentage) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentCGPA = studentCGPA;
        this.studentInterPercentage = studentInterPercentage;
    }
    
    @Override 
    public String toString(){
        String info = "ID: "+studentId+"\n Name: "+studentName+"\n Age: "+studentAge+"\nCGPA: "+studentCGPA
                        +"\n Inter Percentage: "+studentInterPercentage;

        return info;
    }
}