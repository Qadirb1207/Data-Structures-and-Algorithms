package todoListManagementSystem;

public class TaskManager {
    private Node head;
    private Node tail;
    private int size;

    public TaskManager(){
        this.head = null;
        this.tail = null;
    }

    //method for adding the task at the beginning
    public void addTaskFront(Task task){
        Node newNode = new Node(task);

        if(head != null){
            newNode.next = head;
        }

        head = newNode;
        if(tail == null){
            tail = newNode;
        }
        ++size;
        System.out.println("Task added successfully!!!");
    }


    //method for adding a task at the End
    public void addTaskBack(Task task){
        Node newNode = new Node(task);

        if(tail != null){
            tail.next = newNode;
        }
        tail = newNode;
        if(head == null){
            head = newNode;
        }
        ++size;
        System.out.println("Task added successfully!!!");
    }

    //method for displaying tasks
    public void displayAllTasks(){
        Node node = head;
        if(head != null)
            System.out.println("Here is your To-Do List: ");
        else
            System.out.println("Your To Do List is Empty");
        
        while(node != null){
            System.out.println("_______________");
            System.out.println(node.getTask());
            System.out.println("_______________\n");
            node = node.next;
        }
    }

    //method for removing task
    public void removeTask(int taskId){
        Node node = head;
        if(node.getTask().getTaskId() == taskId){
            head = head.next;
            --size;
            System.out.println("Task Removed Successfully!");
            return;
        }

        while(node.next != null && node.next.getTask().getTaskId() != taskId){
            node = node.next;
        }
        if(node.next == null){
            System.out.println("NO Such Task Exists!!");
            return;
        }
        node.next = node.next.next;
        --size;
        System.out.println("Task Removed Successfully!");
    }

    //method for searching the task (BY ID)
    public Task searchTask(int taskId){
        Node node = head;
        while(node != null){
            if(node.getTask().getTaskId() == taskId){
                return node.getTask();
            }
            node = node.next;
        }
        return null;
    }
    //method for getting size
    public int size(){
        return this.size;
    }
    //NODE CLASS
    private static class Node{
        private Task task;
        private Node next;

        public Node(Task t){
            this.task = t;
            this.next = null;
        }

        public Task getTask(){
            return this.task;
        }
    }


}
