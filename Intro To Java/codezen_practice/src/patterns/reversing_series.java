package patterns;

import java.util.Scanner;

public class reversing_series {

	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);
		int n =  s.nextInt();
		int i = 1;
		int count = 1;
		while (i<=n) {
			if(i % 2 == 0) {
				count = count + i-1;
				int m = 1;
				while (m <= i) {
					System.out.print(count - m +1 + " ");
					m++;
				}
				count++;
			}
			else {
				int k = 0;
				while (k < i) {
					System.out.print(count+ " ");
					count++;
					k++;
				}
			}
			System.out.println();
			i++;
		}

	}

}
