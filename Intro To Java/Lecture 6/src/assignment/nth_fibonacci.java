package assignment;

import java.util.Scanner;

public class nth_fibonacci {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		int j = 1;
		int k = 0;
		if (n > 2) {
			int c = 3;
			while (c <= n) {
				k = i + j;
				i = j;
				j = k;
				c++;
			}
			System.out.println(k);
		}
		else if (n == 2) {
			System.out.println(2);
		}
		
		else {
			System.out.println(1);
		}

	}

}
