package trees;

import java.util.Scanner;

import queues.QueueEmptyException;
import queues.QueueUsingLL;

public class TreeUse {
	
	public static TreeNode<Integer> takeInput(Scanner s){
		System.out.println("Enter next node data");
		
		int n = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(n);
		System.out.println("Enter number of children for " + n);
		int childCount = s.nextInt();
		for(int i = 0; i < childCount; i++) {
			TreeNode<Integer> child = takeInput(s);
			root.children.add(child);
		}
		return root;
	}
	
	public static TreeNode<Integer> takeInputLevelWise() {
		Scanner s =  new Scanner(System.in);
		System.out.println("Enter your data");
		int rootData = s.nextInt();
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()) {
			try {
			TreeNode<Integer> frontNode = pendingNodes.dequeue();
			System.out.println("Enter number of children of " + frontNode.data);
			int numChildren = s.nextInt();
			for(int i = 0; i < numChildren; i++) {
				System.out.println("Enter " + (i + 1) + "th child of " + frontNode.data);
				int child = s.nextInt();
				TreeNode<Integer> childNode = new TreeNode<Integer>(child);
				frontNode.children.add(childNode);
				pendingNodes.enqueue(childNode);
			}
			} catch (QueueEmptyException e) {
				//Shouldn't come here
				return null;
			}
		}
		return root;
	}
	
	public static void print(TreeNode<Integer> root) {
		String s = root.data + ":";
		for (int i = 0; i < root.children.size();i++) {
			s = s + root.children.get(i).data + " ";
		}
		System.out.println(s);
		for(int i = 0; i < root.children.size();i++) {
			print(root.children.get(i));
		}
	}
	
	public static int numNodes(TreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		int count = 1;
		for (int i = 0; i < root.children.size();i++) {
			count+= numNodes(root.children.get(i));
		}
		return count;
	}
	
	public static int sumNodes(TreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		int sum = root.data;
		for(int i = 0; i < root.children.size();i++) {
			sum+= sumNodes(root.children.get(i));
		}
		return sum;
	}

	public static int largest(TreeNode<Integer> root) {
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		int ans = root.data;
		for(int i = 0; i < root.children.size();i++) {
			int childLargest = largest(root.children.get(i));
			if(childLargest > ans) {
				ans = childLargest;
			}
		}
		return ans;
		
	}
	
	public static int numNodeGreater(TreeNode<Integer> root, int x) {
		if(root == null) {
			return 0;
		}
		int count = 0;
		if(root.data > x) {
			count++;
		}
		for(int i = 0; i < root.children.size(); i++) {
			count += numNodeGreater(root.children.get(i),x);
		}
		return count;
	}

	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
		if(root == null) {
			return null;
		}
		TreeNode<Integer> max = root;
		int sum = root.data;
		for(int i = 0; i < root.children.size(); i++) {
			sum+= root.children.get(i).data;
		}
		for(int i = 0; i < root.children.size();i++) {
			TreeNode<Integer> x = maxSumNode(root.children.get(i));
			int xsum = x.data;
			for(int j = 0; j < x.children.size();j++) {
				xsum += x.children.get(j).data;
			}
			if (xsum > sum) {
				max = x;
			}
		}
		return max;
		
		
	}
	
	public static int height(TreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		int count = 1;
		int smallans = 0;
		for(int i = 0; i < root.children.size();i++) {
			if(height(root.children.get(i)) > smallans) {
				smallans = height(root.children.get(i));
			}
		}
		return count + smallans;
	}
	
	public static void printAtK(TreeNode<Integer> root, int k) {
		if(k < 0) {
			return;
		}
		if(k == 0) {
			System.out.println(root.data);
			return;
		}
		for(int i = 0; i < root.children.size(); i++) {
			printAtK(root.children.get(i), k - 1);
		}
	}
	
	public static int leafNodes(TreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		int count = 0;
		if(root.children.size() == 0) {
			count++;
		}
		for(int i = 0; i < root.children.size(); i++) {
			count+= leafNodes(root.children.get(i));
		}
		
		return count;
	}

	public static void preorder(TreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data + " ");
		for(int i = 0; i < root.children.size();i++) {
			preorder(root.children.get(i));
		}
		
	}
	
	public static void postorder(TreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		for(int i = 0; i < root.children.size();i++) {
			postorder(root.children.get(i));
		}
		System.out.print(root.data + " ");
	}

	public static boolean checkIfContainsX(TreeNode<Integer> root, int x) {
		if(root == null) {
			return false;
		}
		if(root.data == x) {
			return true;
		}
		boolean smallans = false;
		for(int i = 0; i < root.children.size(); i++) {
			smallans = checkIfContainsX(root.children.get(i), x);
			if(smallans == true) {
				break;
			}
		}
		return smallans;
	}
	
	public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2) {
		if(root1.children.size() != root2.children.size()) {
			return false;
		}
		if(root1.data != root2.data) {
			return false;
		}
		for(int i = 0; i < root1.children.size(); i++) {
			boolean smallans = checkIdentical(root1.children.get(i),root2.children.get(i));
			if (smallans == false) {
				return false;
			}
		}
		return true;
	}
	
	public static void printLevelWise(TreeNode<Integer> root) {
		QueueUsingLL<TreeNode<Integer>> q = new QueueUsingLL<TreeNode<Integer>>();
		q.enqueue(root);
		System.out.println(root.data);
		while (!q.isEmpty()) {
			try {
//				System.out.println();
				TreeNode<Integer> front = q.dequeue();
			for(int i = 0; i < front.children.size();i++) {
				q.enqueue(front.children.get(i));
				System.out.print(front.children.get(i).data + " ");
			}
			if (front.children.size() > 0) {
				System.out.println();
			}
			} catch(QueueEmptyException e) {
				return;
			}
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		TreeNode<Integer> root = takeInput(s);
		TreeNode<Integer> root1 = takeInputLevelWise();
		TreeNode<Integer> root2 = takeInputLevelWise();
		print(root1);
//		printLevelWise(root);
//		printAtK(root, 2);
//		System.out.println(leafNodes(root));
//		preorder(root);
		postorder(root1);
		System.out.println();
		postorder(root2);
//		System.out.println(checkIfContainsX(root, 8));
		TreeNode<Integer> rootmax = maxSumNode(root1);
		System.out.println(rootmax.data);
		System.out.println(checkIdentical(root1, root2));
		
		
//		TreeNode<Integer> root = new TreeNode<Integer>(4);
//		TreeNode<Integer> node1 = new TreeNode<Integer>(2);
//		TreeNode<Integer> node2 = new TreeNode<Integer>(3);
//		TreeNode<Integer> node3 = new TreeNode<Integer>(5);
//		TreeNode<Integer> node4 = new TreeNode<Integer>(6);
//		root.children.add(node1);
//		root.children.add(node2);
//		root.children.add(node3);
//		root.children.add(node4);
//		System.out.println(root);
	}

}
