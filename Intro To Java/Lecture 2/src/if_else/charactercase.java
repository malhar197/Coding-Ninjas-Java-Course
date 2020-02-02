package if_else;

import java.util.Scanner;

public class charactercase {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String str = s.next();
		
		char k = str.charAt(0);
		
		if (k == 'q' || k == 'w' || k =='e' || k =='r' || k == 't' || k =='y' || k =='u' || k =='i' || k=='o' || k == 'p' || k=='a' || k == 's' || k == 'd' || k =='f' || k == 'g' || k == 'h' || k == 'j' || k == 'k' || k =='l' || k == 'z' || k == 'x' || k == 'c' || k == 'v' || k =='b' || k == 'n' ||k == 'm') {
			System.out.println(0);
		}
		
		else if (k == 'Q' || k == 'W' || k == 'E' || k =='R' || k == 'T' || k == 'Y' || k == 'U' || k == 'I' || k == 'O' || k == 'P' || k == 'A' || k == 'S' || k == 'D' || k == 'F' || k == 'G' || k == 'H' || k == 'J' || k == 'K' || k == 'L' || k == 'Z' || k == 'X' || k == 'C' || k == 'V' || k == 'B' || k == 'N' || k == 'M') {
			System.out.println(1);
		}
		
		else {
			System.out.println(-1);
		}

	}

}
