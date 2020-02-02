import java.util.Scanner;

public class BinarySearch {
	
	public static int[] Input() {
		Scanner s =  new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		
		return input;
		
	}
	
	public static int binarysearch (int input [], int n) {
		int max = input.length - 1;
		int min = 0;
		int mid = (min + max)/2;
		
		while (min <= max) {
			if (input[mid] > n) {
				max = mid - 1;
			}
			else if (input[mid] == n) {
				return mid;
			}
			else {
				min = mid + 1;
			}
			mid = (max + min)/2;
		}
		
		return -1;
			
		}
		

	public static void main(String[] args) {
		int arr[] = Input();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(binarysearch(arr,n));
		

	}

}
