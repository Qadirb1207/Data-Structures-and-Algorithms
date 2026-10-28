package Trees.LabTasks;
//======== TASK 1 ============
public class ManualBinaryTree{
	Node root;
	class Node{
		private int data;
		private Node left;
		private Node right;

		Node(int data){
			this.data = data;
			this.left = this.right = null;
		}
	}
	public void setLeft(Node parent, int data){
		if(root == null){
			root = new Node(data);
			return;
		}

		parent.left = new Node(data);
	}

	public void setRight(Node parent, int data){
		if(root == null){
			root = new Node(data);
			return;
		}

		parent.right = new Node(data);
	}
	
	//===== TASK 2 ============
	public void inorder(){
		displayInorder(root);
	}

	private void displayInorder(Node node){
		if(node == null){
			return;
		}
		displayInorder(node.left);
		System.out.print(node.data+" -> ");
		displayInorder(node.right);
	}

	//========= TASK 3 ==========
	public void preorder(){
		displayPreorder(root);
	}
	

	private void displayPreorder(Node node){
		if(node == null){
			return;
		}
		System.out.print(node.data+" -> ");
		displayPreorder(node.left);
		displayPreorder(node.right);
	}

	//========== TASK 4 ===========
	public void postorder(){
		displayPostorder(root);
	}

	private void displayPostorder(Node node){
		if(node == null){
			return;
		}
		displayPostorder(node.left);
		displayPostorder(node.right);
		System.out.print(node.data+" -> ");
	}

	// ====== TASK 5 ========
	public int countNodes(){
		return countTotalNodes(root);
	}

	private int countTotalNodes(Node node){
		if(node == null){
			return 0;
		}
		int left = countTotalNodes(node.left)+1;
		int right = countTotalNodes(node.right);

		return left+right;
	}
	public static void main(String[] args){
		ManualBinaryTree tree = new ManualBinaryTree();
		tree.setLeft(tree.root, 10);
		tree.setLeft(tree.root, 5);
		tree.setRight(tree.root, 20);
		tree.setLeft(tree.root.left, 3);
		tree.setRight(tree.root.left, 7);
		tree.setLeft(tree.root.right, 15);
		tree.setRight(tree.root.right, 25);

		System.out.println("Inorder Traversal: ");
		tree.inorder();
		System.out.println();

		System.out.println("Preorder Traversal: ");
		tree.preorder();
		System.out.println();

		System.out.println("Postorder Traversal: ");
		tree.postorder();
		System.out.println();

		System.out.println("Total Nodes: "+tree.countNodes());
		
	}
}