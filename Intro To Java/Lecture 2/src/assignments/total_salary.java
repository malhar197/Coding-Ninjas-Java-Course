package assignments;

import java.util.Scanner;

public class total_salary {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int basic = s.nextInt();
		double hra = (0.2*basic);
		double da =  (0.5*basic);
		double pf = (0.11*basic);
		int allow;
		String str = s.next();
		char k = str.charAt(0);
		
		if (k == 'A') {
			allow = 1700;
		}
		
		else if (k == 'B') {
			allow = 1500;
		}
		
		else {
			allow = 1300;
		}
		
		double total = (basic + hra + da + allow - pf);
		
		System.out.println(Math.round(total));
		
		
		

	}

}
