package Queues.Applications.studentRecordManagementSystem;

public class StudentRMSDemo {
    public static void main(String[] args){
        ArrayBasedQueue queue = new ArrayBasedQueue(5);
        //creating some students
        Student std1 = new Student(100, "Abrar", 19, 3.25, 78.5);
        Student std2 = new Student(101, "Qadir", 19, 3.20, 79.5);
        Student std3 = new Student(102, "Rauf", 20, 3.12, 74.5);
        Student std4 = new Student(103, "Vishal", 19, 3.16, 73);
        Student std5 = new Student(104, "Noor", 21, 3.00, 71);

        //adding them to record (i.e queue)
        queue.enqueue(std1);
        queue.enqueue(std2);
        queue.enqueue(std3);
        queue.enqueue(std4);
        //queue.enqueue(std5);
        //queue.enqueue(std5);
        

        queue.display();

        System.out.println("\n");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());


        System.out.println("\n");

        queue.display();
    }
}
