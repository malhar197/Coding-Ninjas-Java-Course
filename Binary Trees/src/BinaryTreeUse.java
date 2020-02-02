import java.util.Scanner;


public class BinaryTreeUse {

	public static BinaryTreeNode<Integer> takeInput(Scanner s){
		System.out.println("Enter root data");
		int rootData = s.nextInt();
		if(rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		root.left = takeInput(s);
		root.right = takeInput(s);
		return root;
	}
	
	public static void printTree(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		String toBePrinted = root.data + ": ";
		if(root.left != null) {
			toBePrinted += "L: " + root.left.data;
		}
		if(root.right != null) {
			toBePrinted += "R: " + root.right.data;
		}
		System.out.println(toBePrinted);
		printTree(root.right);
		printTree(root.left);
		
	}
	
	public static BinaryTreeNode<Integer> takeInputLevelWise(){
		Scanner s = new Scanner(System.in);
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		int rootData = s.nextInt();
		if(rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		
		while(!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> front;
			try {
				front = pendingNodes.dequeue();
			} catch (QueueEmptyException e) {
				return null;
			}
			System.out.println("Enter left child of " + front.data);
			int leftChild = s.nextInt();
		} 
	}
	
	public static void main(String[] args) {
//		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1); 
//		BinaryTreeNode<Integer> node1 = new BinaryTreeNode<Integer>(2);
//		BinaryTreeNode<Integer> node2 = new BinaryTreeNode<Integer>(3);
//		root.right = node2;
//		root.left = node1;
		Scanner s = new Scanner(System.in);
		BinaryTreeNode<Integer> root = takeInput(s);
		printTree(root);
	}

}
