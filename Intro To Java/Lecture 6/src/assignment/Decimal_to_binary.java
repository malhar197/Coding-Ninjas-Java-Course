package assignment;

import java.util.Scanner;

public class Decimal_to_binary {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		long ans = 0;
		int pv = 1;
		while (n > 0) {
			int j = n % 2;
			ans = ans + j*pv;
			pv = pv * 10;
			n = n/2;
		}
		System.out.println(ans);

	}

}
