package lecture9;

public class InsertionSort {
	
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void insertionsort(int[] arr) {
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j >= 1;j--) {
				if (arr[j] < arr[j-1]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {9,8,5,6,2,1,4,3,10,20,15};
		insertionsort(arr);
		print(arr);

	}

}
