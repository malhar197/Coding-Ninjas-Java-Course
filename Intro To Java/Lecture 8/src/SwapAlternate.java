import java.util.Scanner;

public class SwapAlternate {
	
	public static int[] Input() {
		Scanner s =  new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		
		return input;
		
	}
	
	public static void Swap( int input[]) {
		int i = 0;
		while (i < input.length - 1) {
			int k = input [i];
			int l = input [i + 1];
			input[i] = l;
			input[i+1] = k;
			i = i + 2;
		}
		for (int j = 0; j < input.length ; j++) {
			System.out.print(input[j]+ " ");
		}
	}
	
	public static void print(int input[]) {
		int size = input.length;
		for (int i = 0; i < size ; i++) {
			System.out.print(input[i]+ " ");
		}
		
	}

	public static void main(String[] args) {
		int arr[] = Input();
		Swap(arr);

	}

}
