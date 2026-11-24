package Trees.AVLTrees.LabTasks;

public class AVLDemo {
    public static void main(String[] args){
        AVL tree = new AVL();

        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(10);
        tree.insert(25);
        tree.insert(35);
        tree.insert(50);

        System.out.println("The Original Tree");
        tree.inorder();
        System.out.println("\n\n Inorder Traversal");
        tree.inorder();

        System.out.println("\n\n Preorder Traversal");
        tree.preorder();

        System.out.println("\n\n Post Traversal");
        tree.postorder();
    }
}
