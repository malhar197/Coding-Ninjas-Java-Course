package patterns;

import java.util.Scanner;

public class qpattern1 {
public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int i = 1;
		
		while (i <= n) {
			int j = 1;
			int val = i;
			while (j <= i) {
				System.out.print(val);
				val = val + 1;
				j = j+1;
			}
			System.out.println();
			i = i +1;
		}
}
}
