
public class DeleteEveryNNodes {

	public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N){
		Node<Integer> t1 = head;
		Node<Integer> t2 = null;
		while (t1 != null) {
			for (int i = 0; i < M - 1; i++) {
				if(t1 == null) {
					return head;
				}
				t1 = t1.next;
			}
			if(t1 == null) {
				return head;
			}
			t2 = t1.next;
			for(int i = 0; i < N ; i++) {
				if(t2 == null) {
					t1.next = null;
					return head;
				}
				t2 = t2.next;
			}
			t1.next = t2;
			t1 = t1.next;
		}
		return head;
	}
	
	public static Node<Integer> nextLargeNumber(Node<Integer> head) {
        if (head.next == null){
            head.data = head.data + 1;
        	
            return head;
        }
        head.next = nextLargeNumber(head.next);
        
        return head;
	}
	
	public static void main(String[] args) {
		Node<Integer> s = LinkedListUse.takeInput();
		LinkedListUse.print(s);
		Node<Integer> ans = nextLargeNumber(s);
		LinkedListUse.print(ans);

	}

}
