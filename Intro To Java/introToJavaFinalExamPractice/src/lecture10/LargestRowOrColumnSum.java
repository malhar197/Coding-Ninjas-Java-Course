package lecture10;

public class LargestRowOrColumnSum {
	
	public static void largestrowcol(int[][] input) {
		int rows  = input.length;
		int cols = input[0].length;
		int rlargest = Integer.MIN_VALUE;
		int rIndex = 0;
		int clargest = Integer.MIN_VALUE;
		int cIndex = 0;
		for (int i = 0; i < rows; i++) {
			int sum = 0;
			for (int j = 0; j < cols; j++) {
				sum = sum + input[i][j];
			}
			if (sum > rlargest) {
				rlargest = sum;
				rIndex = i;
			}
		}
		
		for (int i = 0; i < cols; i++) {
			int sum = 0;
			for (int j = 0; j < rows; j++) {
				sum = sum + input[j][i];
			}
			if (sum > clargest) {
				clargest = sum;
				cIndex = i;
			}
		}
		
		if (clargest > rlargest) {
			System.out.println("column " + cIndex + " " + clargest);
		}
		else {
			System.out.println("row " + rIndex + " " + rlargest);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
