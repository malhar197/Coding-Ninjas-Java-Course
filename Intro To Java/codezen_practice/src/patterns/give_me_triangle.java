package patterns;

import java.util.Scanner;

public class give_me_triangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 0;
		while (i < n ) {
			int spaces = 1;
			while (spaces <= n-(n-i)) {
				System.out.print(" ");
				spaces++;
			}
			int j = 0;
			while (j <= n-i-1) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
