package assignment;

import java.util.Scanner;

public class Terms_of_AP {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while (i <= n) {
			if (((3*i)+2) % 4 == 0) {
				i++;
				n++;
				continue;
			}
			System.out.print(((3*i)+2) + " ");
			i++;
		}

	}

}
