
public class BubbleSortLL {

	public static int length(Node<Integer> head) {
		int count = 0;
		while (head != null) {
			head = head.next;
			count++;
		}
		return count;
	}
	
	public static Node<Integer> bubbleSort(Node<Integer> head){
		
		for (int i = 0; i < length(head); i++) {
		Node<Integer> prev = null;
		Node<Integer> curr = head;
		while (curr != null) {
			if (curr.next == null) {
				break;
			}
			if (curr.data > curr.next.data) {
				Node<Integer> next = curr.next;
				if (prev == null) {
					head = next;
				}
				if (prev != null) {
				prev.next = next;
				}
				curr.next = next.next;
				next.next = curr;
				continue;
			} 
			prev = curr;
			curr = curr.next;
		}
		}
		return head;
		
	}
	
	public static void main(String[] args) {
		int[] arr = {4,5,1,8,3};
		Node<Integer> s = LinkedListUse.takeInput();
		System.out.println(length(s));
		LinkedListUse.print(s);
		Node<Integer> r = bubbleSort(s);
		LinkedListUse.print(r);
	}

}
