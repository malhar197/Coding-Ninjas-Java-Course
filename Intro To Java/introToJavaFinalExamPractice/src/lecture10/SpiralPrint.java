package lecture10;

public class SpiralPrint {
	
	public static void spiralPrint(int matrix[][]){
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
		// TODO Auto-generated method stub

	}

}
