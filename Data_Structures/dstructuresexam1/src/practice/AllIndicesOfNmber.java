package practice;

public class AllIndicesOfNmber {
	
	private static int[] allindices(int[] arr, int x, int index) {
		if (index >= arr.length) {
			return new int[0];
		}
		int[] smallans = allindices(arr, x, index + 1);
		if(arr[index] == x) {
			int[] ans = new int[smallans.length + 1];
			ans[0] = index;
			for(int i = 1; i < ans.length; i++) {
				ans[i] = smallans[i - 1];
			}
			return ans;
		}
		return smallans;
	}

	public static void main(String[] args) {
		int[] arr = {9,8,10,8,8};
		int[] out = allindices(arr,8,0);
		for(int i = 0; i < out.length; i++) {
			System.out.print(out[i] + " ");
		}

	}

}
