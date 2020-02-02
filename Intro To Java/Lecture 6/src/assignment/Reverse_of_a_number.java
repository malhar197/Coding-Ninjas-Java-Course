package assignment;

import java.util.Scanner;

public class Reverse_of_a_number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int rev = n % 10;
		n = n/10;
		while (n > 0) {
			rev = (rev * 10) + n%10;
			n = n/10;
		}
        System.out.print(rev);
	}

}
