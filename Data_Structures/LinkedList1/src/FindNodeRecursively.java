
public class FindNodeRecursively {

	public static int indexofNRec(Node<Integer> head, int n, int index) {
		if(head == null) {
			return -1;
		}
		int smallans = indexofNRec(head.next,n,index + 1);
		if(smallans != -1) {
			return smallans;
		}
		if (head.data == n) {
			return index;
		}
		return smallans;
	}
	public static void main(String[] args) {
		Node<Integer> s = LinkedListUse.takeInput();
		int n = indexofNRec(s,3,0);
		System.out.println(n);

	}

}
