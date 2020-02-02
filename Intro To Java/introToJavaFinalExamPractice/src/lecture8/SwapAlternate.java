package lecture8;

public class SwapAlternate {
	
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void swapalt(int[] input) {
		for (int i = 1; i < input.length; i++) {
			int temp = input[i];
			input[i] = input[i - 1];
			input[i - 1] = temp;
			i++;
			
		}
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		swapalt(arr);
		print(arr);

	}

}
