
public class BubbleSort {
	
	public static void bubblesort(int[] arr){
		int iterations = arr.length - 2;
		
		for(int i = 0; i <= iterations; i++) {
		for (int j = 0; j < arr.length - i - 1; j++) { 
			int last = arr[j];
			if (arr[j + 1] < arr[j]) {
				arr[j] = arr[j + 1];
				arr[j + 1] = last;
			}
			}
		}
		}

	public static void main(String[] args) {
		int[] arr = {8, 2, 6, 1, 5};
		bubblesort(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	
	
	}

	
}
