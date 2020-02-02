package if_else;

import java.util.Scanner;

public class int2string {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int i = s.nextInt();
		
		if (i == 1) {
			System.out.println("one");
		}
		else if (i == 2) {
			System.out.println("two");
		}
		else if (i == 3) {
			System.out.println("three");
		}
	}

}
