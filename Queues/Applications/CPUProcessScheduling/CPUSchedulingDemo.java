package Queues.Applications.CPUProcessScheduling;

public class CPUSchedulingDemo {
    public static void main(String[] args){
        CPUScheduling scheduling = new CPUScheduling(5);

        scheduling.addProcess("P1");
        scheduling.addProcess("P2");
        scheduling.addProcess("P3");
        scheduling.addProcess("P4");
        scheduling.addProcess("P5");

        scheduling.displayProcesses();

        System.out.println(scheduling.executeProcess());
        System.out.println(scheduling.executeProcess());
        System.out.println(scheduling.executeProcess());

        scheduling.displayProcesses();

        System.out.println(scheduling.executeProcess());
        System.out.println(scheduling.executeProcess());

        System.out.println("Is Queue Empty? = "+scheduling.isEmpty());
    }
}

