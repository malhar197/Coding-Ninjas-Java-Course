package assignment;

import java.util.Scanner;

public class Check_number_sequence {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		int prev = s.nextInt();
		int curr;
		boolean isdec = true;
		while (i <= n-1) {
			int m = s.nextInt();
			curr = m;
			if (i == 1 && curr < prev) {
				isdec = true;
				curr = prev;
				i++;
				continue;
			}
			else if (i == 1 && curr > prev) {
				isdec = false;
				curr = prev;
				i++;
				continue;
			}
			
			if (curr == prev) {
				System.out.println("False");
				break;
			}
			
			if (isdec == false && curr < prev) {
				System.out.println("False");
				break;
			}
			
			if (isdec == true && curr > prev) {
				isdec= false;
			}
			
			if (i == n - 1) {
				System.out.println("True");
			}
			
			i++;
			curr = prev;
			
		}
	}

}
