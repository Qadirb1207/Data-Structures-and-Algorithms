package Trees.BinarySearchTrees.Applications.networkFaultandIncidentManagementSystem;

public class NetworkFaultAndIncidentManager {
    private Node root;
    private int size;

    private class Node{
        private Incident incident;
        private Node left;
        private Node right;

        Node(Incident inc){
            this.incident = inc;
            this.left = this.right = null;
        }
    }

    public NetworkFaultAndIncidentManager(){
        this.root = null;
        this.size = 0;
    }

    public void insertIncident(Incident inc){
        inc.setIncidentId(size);
        root = insertRecursively(root, inc);
        ++size;
    }

    public void display(){
        print(root);
    }

    private void print(Node node){
        if(node == null){
            return;
        }
        print(node.left);
        System.out.println(node.incident+"\n");
        print(node.right);
    }
    private Node insertRecursively(Node node, Incident inc) {
        if(node == null){
            return new Node(inc);
        }
        if(inc.getIncidentId() > node.incident.getIncidentId()){
            node.right = insertRecursively(node.right, inc);
        }else {
            node.left = insertRecursively(node.left, inc);
        }
        return node;
    }
}
