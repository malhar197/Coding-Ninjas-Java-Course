package practice;

public class SplitArray {
	
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
	
	public static int sum(int[] input) {
		int sum = 0;
		for (int i = 0; i < input.length; i++) {
			sum = sum + input[i];
		}
		return sum;
	}
	
	public static int sum5(int[] input,int index) {
		if(index >= input.length) {
			return 0;
		}
		int ans = 0;
		int smallans = sum5(input, index + 1);
		if (input[index] % 5 == 0) {
			ans = input[index];
			input[index] = 0;
		}
		return ans + smallans;
	}
	
	public static void reorganize(int[] input) {
		int count = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] != 0) {
				count++;
			}
		}
		int[] temp = new int[count];
		count = 0;
		for (int i = 0; i < input.length; i++) {
			if(input[i] != 0) {
				temp[count] = input[i];
				count++;
			}
		}
		input = new int[temp.length];
		for (int i = 0; i < temp.length; i++) {
			input[i] = temp[i];
		}
	}
	
	public static int sum3(int[] input, int index) {
		if(index >= input.length) {
			return 0;
		}
		int ans = 0;
		int smallans = sum3(input, index + 1);
		if (input[index] % 3 == 0) {
			ans = input[index];
			input[index] = 0;
		}
		return ans + smallans;
		
	}
	
	public static boolean splitArray(int[] input) {
		int sumof5 = sum5(input,0);
		reorganize(input);
		int sumof3 = sum3(input,0);
		reorganize(input);
		mergesort(input,0,input.length-1);
		int sum = sum(input);
		if(sumof5 > sumof3) {
			if(sumof5 > sumof3 + sum) {
				return false;
			}
			else {
				sum = sumof3 + sum;
				for(int i = 0; i < input.length;i++) {
					sum = sum - input[i];
					sumof5 = sumof5 + input[i];
					if(sum == sumof5) {
						return true;
					}
				}
				return false;
			}
		} else {
			if (sumof5 + sum < sumof3) {
				return false;
			} else {
				sum = sumof5 + sum;
				for (int i = 0; i < input.length; i++) {
					sum = sum - input[i];
					sumof3 = sumof3 + input[i];
					if(sum == sumof3) {
						return true;
					}
				}
				return false;
			}
		}
		
	}

	public static void main(String[] args) {
		int[] arr = {1,3,6};
		System.out.println(splitArray(arr));

	}

}
