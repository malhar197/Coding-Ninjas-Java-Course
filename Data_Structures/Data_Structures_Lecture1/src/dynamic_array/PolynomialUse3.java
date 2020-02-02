package dynamic_array;

import java.util.Scanner;

public class PolynomialUse3 {

	public static void main(String[] args) {
Polynomial p1 = new Polynomial();
		
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int[] degree1 = new int[n1];
		for (int i = 0; i < n1; i++) {
			degree1[i] = s.nextInt();
		}
		
		int[] coeffs1 = new int [n1];
		
		for (int i = 0; i < n1; i++) {
			coeffs1[i] = s.nextInt();
		}
		
		for (int i = 0; i < n1; i++) {
			p1.setCoefficient(degree1[i], coeffs1[i]);
		}
		
		
		Polynomial p2 = new Polynomial();

		int n2 = s.nextInt();
		int[] degree2 = new int[n1];
		for (int i = 0; i < n2; i++) {
			degree2[i] = s.nextInt();
		}
		
		int[] coeffs2 = new int [n2];
		
		for (int i = 0; i < n2; i++) {
			coeffs2[i] = s.nextInt();
		}
		
		for (int i = 0; i < n2; i++) {
			p2.setCoefficient(degree2[i], coeffs2[i]);
		}
//		p1.print();
//		p2.print();
		
		p1 = p1.subtract(p2);
		p1.print();

	}

}
