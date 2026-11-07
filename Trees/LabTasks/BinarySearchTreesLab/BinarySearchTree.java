package Trees.BinaryTrees.LabTasks.BinarySearchTreesLab;

// ======= TASK 1 ===========
public class BinarySearchTree {
    private Node root;

    public BinarySearchTree(){
        this.root = null;
    }

    //method for inserting value
    public void insert(int data){
        this.root = insertRecursively(root, data);
    }

    private Node insertRecursively(Node node, int data){
        if(node == null){
            return new Node(data);
        }

        if(data > node.data){
            node.right = insertRecursively(node.right, data);
        }else if(data < node.data){
            node.left = insertRecursively(node.left, data);
        }
        return node;
    }

    //method for searching 
    public boolean search(int data){
        Node node = searchRecursively(root, data);
        return node != null;
    }

    private Node searchRecursively(Node node, int data){
        if(node == null){
            return null;
        }

        if(node.data == data){
            return node;
        }

        if(data > node.data){
            return searchRecursively(node.right, data);
        }
        else{
            return searchRecursively(node.left, data);
        }
    }

    //method for deleting a node
    public void delete(int data){
        root = deleteRecursively(root, data);
    }

    private Node deleteRecursively(Node node, int data){
        if(node == null){
            return null;
        }

        if(data > node.data){
            node.right = deleteRecursively(node.right, data);
        }else if(data < node.data){
            node.left = deleteRecursively(node.left, data);
        }else{
            //case 1 and case 2
            if(node.left == null){
                return node.right;
            }
            if(node.right == null){
                return node.left;
            }

            //finding successor(minimum in right subtree) from right subtree
            /*OR WE can also find the predecessor (maximum in left subtree) and do the same as follows */
            Node successor = findMin(node.right);
            //changing data of node we want to delete with the successor's data
            node.data = successor.data;
            //deleting the successor
            node.right = deleteRecursively(node.right, successor.data);
        }
        return node;
    }

    //method for printing the tree using inorder traversal
    public void printInorder(){
        inorder(root);
    }

    private void inorder(Node node){
        if(node == null){
            return;
        }
        inorder(node.left);
        System.out.print(node.data+" -> ");
        inorder(node.right);
    }

    //method for pre order 
    public void printPreorder(){
        preorder(root);
    }

    private void preorder(Node node){
        if(node == null){
            return;
        }

        System.out.print(node.data +" -> ");
        preorder(node.left);
        preorder(node.right);
    }

    //method for post order
    //method for printing the tree using inorder traversal
    public void printPostorder(){
        inorder(root);
    }

    private void postorder(Node node){
        if(node == null){
            return;
        }
        inorder(node.left);
        inorder(node.right);
        System.out.print(node.data+" -> ");
    }

    //============= TASK 2 ============
    public int findMin(){
        Node minNode = findMin(root);
        if(minNode != null){
            return minNode.data;
        }
        return -1;
    }

    private Node findMin(Node node){
        if(node == null){
            return null;
        }
        if(node.left == null){
            return node;
        }
        return findMin(node.left);
    }

    //method for finding maximum element
    public int findMax(){
        Node max = findMax(root);
        if(max != null){
            return max.data;
        }
        return -1;
    }

    private Node findMax(Node node){
        if(node == null){
            return null;
        }
        if(node.right == null){
            return node;
        }
        return findMax(node.right);
    }


    //====== TASK 3 ==========
    public boolean isValidBST(){
        return isValid(root);
    }
/*  50
   /  \
  40  70
 / \
80 45

 */
    private boolean isValid(Node node){
        if(node == null){
            return true;    
        }
        if(node.left != null && node.left.data > node.data){
            return false;
        }
        if(node.right != null && node.right.data < node.data){
            return false;
        }
        return isValid(node.left) && isValid(node.right);
        
    }

    // ============ TASK 4 ===============
    //method for finding all the values within a given range
    public void printInRange(int low, int high){
        printRecursively(root, low, high);
    }

    private void printRecursively(Node node, int low, int high){
        if(node == null){
            return;
        }
        printRecursively(node.left, low, high);
        if(node != null && (node.data >= low && node.data <=high)){
            System.out.print(node.data+" -> ");
        }
        
        printRecursively(node.right, low, high);
    }



    // ========== TASK 5 ============
    public boolean isCompleteBinaryTree(){
        return isCompleteBinaryTree(root);
    }

    private boolean isCompleteBinaryTree(Node node){
        if(node == null){
            return true;
        }
        if(node.left == null && node.right != null){
            return false;
        }
        return isCompleteBinaryTree(node.left) && isCompleteBinaryTree(node.right);
    }
    //node class
    private class Node{
        private int data;
        private Node left;
        private Node right;

        public Node(int data){
            this.data = data;
            this.right = this.left = null;
        }
    }
}
