package Trees.BinarySearchTrees.Problems;

public class BinarySearchTree{
    private Node root;
    private int size;

    class Node{
        int data;
        Node right;
        Node left;

        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    BinarySearchTree(){
        this.root = null;
        this.size = 0;
    }

    public void insert(int value){
        root = insertRecursively(root, value);
        ++size;
    }

    public void updateValue(int oldValue, int newValue){
        Node node = search(root, oldValue);
        if(node != null){
            node.data = newValue;
            manageTree(node);
            System.out.println("Value update successfully!!");
            
        }else{
            System.out.println(oldValue+" does not exists!");
        }
        
    }
    //the updated value may violate the BST property so we should manage the Tree to remain BST
    private void manageTree(Node node) {
        if(node.left == null && node.right == null){
            return;
        }
        if(node.left != null && node.data < node.left.data){
            int temp = node.data;
            node.data = node.left.data;
            node.left.data = temp;
            manageTree(node.left);
        }
        if(node.right != null && node.data > node.right.data){
            int temp = node.data;
            node.data = node.right.data;
            node.right.data = temp;
            manageTree(node.right);
        }
    }

    public int findMin(){
        Node min = findMin(root);
        return min.data;
    }

    public int findMax(){
        Node max = findMax(root);
        return max.data;
    }

    public void delete(int value){
        root = delete(root, value);
        --size;
        System.out.println(value+" deleted Successfully!!");
    }

    public boolean search(int value){
        Node node = search(root, value);
        if(node == null){
            return false;
        }
        return true;
    }
    public void preorder(){
        print1(root);
    }

    public void inorder(){
        print2(root);
    }

    public void postorder(){
        print3(root);
    }


    private Node search(Node node, int value){
        if(node == null){
            return null;
        }
        if(value == node.data){
            return node;
        }

        if(value > node.data){
            return search(node.right, value);
        }
        return search(node.left, value);
    }
    private Node delete(Node node, int value){
        if(node == null){
            return null;
        }
        if(value > node.data){
            node.right =  delete(node.right, value);
        }
        if(value < node.data){
            node.left = delete(node.left, value);;
        }else {
            if(node.left == null){
                return node.right;
            }else if(node.right == null){
                return node.left;
            }

            Node successor = findMin(node.right);
            node.data = successor.data;

            delete(node.right, successor.data);
        }
        return node;
        
            
}
    private Node findMin(Node n){
        if(n.left == null){
            return n;
        }
        return findMin(n.left);
    }

    private Node findMax(Node node){
        if(node.right == null){
            return node;
        }
        return findMax(node.right);
    }

    private Node insertRecursively(Node node, int value) {
        if(node == null){
            return new Node(value);
        }
        if(value > node.data){
            node.right = insertRecursively(node.right,value);
        }else if(value < node.data){
            node.left = insertRecursively(node.left, value);
        }
        return node;
    }

    private void print1(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.data+" -> ");
        print1(node.left);
        print1(node.right);
    }

    private void print2(Node node){
        if(node == null){
            return;
        }
        print2(node.left);
        System.out.print(node.data+" -> ");
        print2(node.right);
    }

    private void print3(Node node){
        if(node == null){
            return;
        }
        print3(node.left);
        print3(node.right);
        System.out.print(node.data+" -> ");
    }

    public Node getRoot(){
        return this.root;
    }
}
