import java.util.Scanner;

public class WavePrint {
	
	public static void wavePrint(int input[][]){
		int rows = input.length;
        int cols = input[0].length;
        
		for (int j = 0; j < cols; j++){
            if( j % 2 == 0) {
            	for(int i = 0; i < rows; i++) {
            		System.out.print(input[i][j] + " ");
            	}
            }
            else {
            	for(int i = rows - 1; i >= 0; i--) {
            		System.out.print(input[i][j] + " ");
            }
        }

	}
	}
	
	public static int[][]takeinput(){
		Scanner s = new Scanner(System.in);
	//	System.out.println("Enter number of rows");
		int rows = s.nextInt();
	//	System.out.println("Enter number of columns");
		int columns = s.nextInt();
		int input[][] = new int[rows][columns];
		for (int i = 0; i < rows ; i++) {
			for(int j = 0; j < columns; j++) {
	//			System.out.println("Enter element at " + i +"th row and " + j +"th column");
				input[i][j] = s.nextInt();
			}
		}
		return input;
	}

	public static void main(String[] args) {
		int[] [] input = takeinput();
		wavePrint(input);

	}

}
