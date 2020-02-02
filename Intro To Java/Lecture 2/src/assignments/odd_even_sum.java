package assignments;

import java.util.Scanner;

public class odd_even_sum {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int even = 0;
	int odd = 0;
	int r;
	while (n >= 10) {
		r = (n % 10);
	 if (r % 2 == 0) {
		 even = even + r;
	 }
	 else {
		 odd = odd + r;
	 }
	 n = (int)(n/10);
	 }
	if (n%2 == 0) {
		even = even + n;
	}
	else {
		odd = odd + n;
	}
	System.out.print(even + " " + odd);

	}

}
