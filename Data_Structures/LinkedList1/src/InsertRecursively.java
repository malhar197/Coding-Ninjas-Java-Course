
public class InsertRecursively {

	public static Node<Integer> insertR(Node<Integer> head, int n, int elem){
		if (head == null) {
			System.out.println("Invalid position");
			return head;
		}
		
		if (n == 0) {
			Node<Integer> ans = new Node<Integer>(elem);
			ans.next = head;
			return ans;
		}
		Node<Integer> smallans = insertR(head.next, n - 1, elem);
		head.next = smallans;
		return head;
	}
	
	public static void main(String[] args) {
		Node<Integer> s = LinkedListUse.takeInput();
		Node<Integer> n = insertR(s,0,10);
		LinkedListUse.print(n);

	}

}
