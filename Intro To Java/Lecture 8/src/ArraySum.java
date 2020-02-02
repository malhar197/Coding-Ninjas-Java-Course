import java.util.Scanner;

public class ArraySum {
	
	public static int[] Input() {
		Scanner s =  new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		
		return input;
		
	}
	
	public static int sum(int input[]) {
		int n = input.length;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + input[i];
		}
		return sum;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
