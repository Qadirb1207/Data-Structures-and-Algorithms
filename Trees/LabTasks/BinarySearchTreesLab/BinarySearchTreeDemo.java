package Trees.BinaryTrees.LabTasks.BinarySearchTreesLab;

public class BinarySearchTreeDemo {
    public static void main(String[] args){
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(50);
        bst.insert(40);
        bst.insert(45);
        bst.insert(20);
        bst.insert(70);

        bst.printInorder();
        System.out.println();

        System.out.println(bst.search(70));
        System.out.println(bst.isValidBST());

        bst.delete(40);
        bst.printInorder();
        System.out.println();
        System.out.println(bst.isValidBST());

        bst.printInRange(30, 80);
        System.out.println();
        System.out.println(bst.isCompleteBinaryTree());
    }
}
