
public class SubsetOfArray {

	private static int[][] subsets(int[] input, int start){
		if(start == input.length) {
			int[][] output = new int[1][0];
			return output;
		}
		int[][]smalloutput = subsets(input,start + 1);
		int[][] output = new int[2*smalloutput.length][];
		
		int k = 0;
		for(int i = 0; i < smalloutput.length;i++) {
			output[k] = new int[smalloutput[i].length];
			for(int j = 0; j < smalloutput[i].length;j++) {
				output[k][j] = smalloutput[i][j];
			}
			k++;
		}
		for (int i = 0; i < smalloutput.length;i++) {
			output[k] = new int[smalloutput[i].length + 1];
			output[k][0] = input[start];
			for(int j = 1; j <= smalloutput[i].length;j++) {
				output[k][j] = smalloutput[i][j - 1];
			}
			k++;
		}
		return output;
		
	}
	
	public static void print(int[][] input) {
		for (int i = 0; i < input.length;i++) {
			for(int j = 0; j < input[i].length;j++) {
				System.out.print(input[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static int[][] subsets(int[] input){
		return subsets(input,0);
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		int[][] arr1 = subsets(arr);
		print(arr1);
	}
}
