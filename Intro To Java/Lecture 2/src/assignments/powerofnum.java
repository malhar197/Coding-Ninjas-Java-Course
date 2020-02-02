package assignments;

import java.util.Scanner;

public class powerofnum {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int m = s.nextInt();
	int i = n;
	int j = 1;
	
	while (j <= m - 1) {
		i = i * n;
		j++;
	}
	if (m != 0) {
		System.out.println(i);	
	}
	
	else if ( m == 0) {
		System.out.println(1);
	}
	
	}

}
