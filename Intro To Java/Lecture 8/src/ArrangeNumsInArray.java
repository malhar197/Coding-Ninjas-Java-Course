import java.util.Scanner;

public class ArrangeNumsInArray {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int m;
		
		int arr[] = new int[n];
		
		if (n % 2 == 0) {
			m = n;
			
			int i = 0;
			int value = 1;
			
			while (i <= (m/2)-1) {
			arr[i] = value;
			value = value + 2;
			i++;
			}
			value = value - 1;
			while (i < m) {
				arr[i] = value;
				value = value - 2;
				i++;
			}
		}
		
		if ( n % 2 != 0) {
			int i = 0;
			int value = 1;
			while (i <= ((n-1)/2)) {
				arr[i] = value;
				value = value + 2;
				i++;
			}
			value = value - 3;
			while (i < n) {
				arr[i] = value;
				value = value - 2;
				i++;
			}
		}
		
		int i = 0;
		while ( i < n) {
			System.out.print(arr[i] + " ");
			i++;
		}

		
	}

}
