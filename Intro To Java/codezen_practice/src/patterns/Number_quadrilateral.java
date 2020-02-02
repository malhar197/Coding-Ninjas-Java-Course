package patterns;

import java.util.Scanner;

public class Number_quadrilateral {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =  s.nextInt();
		if ( n % 2 == 0) {
			System.out.println("Invalid");
			return;
		}
		int i = 1;
		int m = (n + 1)/ 2;
		
		while (i <= m) {
			int spaces = 1;
			while( spaces <= m - i) {
				System.out.print("  ");
				spaces++;
			}
			int j = 1;
			int k = i;
			while (j <= i) {
				System.out.print(k + " ");
				if (j == i) {
					int h = 1;
					while (h < i) {
						System.out.print(k - h + " ");
						h++;
					}
				}
				k++;
				j++;
			}
			System.out.println();
			i++;
		}
		if ( i > m) {
			int o = n - m;
			i = 1;
			while ( i <= o) {
				int spaces2 = 1;
				while (spaces2 <= i) {
					System.out.print("  ");
					spaces2++;
				}
				int j = 1;
				int k = o - i + 1;
				while (j <= o - i + 1) {
					System.out.print(k + j -1 + " ");
					if ( k == j) {
						int h = 1;
						while (h <= o - i) {
							System.out.print(k + j - 1 - h + " ");
							h++;
						}
					}
					j++;
				}
				System.out.println();
				i++;
			}
		}

		
	}

}
