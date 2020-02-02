import java.util.Scanner;

public class LinkedListUse {
	
	public static void print(Node<Integer> n) {
		Node<Integer> head = n;		
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
			}
		System.out.println();
	}
	
	public static Node<Integer> takeInput(){
		Node<Integer> head = null, tail = null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		while (data > -1) {
			Node<Integer> newNode = new Node<Integer>(data);
			if(head == null) {
			head = newNode;
			tail = newNode;
			}
			else {
//				Node<Integer> temp = head;
//				while(temp.next != null) {
//					temp = temp.next;
//				}
//				temp.next = newNode;
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
		
	}

	public static Node<Integer> insert(Node<Integer> head, int data, int pos) {
		Node<Integer> newNode = new Node<Integer>(data);
		if(pos == 0) {
			newNode.next = head;
			return newNode;
		}
		Node<Integer> temp = head;
	for (int i = 0; i < pos - 1; i++) {
		temp = temp.next;
	}
	newNode.next = temp.next;
	temp.next = newNode;
	return head;
	}

	public static Node<Integer> deleteNode(Node<Integer> head, int i){
		if(i == 0) {
			head = head.next;
			return head;
		} else {
			Node<Integer> temp = head;
			for(int k = 0; k < i - 1; k++) {
				if(temp.next == null) {
					return head;
				}
				temp = temp.next;
			}
			if(temp == null || temp.next == null) {
				return head;
			} else {
				temp.next = temp.next.next;
				return head;
			}
			
		}
	}

	public static Node<Integer> reverseNode(Node<Integer> head){
		Node<Integer> temp = head;
		int i = 0;
		while (temp.next != null) {
			i++;
			temp = temp.next;
		}
		Node<Integer> reverse = new Node<Integer>(temp.data);
		Node<Integer> reversetemp1 = reverse;
		i--;
		while (i > -1) {
			temp = head;
			for (int j = 0; j < i; j++) {
				temp = temp.next;
			}
			Node<Integer> reversetemp2 = new Node<Integer>(temp.data);
			reversetemp1.next = reversetemp2;
			reversetemp1 = reversetemp2;
			i--;
		}
		return reverse;
		}

	public static boolean checkPalindrome(Node<Integer> head, Node<Integer> reverse) {
		while (head != null) {
			if(head.data != reverse.data) {
				return false;
			}
			head = head.next;
			reverse = reverse.next;
		}
		return true;
	}
	
	public static Node<Integer> removeDuplicates(Node<Integer> head){
		Node<Integer> t1 = head;
		Node<Integer> t2 = t1.next;
		while (t1 != null && t2 != null) {
			if(t1.data == t2.data) {
				t2 = t2.next;
				continue;
			} else {
				t1.next = t2;
				t1 = t2;
				t2 = t2.next;
			}
		}
		t1.next = null;
		return head;
	}

	public static Node<Integer> getMiddle(Node<Integer> head) {
		Node<Integer> fast = head;
		Node<Integer> slow = head;
		while (fast != null && fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	public static Node<Integer> mergeLists(Node<Integer> head1, Node<Integer> head2){
		if(head1 == null) {
			return head2;
		}
		if(head2 == null) {
			return head1;
		}
		Node<Integer> temp = null;
		if(head1.data < head2.data) {
			temp = head1;
			temp.next = mergeLists(head1.next,head2);
		} else {
			temp = head2;
			temp.next = mergeLists(head1,head2.next);
		}
		return temp;
	}
	
	public static Node<Integer> mergeSortList(Node<Integer> head){
		if (head == null || head.next == null) {
			return head;
		}
		Node<Integer> mid = getMiddle(head);
		Node<Integer> midnext = mid.next;
		mid.next = null;
		
		Node<Integer> left = mergeSortList(head);
		Node<Integer> right = mergeSortList(midnext);
		
		Node<Integer> sorted = mergeLists(left,right);
		return sorted;
	}

	public static Node<Integer> reverserec(Node<Integer> head){
		if(head.next == null) {
			return head;
		}
		Node<Integer> smallans = reverserec(head.next);
		Node<Integer> temp = smallans;
		while (smallans.next != null) {
			smallans = smallans.next;
		}
		smallans.next = head;
		head.next = null;
		smallans = temp;
		return smallans;
	}
	
	public static void main(String[] args) {
		Node<Integer> head1 = takeInput();
//		Node<Integer> head2 = takeInput();
//		head = insert(head,80,0);
//		print(deleteNode(head,4));
//		Node<Integer> reverse = reverseNode(head);
//		print(reverse);
		print(head1);
//		print(head2);
//		print(reverserec(head1));
		print(mergeSortList(head1));
//		System.out.println(checkPalindrome(head,reverse));
//		print(removeDuplicates(head));
//		System.out.println(printMiddlel(head1));
		
		
//		Node<Integer> node1 = new Node<Integer>(10);
//		Node<Integer> node2 = new Node<Integer>(20);
//		Node<Integer> node3 = new Node<Integer>(30);
//		node1.next = node2;
//		node2.next = node3;	
	}

}
