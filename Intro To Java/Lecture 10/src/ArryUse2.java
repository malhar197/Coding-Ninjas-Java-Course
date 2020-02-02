import java.util.Scanner;

public class ArryUse2 {

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
	public static int largestcolsum(int[][] input) {
		int largest = Integer.MIN_VALUE;
		int rows = input.length;
		int cols = input[0].length;
		for (int i = 0; i < cols; i++) {
			int sum = 0;
			for (int j = 0; j < rows; j++) {
				sum = sum + input[j][i];
			}
			if (sum > largest) {
				largest = sum;
			}
		}
		return largest;
	}
	public static void print(int[][] input) {
		int rows = input.length;
		int cols = input[0].length;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(input[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int input[][] = takeinput();
		print(input);
		
		System.out.println("Largest Col sum is " + largestcolsum(input));

	}

}
