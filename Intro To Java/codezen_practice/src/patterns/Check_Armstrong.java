package patterns;

import java.util.Scanner;

public class Check_Armstrong {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int count = 0;
		int i = n;
		while (i > 0) {
			i = i/10;
			count++;
		}
//		System.out.println(count);
		int sum = 0;
		int m = n;
		while (m > 0) {
			int j = m % 10;
			int k = 1;
			while ( k <= count - 1) {
				j = j * (m % 10);
				k++;
			}
//			System.out.println(j);
			sum = sum + j;
			m = m/10;
		}
//		System.out.println(sum);
		if (sum == n) {
			System.out.println("true");
		}
		
		else if ( sum != n) {
			System.out.println("false");
		}
	}

}
