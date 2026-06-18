package BubbleSort;

import java.util.Arrays;

class Student{
    private String name;
    private int marks;

    Student(String name, int marks){
        if((!name.trim().isEmpty() || name != null) && marks > 0){
            this.name = name;
            this.marks = marks;
        }else{
            this.name = null;
            this.marks = 0;
        }
    }

    public String getName(){
        return this.name;
    }
    
    public int getMarks(){
        return this.marks;
    }

    public void setMarks(int marks){
        if(marks > 0){
            this.marks = marks;
        }else{
            this.marks = 0;
        }
    }

    public void setName(String name){
        if(!name.trim().isEmpty() && name != null){
            this.name = name;
        }
        else{
            this.name = null;
        }
    }

    public String toString(){
        return this.name+" = "+ this.marks;
    }
}

public class SortStudentsByMultipleCriteria {
    public static void main(String[] args) {
        Student std1 = new Student("Zara", 95);
        Student std2 = new Student("Bilal", 92);
        Student std3 = new Student("Ahmed", 85);
        Student std4 = new Student("Ali", 85);

        Student[] students = {std1, std2, std4, std3};

        System.out.println("Before Sorting: "+Arrays.toString(students));
        System.out.println();

        sortStudents(students);

        System.out.println("After Sorting: "+Arrays.toString(students));
    }

    public static void sortStudents(Student[] arr){
        for(int i = 0; i < arr.length-1; i++){
            boolean isSwapped = false;
            for(int j = 0; j < arr.length-1; j++){
                if(arr[j].getMarks() != arr[j+1].getMarks()){
                    if(arr[j].getMarks() < arr[j+1].getMarks()){
                        Student temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }else{
                    if(arr[j].getName().compareTo(arr[j+1].getName()) > 0){
                        String tempName = arr[j].getName();
                        arr[j].setName(arr[j+1].getName());
                        arr[j+1].setName(tempName);
                        isSwapped = true;
                    }
                }
            }
            if(!isSwapped){
                break;
            }
        }
    }
}
