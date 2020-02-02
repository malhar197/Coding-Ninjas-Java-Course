import java.util.Scanner;

public class ArrayUse {

	public static void main(String[] args) {
//		int arr2d[][] = new int [3][4];
//		System.out.println(arr2d[1][2]);
//		arr2d[2][0] = 15;
//		System.out.println(arr2d[2][0]);
		
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
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(input[i][j] + " ");
			}
			System.out.println();
		}
	}
	

}
