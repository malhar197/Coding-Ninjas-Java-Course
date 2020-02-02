package practice;

public class MergeSort {
	
	private static void merge(int[] arr,int start, int end) {
		int mid = (start + end)/2;
		int s1 = start;
		int s2 = mid + 1;
		int[] out = new int[end - start + 1];
		int count = 0;
		while(s1 <= mid && s2 <= end) {
			if (arr[s1] > arr[s2]) {
				out[count] = arr[s2];
				count++;
				s2++;
			}
			else if (arr[s2] > arr[s1]) {
				out[count] = arr[s1];
				s1++;
				count++;
			}
		}
		while (s1 <= mid) {
			out[count] = arr[s1];
			s1++;
			count++;
		}
		while (s2 <= end) {
			out[count] = arr[s2];
			s2++;
			count++;
		}
		count = 0;
		for (int i = start; i <= end; i++) {
			arr[i] = out[count];
			count++;
		}
		
	}
	
	public static void mergesort(int[] arr, int start, int end) {
		if(start >= end) {
			return;
		}
		int mid = (start + end)/2;
		mergesort(arr,start,mid);
		mergesort(arr,mid + 1,end);
		merge(arr,start,end);
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,6,5,4};
		mergesort(arr,0,arr.length-1);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
