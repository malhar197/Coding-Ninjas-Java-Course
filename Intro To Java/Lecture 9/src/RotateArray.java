import java.util.Scanner;

public class RotateArray {
	
	public static void rotatearray(int[] arr, int d) {
		int[] temp = new int[arr.length];
		int size = arr.length - 1;
		for (int i = d - 1; i >= 0; i--) {
			temp [size] = arr[i];
			size--;
		}
		int j = 0;
		for (int i = d; i < arr.length; i++) {
			temp[j] = arr[i];
			j++;
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = temp[i];
		}
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = {1,2,3,4,5,6,7};
		rotatearray(arr,n);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
