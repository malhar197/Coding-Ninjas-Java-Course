package test2;

public class Print2DArray {
	
	public static void print2DArray(int input[][]) {
		int rows = input.length;
		int cols = input[0].length;
		int n = rows;
		for (int i = 0; i < input.length; i++) {
			int k = 0;
			while ( k < n) {
				for (int j = 0; j < cols; j++) {
					System.out.print(input[i][j] + " ");
				}
				System.out.println();
				k++;
			}
			n--;
		}
		
	}

	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		print2DArray(arr);

	}

}
