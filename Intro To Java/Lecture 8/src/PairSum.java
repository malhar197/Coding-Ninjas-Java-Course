import java.util.Scanner;

public class PairSum {
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
				
				int size = s.nextInt();
				int input[] = new int[size];
				for(int i = 0; i < size; i++) {
					input[i] = s.nextInt();
				}
				return input;
			}
	
	public static void pairsum(int input[], int x) {
		int i = 0;
		while (i < input.length) {
			int j = 0;
			while (j < input.length) {
				if (input[i] + input[j]== x && i != j){
					if (input[i] < input[j]) {
						System.out.println(input[i] +" "+input[j]);
					}
					else {
						System.out.println(input[j] +" "+input[i]);
					}
				}
				j++;
			}
			input[i] = Integer.MIN_VALUE;
			i++;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[]= takeInput();
		int n = s.nextInt();
		pairsum(arr,n);

	}

}
