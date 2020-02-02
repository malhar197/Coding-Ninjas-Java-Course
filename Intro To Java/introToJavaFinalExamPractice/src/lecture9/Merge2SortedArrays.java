package lecture9;

public class Merge2SortedArrays {
	
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static int[] merge(int[] arr1, int[] arr2) {
		int[] merged = new int[arr1.length + arr2.length];
		int k = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr2[j] < arr1[i]) {
					merged[k] = arr2[j];
					arr2[j] = Integer.MAX_VALUE;
					k++;
				}
			}
					merged[k] = arr1[i];
					k++;
				
			}
		return merged;
		}

		
	
	
public static void insertionsort(int[] arr) {
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j >= 1;j--) {
				if (arr[j] < arr[j-1]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr1 = {7,5,4,6,13,45,67,98};
		int[] arr2 = {3,1,2,65,23,69,12};
		insertionsort(arr1);
		print(arr1);
		System.out.println();
		insertionsort(arr2);
		print(arr2);
		System.out.println();
		int[] m = merge(arr1,arr2);
		print(m);

	}

}
