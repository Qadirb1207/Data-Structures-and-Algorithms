package Trees.BinarySearchTrees.Problems;

public class CountTotalNodes extends BinarySearchTree{
    public int totalNodes(){
        return countTotalNodes(getRoot());
    }

    private int countTotalNodes(Node node){
        if(node == null){
            return 0;
        }
        int leftNodes = 1+countTotalNodes(node.left);
        int rightNodes = countTotalNodes(node.right);

        return leftNodes+rightNodes;
    }
}

class CountTotalNodesDemo{
     public static void main(String[] args){
        CountTotalNodes bst = new CountTotalNodes();

        bst.insert(10);
        bst.insert(9);
        bst.insert(20);
        bst.insert(8);
        bst.insert(18);
        bst.insert(16);
        bst.insert(21);

        System.out.println("Total Nodes in the Tree are: "+bst.totalNodes());
    }
}
