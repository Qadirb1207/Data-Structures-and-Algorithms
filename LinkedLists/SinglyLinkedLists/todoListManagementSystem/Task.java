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


    public void markAsCompleted(){
        if(this.status != "Completed!"){
            this.status = "Completed!";
            System.out.println("Marked Completed!");
        }else{
            System.out.println("Task is already marked as completed!");
        }
    }

    public int getTaskId(){
        return this.taskId;
    }

    public boolean getStatus(){
        if(status == "Pending"){
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        String info = " Task ID: "+this.taskId+"\n Title: "+this.title+
                    "\n Description: "+this.description+
                    "\n Status: "+this.status;
        
        return info;
    }
}
