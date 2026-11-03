package Trees.BinarySearchTrees.Problems;

public class HeightOfBinarySearchTree extends BinarySearchTree{
    public int height(){
        return heightOfTree(super.getRoot());
    }

    private int heightOfTree(Node node){
        if(node == null){
            return 0;
        }
        return Math.max(heightOfTree(node.left), heightOfTree(node.right))+1;
    }
}

class HeightOfATreeDemo{
    public static void main(String[] args){
        HeightOfBinarySearchTree hBst  = new HeightOfBinarySearchTree();

        hBst.insert(10);
        hBst.insert(12);
        hBst.insert(9);
        hBst.insert(18);
        hBst.insert(3);
        hBst.insert(1);

        System.out.println("Height of the tree is: "+hBst.height());
    }
}