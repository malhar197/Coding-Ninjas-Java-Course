import java.util.Scanner;

public class LinearSearch {
	
	public static int[] Input() {
		Scanner s =  new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		
		return input;
		
	}
	
	
	
	public static int LinearSearch(int input[]) {
		Scanner s = new Scanner(System.in);
		int n = input.length;
		int num = s.nextInt();
		for (int i = 0; i < n; i++) {
			if (input[i] == num) {
				return i;
			}
		}
		
		return -1;
		
	}

	public static void main(String[] args) {
		int arr[] = Input();
		
		System.out.println(LinearSearch(arr));

	}

}
