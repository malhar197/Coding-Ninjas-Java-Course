
public class DeleteRecursively {

	public static Node<Integer> deleteR(Node<Integer> head,int n){
		if(head == null) {
			return head;
		}
		if(n == 0) {
			return head.next;
		}
		Node<Integer> smallans = deleteR(head.next, n - 1);
		head.next = smallans;
		return head;
	}
	
	public static void main(String[] args) {
		Node<Integer> s = LinkedListUse.takeInput();
		LinkedListUse.print(s);
		Node<Integer> r = deleteR(s,1);
		LinkedListUse.print(r);
	}

}
