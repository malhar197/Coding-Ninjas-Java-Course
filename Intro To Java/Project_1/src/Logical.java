import java.util.Scanner;

public class Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		boolean isAlargest = (a>=b) && (a>=c);
System.out.println(isAlargest);
System.out.println((a>=b) || (a>=c));
System.out.println(!((a>=b) && (a>=c)));
	}

}
