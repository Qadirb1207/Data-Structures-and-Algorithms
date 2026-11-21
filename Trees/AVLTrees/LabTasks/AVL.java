package Trees.AVLTrees.LabTasks;

public class AVL {
    private Node root;
    private class Node{
        private int data;
        private int height;
        private Node left;
        private Node right;
        
        public Node(int data){
            this.data = data;
            this.height = 1;
            this.left = this.right = null;
        }
    }

    //method for height of the whole tree
    public int height(){
        return height(root);
    }
    //method for height of a Node
    private int height(Node node){
        if(node == null){
            return 0;
        }
        return node.height;
    }

    //method for balance factor of a node
    private int getBalance(Node node){
        if(node == null){
            return 0;
        }
        return height(node.left) - height(node.right);
    }

    public void insert(int data){
        root = insertRecursively(root, data);
    }

    private Node insertRecursively(Node node, int data){
        if(node == null){
            return new Node(data);
        }
        if(data > node.data){
            node.right = insertRecursively(node.right, data);
        }
        else if(data < node.data){
            node.left = insertRecursively(node.left, data);
        }

        node.height = Math.max(height(node.left), height(node.right))+1;
        return rotate(node);
    }

    private Node rotate(Node node){
        //==================== LEFT CASES ==================
        if(height(node.left) - height(node.right) > 1){
            //left heavy
            if(height(node.left.left) - height(node.left.right) > 0){
                //left left case
                return rightRotate(node);
            }
            if(height(node.left.left) - height(node.left.right) < 0){
                //left right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }


        //==================== RIGHT CASES ==================
        if(height(node.left) - height(node.right) < -1){
            //right heavy
            if(height(node.right.left) - height(node.right.right) < 0){
                //right right case
                return leftRotate(node);
            }
            if(height(node.right.left) - height(node.right.right) > 0){
                //left right case
                node.right = rightRotate(node.left);
                return leftRotate(node);
            }
        }
        return node;
    }

    private Node rightRotate(Node node) {
        Node c = node.left;
        Node t = c.right;

        //rotating
        c.right = node;
        node.left = t;
        //updating heights
        //  node.height = Math.max(height(node.left), height(node.right))+1;
        //  c.height = Math.max(height(c.left), height(c.right))+1;
        updateHeight(node);
        updateHeight(c);
        return c;
    }

    private void updateHeight(Node node) {
        if(node != null){
            node.height = 1+Math.max(height(node.left), height(node.right));
        }
        
    }

    private Node leftRotate(Node node) {
        Node c = node.right;
        Node t = c.left;

        //rotating
        c.left = node;
        node.right = t;

        //updating heights
        // node.height = 1+Math.max(height(node.left), height(node.right));
        // c.height = 1+Math.max(height(c.left), height(c.right));
        updateHeight(node);
        updateHeight(c);
        return c;
    }

}
