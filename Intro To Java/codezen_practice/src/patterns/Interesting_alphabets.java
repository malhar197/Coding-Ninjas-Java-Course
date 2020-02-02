package patterns;

import java.util.Scanner;

public class Interesting_alphabets {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		char c = 'A';
		while (i <= n) {
			int j = 0;
			while (j < i) {
				System.out.print((char)(c+n-i+j));
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
