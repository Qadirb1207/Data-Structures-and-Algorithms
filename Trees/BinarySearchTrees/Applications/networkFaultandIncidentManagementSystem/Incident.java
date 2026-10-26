package Trees.BinarySearchTrees.Applications.networkFaultandIncidentManagementSystem;

public class Incident {
    private int incidentId;
    private int deviceId;
    private String problemDescription;
    private String priority;
    private String status;

    public Incident(int deviceId, String pdes, String priority){
        this.deviceId = deviceId;
        this.problemDescription = pdes;
        this.priority = priority;
        this.status = "Open";
    }

    public String toString(){
        String info = "Incident ID: "+incidentId+
                      "\nDevice ID: "+deviceId+
                      "\nDescription: "+problemDescription+
                      "\nPriority: "+priority+
                      "\nStatus: "+status;
        
        return info;
    }

    public int getIncidentId(){
        return this.incidentId;
    }

    public void setIncidentId(int id){
        this.incidentId = id;
    }

    public String getStatus(){
        return this.status;
    }

    
}
