package todoListManagementSystem;


public class Task {
    private int taskId;
    private String title;
    private String description;
    private String status;

    public Task(int taskId, String title, String description){
        this.taskId = taskId;
        this.title = title;
        this.description = description;
        this.status = "Pending";
    }


    //method for marking the task as compeleted
    public void markAsCompleted(){
        if(this.status != "Completed!"){
            this.status = "Completed!";
            System.out.println("Marked Completed!");
        }else{
            System.out.println("Task is already marked as completed!");
        }
    }

    //method for marking a task as pending
    public void markAsPending(){
        if(this.status != "Pending"){
            this.status = "Pending";
            System.out.println("Marked As Pending!");
        }else{
            System.out.println("The Task is already Pending!!");
        }
    }

    //method for getting task id
    public int getTaskId(){
        return this.taskId;
    }

    //method for getting status
    public boolean getStatus(){
        if(status == "Pending"){
            return true;
        }
        return false;
    }

    //method for marking a task pending

    @Override
    public String toString(){
        String info = " Task ID: "+this.taskId+"\n Title: "+this.title+
                    "\n Description: "+this.description+
                    "\n Status: "+this.status;
        
        return info;
    }
}
