
public class SortEvenOdd {

	public static Node<Integer> sortEvenOdd(Node<Integer> head){
		Node<Integer> evenhead = null;
		Node<Integer> eventail = null;
		Node<Integer> oddhead  = null;
		Node<Integer> oddtail  = null;
		
		while(head != null) {
			if(head.data % 2 == 0) {
				if(evenhead == null) {
					evenhead = head;
					eventail = head;
				} else {
					eventail.next = head;
					eventail = eventail.next;
				}
			} else {
				if(oddhead == null) {
					oddhead = head;
					oddtail = head;
				} else {
					oddtail.next = head;
					oddtail = oddtail.next;
				}
			}
			head = head.next;
		}
		if(oddtail == null) {
			return evenhead;
		}
		if (eventail == null) {
			return oddhead;
		}
		oddtail.next = evenhead;
		eventail.next = null;
		return oddhead;
	}
	
	public static void main(String[] args) {
		Node<Integer> s = LinkedListUse.takeInput();
		LinkedListUse.print(s);
		Node<Integer> ans = sortEvenOdd(s);
		LinkedListUse.print(ans);

	}

}
