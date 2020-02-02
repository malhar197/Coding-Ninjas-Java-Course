package lecture10;

public class WavePrint {
	
	public static void waveprint(int[][] input) {
		int rows = input.length;
		int cols = input[0].length;
		for (int i = 0; i < cols; i++) {
			for (int j = 0; j < rows; j++) {
				System.out.print(input[j][i] + " ");
			}
			i++;
			if (i >= cols) {
				break;
			}
			for (int j = rows - 1; j >= 0; j--) {
				System.out.print(input[j][i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
