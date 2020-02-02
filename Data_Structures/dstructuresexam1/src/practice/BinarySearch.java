package practice;

public class BinarySearch {
	
	public static int binarysearch(int[] arr, int x, int start, int end) {
		if (start > end) {
			return -1;
		}
		int mid = (start + end)/2; 
		if (x == arr[start]) {
			return start;
		}
		if ( x == arr[mid]) {
			return mid;
		}
		if ( x == arr[end]) {
			return end;
		}
		else {
		if (x > arr[mid]) {
			return binarysearch(arr, x, mid + 1, end);
		}
		else {
			return binarysearch(arr, x, start, mid - 1);
		}
		}
	}

	public static void main(String[] args) {
		int[] arr = {2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		System.out.println(binarysearch( arr, 12, 0, arr.length - 1));

	}

}
