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
        root = insertRecursively(root, inc);
        ++size;
    }

    public void delete(int incId){
        root = delete(root, incId);
        --size;
        System.out.println("Incident Deleted Successfully");
    }

    public void search(int incId){
        Node node = search(root, incId);
        if(node == null){
            System.out.println("No Incident exists with ID: "+incId);
            return;
        }
        System.out.println(node.incident);
    }
    public void display(){
        print(root);
    }

    private Node search(Node node, int incId){
        if(node == null){
            return null;
        }

        if(node.incident.getIncidentId() == incId){
            return node;
        }

        if(node.incident.getIncidentId() > incId){
            return search(node.left, incId);
        }
        return search(node.right, incId);
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

    private Node delete(Node node, int incId) {
       if(node == null){
        return null;
       }
       if(node.incident.getIncidentId() == incId){
            if(node.left == null){
                return node.right;
            }
            if(node.right == null){
                return node.left;
            }

            Node predecessor = findMax(node.left);
            node.incident = predecessor.incident;
            delete(node.left, predecessor.incident.getIncidentId());
       }
       if(node.incident.getIncidentId() > incId){
            node.left = delete(node.left, incId);
       }else{
            node.right = delete(node.right, incId);
       }
       return node;

    }

    private Node findMin(Node node){
        if(node.left == null){
            return node;
        }
        return findMin(node.left);
    }

    private Node findMax(Node node){
        if(node.right == null){
            return node;
        }
        return findMax(node.right);
    }
}
