package Trees.BinarySearchTrees.Problems;

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

        System.out.println("Minimum is: "+bst.findMin());
        System.out.println("Maximum is: "+bst.findMax());

        bst.delete(5);
        bst.preorder();
        System.out.println();

        int value = 92;
        System.out.println("Does "+ value+" exists in the tree?="+ bst.search(value));

        bst.updateValue(6, -10);
        bst.preorder();

    
    }
}
