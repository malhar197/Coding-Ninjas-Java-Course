package lecture9;

public class BubbleSort {
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void bubblesort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}	
		}
	}

	public static void main(String[] args) {
		int[] arr = {6,9,4,8,3,1};
		bubblesort(arr);
		print(arr);

	}

}
