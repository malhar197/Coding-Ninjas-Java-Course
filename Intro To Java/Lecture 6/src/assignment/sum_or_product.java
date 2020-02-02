package assignment;

import java.util.Scanner;

public class sum_or_product {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int c = s.nextInt();
		int i = 1;
		
		if (c == 1) {
			int sum = 0;
			while (i <= n) {
				sum = sum + i;
				i++;
			}
			System.out.println(sum);
		}
		
		else if ( c == 2) {
			int product = 1;
			while (i <= n) {
				product = product * i;
				i++;
			}
			System.out.println(product);
		}
		
		else {
			System.out.println(-1);
		}

	}

}
