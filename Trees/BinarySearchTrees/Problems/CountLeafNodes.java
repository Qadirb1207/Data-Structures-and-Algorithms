package Trees.BinarySearchTrees.Problems;

public class CountLeafNodes extends BinarySearchTree{
    public int leafNodes(){
        return totalLeafNodes(super.getRoot());
    }

    private int totalLeafNodes(Node node){
        if(node.left == null && node.right == null){
            return 1;
        }
        int leafNodes = 0;
        if(node.left != null){
            leafNodes += totalLeafNodes(node.left);
        }
        if(node.right != null){
            leafNodes += totalLeafNodes(node.right);
        }
        
        return leafNodes;
    }
}

class LeafNodesCounting{
    public static void main(String[] args){
        CountLeafNodes bst = new CountLeafNodes();

        bst.insert(19);
        bst.insert(10);
        bst.insert(12);
        bst.insert(11);
        bst.insert(20);
        bst.insert(22);
        bst.insert(23);
        bst.insert(24);


        System.out.println("Total Leaf nodes are: "+bst.leafNodes());
    }
}
