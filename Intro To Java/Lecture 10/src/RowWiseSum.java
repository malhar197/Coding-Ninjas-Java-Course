import java.util.Scanner;

public class RowWiseSum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int rows = s.nextInt();
		int cols = s.nextInt();
		int [][] input = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				input[i][j] = s.nextInt();
			}
		}
		for (int i = 0; i < rows; i++) {
			int sum = 0;
			for (int j = 0; j < cols; j++) {
				sum = sum + input[i][j];
			}
			System.out.print(sum + " ");
		}

	}

}
