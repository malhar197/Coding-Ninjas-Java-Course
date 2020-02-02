package patterns;

import java.util.Scanner;

public class binary_pattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while (i <= n) {
			int j = 1;
			if (i % 2 == 0) {
				while (j<=(n-i+1)) {
				System.out.print(0);
				j++;
				}
		}
			else {
				while (j<=(n-i+1)) {
					System.out.print(1);
					j++;
				}
			}
			System.out.println();
			i++;

	}
	}
}
