package patterns;

import java.util.Scanner;

public class Rough {

	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while (i <= n) {
			int j = 1;
			while (j <= i) {
				char ch = (char)('A'+n - i + j - 1);
				System.out.print(ch);
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
