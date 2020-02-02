import java.util.Scanner;

public class SortBinaryArray {
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
				
				int size = s.nextInt();
				int input[] = new int[size];
				for(int i = 0; i < size; i++) {
					input[i] = s.nextInt();
				}
				return input;
			}
	
	public static void sortbinary(int input[]) {
		int i = 0;
		int size = input.length;
		int j = size - 1;
		while (i < j) {
			if (input [i] == 0) {
				i++;
				continue;
			}
			else if (input[i] == 1 && input [j] == 0) {
				input[j] = 1;
				input[i] = 0;
				i++;
				j--;
				continue;
			}
			j--;
		}
	}

	public static void main(String[] args) {
		int arr[] = takeInput();
		sortbinary(arr);

	}

}
