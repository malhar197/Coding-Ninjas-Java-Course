package patterns;

import java.util.Scanner;

public class alpha_pattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while (i <= n) {
			char ch = (char)('A'+i-1);
			int j = 1;
			while (j <= i) {
				System.out.print(ch);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
