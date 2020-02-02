import java.util.Scanner;

public class Triplets {
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
				
				int size = s.nextInt();
				int input[] = new int[size];
				for(int i = 0; i < size; i++) {
					input[i] = s.nextInt();
				}
				return input;
		}
	public static void triplets(int input[], int x) {
		int i = 0;
		while( i < input.length) {
			int j = i + 1;
			while (j < input.length) {
				if (input[i] + input[j] < x) {
					int k = j + 1;
					while (k < input.length) {
						}
						if (input[i] + input[j] + input[k] == x) {
							if(input[i] <= input[j] && input[i] <= input[k]) {
								if(input[j] <= input[k]) {
									System.out.println(input[i] + " " + input[j] + " " + input[k]);
								}
								else {
									System.out.println(input[i] + " " + input[k] + " " + input[j]);
								}
							}
							if(input[j] <= input[i] && input[j] <= input[k]) {
								if (input[i] <= input[k]) {
									System.out.println(input[j] + " " + input[i] + " " + input[k]);
								}
								else {
									System.out.println(input[j] + " " + input[k] + " " + input[i]);
								}
							}
							if(input[k] <= input[i] && input[k] <= input[j]) {
								if (input[i] <= input[j]) {
									System.out.println(input[k] + " " + input[i] + " " + input[j]);
								}
								else {
									System.out.println(input[k] + " " + input[j] + " " + input[i]);
								}
							}
							
						}
						k++;
					}
				}
				j++;
			}
			i++;
			
		}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[] = takeInput();
		int n = s.nextInt();
		triplets(arr,n);

	}

}
