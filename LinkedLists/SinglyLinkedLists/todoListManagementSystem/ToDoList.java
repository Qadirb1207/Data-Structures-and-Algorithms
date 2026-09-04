package todoListManagementSystem;

import java.util.Scanner;
public class ToDoList {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        do{
            System.out.println("~~~~~~~ Welcome to To-Do List Manager ~~~~~~~");
            System.out.println("1. Add Task at the Beginning");
            System.out.println("2. Adding Task at the End");
            System.out.println("3. Remove Task");
            System.out.println("4. Search Task by ID");
            System.out.println("5. Mark Task Completed by ID");
            System.out.println("6. Display All Pending Tasks");
            System.out.println("7. Display All Tasks");
            System.out.println("8. View Size of Your To-Do List");
            System.out.println("9. Mark a Task Pending by ID");
            System.out.println("10. Display All Completed Tasks");
            System.out.println("11. View Total Number of Pending Tasks");
            System.out.println("12. View Total Number of Completed Tasks");
            System.out.println("-1. Exit");

            System.out.print("\n Enter Your Choice = ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the Task id = ");
                    int id = sc.nextInt();
                    System.out.print("Enter the Task Title = ");
                    sc.nextLine();
                    String title = sc.nextLine();
                    System.out.print("Enter the Task Description = ");
                    String description = sc.nextLine();

                    Task task = new Task(id, title, description);
                    taskManager.addTaskFront(task);
                    break;
                
                case 2:
                    System.out.print("Enter the Task id = ");
                    int taskId = sc.nextInt();
                    System.out.print("Enter the Task Title = ");
                    sc.nextLine();
                    String taskTitle = sc.nextLine();
                    System.out.print("Enter the Task Description = ");
                    String taskDescription = sc.nextLine();

                    Task newTask = new Task(taskId, taskTitle, taskDescription);
                    taskManager.addTaskFront(newTask);
                    break;
            
                case 3:
                    break;

                case 4:
                    break;
                
                case 5:
                    break;
                
                case 6:
                    break;
                
                case 7:
                    taskManager.displayAllTasks();
                    break;
                
                case 8:
                    break;

                case 9:
                    break;

                case 10:
                    break;

                case 11:
                    break;

                case 12:
                    break;
                
                default:
                    break;
            }


        }while(choice != -1);
        System.out.println("Thanks For Using This To Do List Manager!!");
        sc.close();
    }
}
