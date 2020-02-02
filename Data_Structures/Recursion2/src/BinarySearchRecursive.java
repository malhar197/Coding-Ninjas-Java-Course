
public class BinarySearchRecursive {
	
	private static int binarysearch(int[] input,int start, int end,int x) {
		int mid = (start + end) / 2;
		
		if (end < start) {
			return -1;
		}
		if (x < input[mid]) {
			return binarysearch(input,start,mid - 1,x);
		}
		if (x > input[mid]) {
			return binarysearch(input,mid+1,end,x);
		}
		if ( x == input[mid]) {
			return mid;
		}
		
		return -1;
		
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		System.out.println(binarysearch(arr,0,arr.length - 1, 7));

	}

}
