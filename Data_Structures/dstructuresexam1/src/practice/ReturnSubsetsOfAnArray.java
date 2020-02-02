package practice;

public class ReturnSubsetsOfAnArray {
	
	public static int[][] returnsubs(int[] arr,int start){
		if(start == arr.length) {
			return new int[1][0];
		}
		int[][] smallans = returnsubs(arr,start + 1);
		int[][] ans = new int[smallans.length * 2][];
		int k = 0;
		for (int i = 0; i < smallans.length; i++) {
			ans[k] = new int[smallans[i].length];
			for (int j = 0; j < smallans[i].length;j++) {
				ans[k][j] = smallans[i][j];
			}
			k++;
		}
		while (k < ans.length) {
			for (int i = 0; i < smallans.length; i++) {
				ans[k] = new int[smallans[i].length + 1];
				ans[k][0] = arr[start];
				for(int j = 0; j < smallans[i].length;j++) {
					ans[k][j+1] = smallans[i][j];
				}
				k++;
			}
		}
		return ans;
		
	}

	public static void main(String[] args) {
		int[]arr = {1,2,3};
		int[][] out = returnsubs(arr,0);
		for(int i = 0; i < out.length;i++) {
			for(int j = 0; j < out[i].length; j++) {
				System.out.print(out[i][j] + " ");
			}
			System.out.println();
		}

	}

}
