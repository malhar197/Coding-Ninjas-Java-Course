package assignment;

import java.util.Scanner;

public class Binary_to_decimal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int ans = 0;
		int pv = 1;
		while (n > 0) {
			int j = n % 10;
			j = j * pv;
			ans = ans + j;
			pv = pv * 2;
			n = n/10;
		}
		System.out.println(ans);

	}

}
