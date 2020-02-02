
public class AllIndicesOfANumber {
	
	private static int[] allIndexes(int[] input, int x, int startIndex) {
		if (startIndex > input.length - 1) {
			int[] ans = new int[0];
			return ans;
		}
		
		int[] smallans = allIndexes(input, x, startIndex + 1);
		if (input[startIndex] == x) {
			if (smallans.length != 0) {
				int[] temp = new int [smallans.length + 1];
				for (int i = 0; i < smallans.length; i++) {
					temp[i + 1] = smallans[i];
				}
				smallans = new int[temp.length];
				temp[0] = startIndex;
				for (int i = 0; i < temp.length; i++) {
					smallans[i] = temp[i];
				}
				return smallans;
			}
			int[] ans = new int[1];
			ans[0] = startIndex;
			return ans;
		}
		return smallans;
		
	}
	
	public static int[] allIndexes(int[] input, int x ) {
		return allIndexes(input,x,0);
	}
	

	public static void main(String[] args) {
		int[] arr = {9,8,10,8,8};
		int[] ans = allIndexes(arr,8,0);
		for(int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}

	}

}
