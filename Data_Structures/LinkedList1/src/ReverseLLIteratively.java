
public class ReverseLLIteratively {
	
	public static Node<Integer> reverseLLI(Node<Integer> head){
		Node<Integer> ans = head;
		Node<Integer> prev = null;
		while(ans != null) {
			Node<Integer> temp = ans.next;
			ans.next = prev;
			prev = ans;
			ans = temp;
		}
		return prev;
	}

	public static void main(String[] args) {
		Node<Integer> s = LinkedListUse.takeInput();
		LinkedListUse.print(s);
		Node<Integer> r = reverseLLI(s);
		LinkedListUse.print(r);

	}

}
