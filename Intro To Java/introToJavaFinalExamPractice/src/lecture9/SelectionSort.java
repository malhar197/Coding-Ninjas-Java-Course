package lecture9;

public class SelectionSort {
	
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void selectionsort(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			int min = Integer.MAX_VALUE;
			int minIndex = -5;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < min) {
					min = arr[j];
					minIndex = j;
				}
			}
			arr[minIndex] = arr[i];
			arr[i] = min;
		}
	}

	public static void main(String[] args) {
		int[] arr = {7,2,9,6,1,5,4};
		selectionsort(arr);
		print(arr);

	}

}
