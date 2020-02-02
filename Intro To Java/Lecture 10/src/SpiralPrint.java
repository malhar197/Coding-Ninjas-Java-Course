import java.util.Scanner;

public class SpiralPrint {
	
	public static int[][]takeinput(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows = s.nextInt();
		System.out.println("Enter number of columns");
		int columns = s.nextInt();
		int input[][] = new int[rows][columns];
		for (int i = 0; i < rows ; i++) {
			for(int j = 0; j < columns; j++) {
				System.out.println("Enter element at " + i +"th row and " + j +"th column");
				input[i][j] = s.nextInt();
			}
		}
		return input;
	}
	
	public static void spiralPrint(int matrix[][]) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		int count = 0;
		int rs = 0;
		int re = rows - 1;
		int cs = 0;
		int ce = cols - 1;
		while (count < rows * cols) {
			for (int j = cs; j <= ce; j++) {
				System.out.print(matrix[rs][j] + " ");
				count++;
			}
			rs++;
			for (int i = rs; i <= re; i++ ) {
				System.out.print(matrix[i][ce] + " ");
				count++;
			}
			ce--;
			for (int j = ce; j >= cs; j--) {
				System.out.print(matrix[re][j] + " ");
				count++;
			}
			re--;
			for (int i = re; i >= rs; i--) {
				System.out.print(matrix[i][cs] + " ");
				count++;
			}
			cs++;
		}
		
	}

	public static void main(String[] args) {
		int[][] input = takeinput();
		spiralPrint(input);

	}

}
