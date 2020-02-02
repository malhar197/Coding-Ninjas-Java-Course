package lecture8;

import java.util.Scanner;

public class ArraysSum {
	
	public static int[] makearray(int n){
		int[] arr = new int[n];
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			int a = s.nextInt();
			arr[i] = a;
		}
		
		return arr;
	}
	
	public static int sumarray(int[] input) {
		int sum = 0;
		for(int i = 0; i < input.length; i++) {
			sum = sum + input[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] arr = makearray(5);
		System.out.println(sumarray(arr));

	}

}
