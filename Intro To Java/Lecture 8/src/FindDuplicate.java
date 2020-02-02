import java.util.Scanner;

public class FindDuplicate {
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
				
				int size = s.nextInt();
				int input[] = new int[size];
				for(int i = 0; i < size; i++) {
					input[i] = s.nextInt();
				}
				return input;
			}
	
	public static void print(int input[]) {
		int size = input.length;
		for (int i = 0; i < size ; i++) {
			System.out.print(input[i]+ " ");
		}
		
	}
	
	public static int findduplicate( int input[]) {
		int i = 0;
		while (i < input.length) {
			int j = 0;
			while ( j < input.length) {
				if (input[i] == input[j] && i != j) {
					return input[i];
				}
				j++;
			}
			i++;
		}
		return 0;
	}

	public static void main(String[] args) {
		int arr[] = takeInput();
		System.out.println(findduplicate(arr));

	}

}
