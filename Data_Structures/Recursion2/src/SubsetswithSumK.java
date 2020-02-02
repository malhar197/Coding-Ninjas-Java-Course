
public class SubsetswithSumK {
	
	private static int[][] subsetsSumKHelper(int[] input, int start, int k){
		if (start == input.length) {
			if(k == 0) {
				return new int[1][0];
			}
			else {
				return new int[0][0];
			}
		}
		int[][] smallout1 = subsetsSumKHelper(input, start + 1, k);
		int[][] smallout2 = subsetsSumKHelper(input, start + 1, k - input[start]);
		int index = 0;
		int[][] output = new int[smallout1.length + smallout2.length][];
		for (int i = 0; i < smallout1.length; i++) {
			output[index] = smallout1[i];
			index++;
		}
		for (int i = 0; i < smallout2.length; i++) {
			output[index] = new int[smallout2[i].length + 1];
			output[index][0] = input[start];
			for(int j = 0; j < smallout2[i].length; j++) {
				output[index][j+1] = smallout2[i][j];
			}
			index++;
		}
		return output;
	}
	
	public static int[][] subsetsSumK(int input[], int k){
		return subsetsSumKHelper(input,0,k);
	}
	
	
	private static void print(int[][] input) {
		for (int i = 0; i < input.length;i++) {
			for(int j = 0; j < input[i].length;j++) {
				System.out.print(input[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[] arr = {5,12,3,17,1,18,15,3,17};
		int[][] out = subsetsSumKHelper(arr, 0, 6);
		print(out);

	}

}
