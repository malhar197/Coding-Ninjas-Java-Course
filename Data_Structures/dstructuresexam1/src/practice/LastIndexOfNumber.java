package practice;

public class LastIndexOfNumber {
	
	public static int lastindex(int[] arr, int x, int index) {
		if (index >= arr.length) {
			return -1;
		}
		int smallans = lastindex(arr,x,index + 1);
		if (smallans != -1) {
			return smallans;
		}
		if (arr[index] == x) {
			return index;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {9,8,10,8,9};
		System.out.println(lastindex(arr, 9, 0));

	}

}
