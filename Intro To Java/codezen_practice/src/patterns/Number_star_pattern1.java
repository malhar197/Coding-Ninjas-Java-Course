package patterns;

import java.util.Scanner;

public class Number_star_pattern1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while (i <= n) {
			int j = 1;
			while ( j <= n) {
				if (j == n - i + 1) {
					System.out.print("*");
					j++;
					continue;
				}
				System.out.print(n - j + 1);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
