package lecture8;

public class LinearSearch {
	
	public static int linearsearch(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				return i;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {5,4,7,9,1,3,0};
		System.out.println(linearsearch(arr,99));

	}

}
