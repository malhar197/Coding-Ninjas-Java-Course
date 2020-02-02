package lecture8;

public class FindDuplicate {
	
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static int finddup(int[] arr) {
	
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j] && i != j) {
					return arr[i];
				}
			}
		}
		
		return Integer.MAX_VALUE;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,4,6,7};
		System.out.println(finddup(arr));

	}

}
