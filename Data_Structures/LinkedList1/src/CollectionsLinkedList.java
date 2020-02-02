import java.util.LinkedList;

public class CollectionsLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(30);
		System.out.println(list.size());
		list.addFirst(40);
		list.addFirst(70);
		list.set(2, 100);
		for (int i = 0; i < list.size();i++) {
			System.out.print(list.get(i) + " ");
		}
	}

}
