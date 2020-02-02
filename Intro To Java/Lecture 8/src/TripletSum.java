import java.util.Scanner;

public class TripletSum {
	
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
		while (i < input.length) {
			int j = 0;
			while (j < input.length) {
				if (input[i] + input[j] < x && i != j) {
					int k = 0;
					while (k < input.length) {
						if (input[i] + input [j] + input[k] == x && k != j && k != i) {
//							if(input[i] >= input[j] && input[i] >= input[k]) {
//								if(input[k] >= input[j]) {
//									System.out.println(input[j]+ " "+ input[k]+ " "+ input[i]);
//								}
//								else {
//									System.out.println(input[k]+ " "+ input[j]+ " "+ input[i]);
//								}
//								k++;
//								continue;
//							}
//							else if(input[j] >= input[i] && input[j] >= input[k]) {
//								if(input[i] >= input[k]) {
//									System.out.println(input[k]+ " "+ input[i]+ " "+ input[j]);
//								}
//								else {
//									System.out.println(input[i]+ " "+ input[k]+ " "+ input[j]);
//								}
//								k++;
//								continue;
//							}
//							else {
//								if(input[i] >= input[j]) {
//									System.out.println(input[j]+ " "+ input[i]+ " "+ input[k]);
//								}
//								else {
//									System.out.println(input[i]+ " "+ input[j]+ " "+ input[k]);
//								}
//								k++;
//								continue;
//								System.out.println(i + " " + j+ " " + k);
								System.out.println(input[i]+ " "+ input[j]+ " "+ input[k]);
								
//							}
						}
						k++;
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
		triplets(arr,n);

	}

}
