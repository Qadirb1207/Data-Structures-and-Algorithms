package Trees.BinarySearchTrees.Problems;

class BinarySearchTree{
    private Node root;
    private int size;

    private class Node{
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

    public void preorder(){
        print1(root);
    }

    public void inorder(){
        print2(root);
    }

    public void postorder(){
        print3(root);
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
}
public class BinarySearchTreeImplementation {
    public static void main(String[] args){
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(5);
        bst.insert(7);
        bst.insert(6);
        bst.insert(9);
        bst.insert(3);
        bst.insert(1);
        bst.insert(2);

        System.out.println("Pre order Traversal:");
        bst.preorder();
        System.out.println();

        System.out.println("In order Traversal:");
        bst.inorder();
        System.out.println();
    

        System.out.println("Post order Traversal:");
        bst.postorder();
        System.out.println();
    
    }
}
