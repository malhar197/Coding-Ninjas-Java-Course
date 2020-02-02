package lecture9;

public class BinarySearch {
	
	public static int binarysearch(int[] input, int n) {
		int min = 0;
		int max = input.length-1;
		int mid = (input.length-1)/2;
		while (min <= max) {
			if (input[mid] == n) {
				return mid;
			}
			else if (input[mid] > n) {
				max = mid - 1;
				mid = (min + max)/2;
			}
			else {
				min = mid + 1;
				mid = (min + max)/2;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {1,3,7,9,11,12,45};
		System.out.println(binarysearch(arr,6));

	}

}
