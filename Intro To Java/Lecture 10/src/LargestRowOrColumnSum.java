
public class LargestRowOrColumnSum {
	
	public static void findlargest(int[][] input) {
		int largest_col = Integer.MIN_VALUE;
		int col_num = -1;
		int largest_row = Integer.MIN_VALUE;
		int row_num = -1;
		int rows = input.length;
		int cols = input[0].length;
		for (int i = 0; i < cols; i++) {
			int sum = 0;
			for (int j = 0; j < rows; j++) {
				sum = sum + input[j][i];
			}
			if (sum > largest_col) {
				largest_col = sum;
				col_num = i;
			}
		}
		
		for (int i = 0; i < rows; i++) {
			int sum = 0;
			for (int j = 0; j < cols; j++) {
				sum = sum + input[i][j];
			}
			if (sum > largest_col) {
				largest_row = sum;
				row_num = i;
			}
		}
		
		if ( largest_row >= largest_col) {
			System.out.println("row " + row_num + " " +largest_row);
		}
		
		else {
			System.out.println("column " + col_num + " " + largest_col);
		}
		
		
	}

	public static void main(String[] args) {
		int[][] input = {{1,4,7},{2,5,8},{3,6,9}};
		
		findlargest(input);

	}

}
