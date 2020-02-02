package patterns;

import java.util.Scanner;

public class star_pattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = n; j>i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (i*2)-1; k++) {
				System.out.print("*");
			}
			System.out.println();

		}
		
		
		
		
//		while (i <= n) {
//			int c = (2*i - 1);
//			int j = 1;
//			while (j <= c) {
//				System.out.print("*");
//				j = j + 1;
//			}
//			System.out.println();
//			i = i +1;
//		}
		
         s.close();
	}

}
