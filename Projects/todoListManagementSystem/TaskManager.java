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

    //method for making a task mark as completed
    public void markCompleted(int taskId){
        Task task = searchTask(taskId);
        if(task != null){
            task.markAsCompleted();
        }else{
            System.out.println("No Task with ID: "+taskId+" Exists");
        }
    }

    //method for displaying pending tasks
    public void displayPendingTasks(){
        Node current = head;
        if(current != null){
            System.out.println("These are your Pending Tasks!!: \n");
        }else{
            System.out.println("There is no Task in the list");
            return;
        }
        while(current != null){
            if(current.getTask().getStatus()){
                System.out.println("_______________");
                System.out.println(current.getTask()+"\n");
            }
            current = current.next;
        }
    }

    //method for displaying completed tasks
    public void displayCompletedTasks(){
        Node current = head;
        if(current != null){
            System.out.println("You have completed these tasks: ");
        }else{
            System.out.println("No Tasks Available in the list");
            return;
        }

        while(current != null){
            if(!current.getTask().getStatus()){
                System.out.println("_______________");
                System.out.println(current.getTask()+"\n");
            }
            current = current.next;
        }
    }
    //method for getting size
    public int size(){
        return this.size;
    }

    //method for marking a task as pending 
    public void markPending(int taskId){
        Task task = searchTask(taskId);
        if(task != null){
            task.markAsPending();
        }else{
            System.out.println("No Task with ID: "+taskId+" Exists!");
        }
    }

    //method for counting total pending tasks
    public int countPendingTasks(){
        int pendingTasks = 0;
        Node current = head;
        if(current == null){
            return pendingTasks;
        }
        while(current != null){
            if(current.getTask().getStatus()){
                ++pendingTasks;
            }
            current = current.next;
        }
        return pendingTasks;
    }

    //method for counting total completed tasks
    public int countCompletedTasks(){
        int completedTasks = 0;
        Node current = head;
        if(current == null){
            return completedTasks;
        }
        while(current != null){
            if(!current.getTask().getStatus()){
                ++completedTasks;
            }
            current = current.next;
        }
        return completedTasks;
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
