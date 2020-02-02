package lecture8;

public class ArrangeNumsInArray {
	
	public static int[] arrange(int n) {
		int[] arr = new int[n];
		int j = 0;
		for (int i = 1; i <= n; i = i + 2) {
			arr[j] = i;
			j++;
		}
		int k;
		if( n % 2 == 0) {
			k = n;
		}
		else {
			k = n - 1;
		}
		
		while ( j < n) {
			arr[j] = k;
			k = k - 2;
			j++;
		}
		
		return arr;
	}
	
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int arr[] = arrange(14);
		print(arr);

	}

}
