package practice;

public class SumOfArray {
	
	public static int sum(int[] arr,int index) {
		if (index >= arr.length) {
			return 0;
		}
		int ans = arr[index];
		int smallans = sum(arr,index + 1);
		return ans + smallans;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		System.out.println(sum(arr,0));

	}

}
