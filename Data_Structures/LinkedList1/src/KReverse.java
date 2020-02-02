
public class KReverse {
	
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

	public static Node<Integer> reverseList(Node<Integer> A, int B) {
        Node<Integer> current = A;
        Node<Integer> next = null;
        Node<Integer> prev = null;
        
        int count = 0;

        while (count < B && current != null) {
           next = current.next;
           current.next = prev;
           prev = current;
           current = next;
           count++;
        }

        if (next != null) 
          A.next = reverseList(next, B);

        return prev;
    }
	
	public static void main(String[] args) {
		Node<Integer> s = LinkedListUse.takeInput();
		LinkedListUse.print(s);
		Node<Integer> k = reverseList(s, 4);
		LinkedListUse.print(k);

	}

}
