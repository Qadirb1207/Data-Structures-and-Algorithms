package Trees.BinarySearchTrees.Problems;

public class SumOfAllNodes extends BinarySearchTree{
    public int sum(){
        return sumOfNodes(super.getRoot());
    }
    private int sumOfNodes(Node node){
        int sum = 0;
        if(node == null){
            return sum;
        }     
        
        sum += sumOfNodes(node.left);
        sum += node.data;
        sum += sumOfNodes(node.right);
        
        return sum;
    }
}

class SumDemo{
    public static void main(String[] args){
        SumOfAllNodes bst = new SumOfAllNodes();

        bst.insert(10);
        bst.insert(9);
        bst.insert(15);
        bst.insert(12);
        bst.insert(16);
        bst.insert(8);
        bst.insert(7);

        System.out.println("Sum of Nodes is: "+bst.sum());
    }
}
