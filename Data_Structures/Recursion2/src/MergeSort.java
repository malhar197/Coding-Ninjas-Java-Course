
public class MergeSort {
	
	private static void merge(int[] input, int start, int end) {
		int[] arr = new int[end - start + 1];
		int mid = (start + end) / 2;
		int i = start;
		int k = 0;
		int j = mid + 1;
		while (i <= mid && j <= end ) {
			if (input[j] < input[i]) {
				arr[k] = input[j];
				k++;
				j++;
			}
			else {
				arr[k] = input[i];
				i++;
				k++;
			}
		}
		while (i <= mid) {
			arr[k] = input[i];
			k++;
			i++;
		}
		
		while ( j <= end) {
			arr[k] = input[j];
			k++;
			j++;
		}
		
		for (int l = 0; l < arr.length; l++) {
			input[l + start] = arr[l];
		}
		
		
	}
	
	 static void mergeSort(int[] input, int start, int end) {
		if (start >= end) {
			return;
		}
		int mid = (start + end) / 2 ;
		mergeSort(input,start,mid);
		mergeSort(input,mid + 1,end);
		merge(input,start,end);
		
	}
	
	public static void mergeSort(int[] input) {
		mergeSort(input, 0, input.length - 1);
	}

	public static void main(String[] args) {
		int[] arr = {2,6,8,5,4,3,0,7,9,1,21,45,76,81,99};
		mergeSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
