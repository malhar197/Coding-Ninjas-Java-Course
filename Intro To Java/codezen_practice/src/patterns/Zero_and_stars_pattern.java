package patterns;

import java.util.Scanner;

public class Zero_and_stars_pattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		
		while ( i <= n) {
			int j = 1;
			while ( j <= n) {
				if ( j == i) {
					System.out.print("*");
					j++;
					continue;
				}
				System.out.print(0);
				j++;
			}
			System.out.print("*");
			int k = 1;
			while (k <= n) {
				if (k == n - i + 1) {
					System.out.print("*");
					k++;
					continue;
				}
				System.out.print(0);
				k++;
			}
			System.out.println();
			i++;
		}

	}

}
