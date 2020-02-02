
public class SwapNodes {
	
	public static Node<Integer> swap_nodes(Node<Integer> head, int i, int j){
		Node<Integer> lead = head;
		Node<Integer> temp = head.next;
		Node<Integer> t1 = null;
		Node<Integer> t1prev = null;
		Node<Integer> t2 = null;
		Node<Integer> t2prev = null;
		if (lead.data == j ) {
			t1 = lead;
		}
		if(lead.data == i) {
			t2 = lead;
		}
		while(temp != null) {
			if(temp.data == i) {
				t1prev = lead;
				t1 = temp;
			}
			
			if (temp.data == j) {
				t2prev = lead;
				t2 = temp;
			}
			lead = temp;
			temp = temp.next;
		} 
		if ( t1prev != null) {
			if(!t1prev.equals(t1)) {
			t1prev.next = t2;
			}
		}
		if ( t2prev != null) {
			if(!t2prev.equals(t2)) {
				t2prev.next = t1;	
			}	
		}
		
		Node<Integer> hello = t1.next;
		t1.next = t2.next;
		t2.next = hello;
		return head;
	}
	public static void main(String[] args) {
		Node<Integer> s = LinkedListUse.takeInput();
		LinkedListUse.print(s);
		 s = swap_nodes(s,4,9);
		LinkedListUse.print(s);

	}

}
