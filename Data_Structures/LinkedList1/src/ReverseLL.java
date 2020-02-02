public class ReverseLL {

	public static Node<Integer> reverseR(Node<Integer> head){
		if (head == null || head.next == null) {
			return head;
		}
		Node<Integer> smallans = reverseR(head.next);
		Node<Integer> temp = smallans;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = head;
		head.next = null;
		return smallans;
	}
	
	public static DoubleNode reverseLLBetter(Node<Integer> head) {
		if(head == null || head.next == null) {
			DoubleNode ans = new DoubleNode();
			ans.head = head;
			ans.tail = head;
			return ans;
		}
		DoubleNode smallans = reverseLLBetter(head.next);
		smallans.tail.next = head;
		head.next = null;
		
		DoubleNode ans = new DoubleNode();
		ans.head = smallans.head;
		ans.tail = head;
		return ans;
	}

	public static Node<Integer> reverseLLBest(Node<Integer> head){
		if(head == null || head.next == null) {
			return head;
		}
		Node<Integer> reversetail = head.next;
		Node<Integer> smallans = reverseLLBest(head.next);
		reversetail.next = head;
		head.next = null;
		return smallans;
	}

	
	public static void main(String[] args) {
		Node<Integer> s = LinkedListUse.takeInput();
		LinkedListUse.print(s);
		
		Node<Integer> r = reverseLLBest(s);
		
		LinkedListUse.print(r);
		
		LinkedListUse.print(s);
	}

}
