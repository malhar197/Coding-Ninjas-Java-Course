import java.util.Scanner;

public class ArrayIntersection {
	
	public static int[] takeInput1() {
		Scanner s = new Scanner(System.in);
				
				int size = s.nextInt();
				int input1[] = new int[size];
				for(int i = 0; i < size; i++) {
					input1[i] = s.nextInt();
				}
				return input1;
			}
	
	public static int[] takeInput2() {
		Scanner s = new Scanner(System.in);
				
				int size = s.nextInt();
				int input2[] = new int[size];
				for(int i = 0; i < size; i++) {
					input2[i] = s.nextInt();
				}
				return input2;
			}
	
	public static void intersections( int input1 [], int input2 []) {
		int i = 0;
		while (i < input1.length) {
			int j = 0;
			while (j < input2.length) {
				if (input1[i] == input2[j]) {
					System.out.println(input1[i]);
					input2[j] = Integer.MIN_VALUE;
				}
				j++;
			}
			i++;
		}
	}

	public static void main(String[] args) {
		int arr1[]= takeInput1();
		int arr2[] = takeInput2();
		intersections(arr1,arr2);

	}

}
