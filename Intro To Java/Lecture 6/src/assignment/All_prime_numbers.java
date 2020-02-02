package assignment;

import java.util.Scanner;

public class All_prime_numbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 2;
		System.out.println(2);
		while (i <= n) {
			int j = 2;
			while (j < i) {
				if (i % j == 0) {
					break;
				}
				if (j == i-1) {
					System.out.println(i);	
				}
				j++;
			}
			i++;
		}

	}

}
