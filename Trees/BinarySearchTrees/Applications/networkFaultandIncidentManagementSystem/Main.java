package Trees.BinarySearchTrees.Applications.networkFaultandIncidentManagementSystem;
import java.util.Scanner;
public class Main {
    public static void showMenu(){
        System.out.print("1. Report a New Incident"+"\n2. Search by Incident ID"+"\n3. See Status of your Incident"+"\n4. Delete an Incident"+"\n5. Display all Incidents"+"\n-1. Exit"+"\n\nEnter Your Choice = ");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        NetworkFaultAndIncidentManager nfaim = new NetworkFaultAndIncidentManager();
        int choice = 0;
        do{
            showMenu();
            choice = sc.nextInt();
            switch(choice){
                case 1: {
                System.out.print("Enter your device ID: ");
                int dId = 0;
                try{
                     dId = sc.nextInt();
                }catch(Exception ex){
                    System.out.println(ex.getMessage());
                    System.out.print("Enter your device ID: ");
                    dId = sc.nextInt();
                }
                
                System.out.print("Enter your incident Description = ");
                sc.nextLine();
                String des = sc.nextLine();
                System.out.print("Enter priority(HIGH/LOW) = ");
                String pr = sc.nextLine();
                if(!pr.equalsIgnoreCase("High") || !pr.equalsIgnoreCase("High")){
                    System.out.print("Invalid Priority\n Enter priority Again(HIGH/LOW) = ");
                    pr = sc.nextLine();
                }
                Incident inc = new Incident(dId, des, pr);
                nfaim.insertIncident(inc);
                }
                    break;

                case 5: {
                    nfaim.display();
                }
            }
        }while(choice != -1);
        sc.close();
    }
}
