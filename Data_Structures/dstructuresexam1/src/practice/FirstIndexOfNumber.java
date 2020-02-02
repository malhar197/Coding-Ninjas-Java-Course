package practice;

public class FirstIndexOfNumber {
	
	private static int firstIndex (int[] arr, int x, int index) {
		if (index >= arr.length) {
			return -1;
		}
		if (arr[index] == x) {
			return index;
		}
		int smallans = firstIndex(arr, x, index + 1);
		return smallans;
	}

	public static void main(String[] args) {
		int[] arr = {9,8,10,8,10,11};
		System.out.println(firstIndex(arr, 11, 0));

	}

}
