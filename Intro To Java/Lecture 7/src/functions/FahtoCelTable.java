package functions;

import java.util.Scanner;

public class FahtoCelTable {
	
	public static void printFahrenheitTable(int start, int end, int step) {
		while (start <= end) {
			int cel = (int) ((start - 32) * (5.0/9.0));
			System.out.println(start + " " + cel);
			start = start  + step;
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int start = s.nextInt();
		int end = s.nextInt();
		int step = s.nextInt();
		printFahrenheitTable(start,end,step);
	}

}
