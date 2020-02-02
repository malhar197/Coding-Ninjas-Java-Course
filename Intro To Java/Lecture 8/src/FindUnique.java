import java.util.Scanner;

public class FindUnique {
	
	public static int[] Input() {
		Scanner s =  new Scanner(System.in);
		int n = s.nextInt();
		if (n % 2 == 0) {
			return new int[1];
		}
		else{
			int input[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		
		return input;
		}
	}
	
	public static void print(int input[]) {
		int size = input.length;
		for (int i = 0; i < size ; i++) {
			System.out.print(input[i]+ " ");
		}
		
	}
	
	public static int Unique(int input[]) {
		int i = 0;
		int unique = 0;
		while (i < input.length) {
			int j = 0;
			while(j < input.length) {
				if ( i == j) {
					j++;
					continue;
				}
				if ( input[i] == input [j]) {
					break;
				}
				if ( j == input.length - 1) {
				unique = i;
				j++;
				return input[unique];
				}
				j++;
			}
			i++;
		}
		
		return input[unique];
	}

	public static void main(String[] args) {
		int arr[] = Input();
		print(arr);
		System.out.println(Unique(arr));

	}

}
