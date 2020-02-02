package functions;

import java.util.Scanner;

public class Fibonacci_function {
	
	public static boolean checkmember(int n) {
		int i = 1;
		int j = 1;
		
		if ( n == 0) {
			return true;
		}
		if (n == 1) {
			return true;
		}
		while (i <= n) {
			int ans = i + j;
			if (ans == n) {
				return true;
			}
			i = j;
			j = ans;
			
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		int j = 1;
		boolean b = false;
		
		if ( n == 0) {
			b = true;
		}
		if (n == 1) {
			b = true;;
		}
		while (i <= n) {
			int ans = i + j;
			if (ans == n) {
				b = true;
				break;
			}
			i = j;
			j = ans;
			
		}
		
		System.out.println(b);
		
	}
		
		
		//System.out.println(checkmember(n));

	}


