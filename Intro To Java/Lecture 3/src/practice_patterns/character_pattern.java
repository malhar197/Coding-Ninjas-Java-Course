package practice_patterns;

import java.util.Scanner;

public class character_pattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while (i <= n) {
			int j = 1;
			char ch = (char)('A'+i-1);
			while (j <= i) {
				System.out.print(ch);
				ch = (char)(ch+1);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
