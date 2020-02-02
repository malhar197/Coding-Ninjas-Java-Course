import java.util.Scanner;

public class diamond_of_stars {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if (n % 2 == 0) {
			System.out.print("invalid input");
		}
		else {
		int i = 1;
		int m = (n+1)/2;
		while (i <= m) {
			int spaces = 1;
			while (spaces <= m-i) {
				System.out.print(" ");
				spaces++;
			}
			int j = 1;
			while (j <= 2*i - 1) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
			}
		i = 1;
		int m2 = n - m;
		while (i <= m2) {
			int spaces2 = 1;
			while (spaces2 <= i) {
				System.out.print(" ");
				spaces2++;
			}
			int g = 1;
			while (g <= (2*(m2-i)+1)) {
				System.out.print("*");
				g++;
			}
			System.out.println();
			i++;
		}
		}
	}

}
