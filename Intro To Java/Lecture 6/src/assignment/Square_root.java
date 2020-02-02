package assignment;

import java.util.Scanner;

public class Square_root {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while (i * i < n) {
			i++;
		}
		System.out.println(i-1);

	}

}
