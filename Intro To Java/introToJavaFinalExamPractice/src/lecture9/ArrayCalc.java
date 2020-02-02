package lecture9;

public class ArrayCalc {
	
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static int[] sum(int[] arr1, int[] arr2) {
		int[] sum;
		
		if (arr1.length > arr2.length) {
			sum = new int[arr1.length + 1];
			int sumIndex = sum.length - 1;
			for (int i = arr1.length - 1; i >= 0; i --) {
				for (int j = arr2.length - 1; j >= 0; j--) {
					sum[sumIndex] = arr1[i] + arr2[j] + sum[sumIndex];
					if(sum[sumIndex] >= 10) {
						int temp = sum[sumIndex];
						sum[sumIndex] = temp % 10;
						sum[sumIndex-1] = temp / 10;
					}
					sumIndex--;
					i--;
				}
				if( i < 0) {
					break;
				}
				sum[sumIndex] = sum[sumIndex] + arr1[i];
				if(sum[sumIndex] >= 10) {
					int temp = sum[sumIndex];
					sum[sumIndex] = temp % 10;
					sum[sumIndex-1] = temp / 10;
				}
				sumIndex--;
			}
		}
		else {
			sum = new int[arr2.length + 1];
			int sumIndex = sum.length - 1;
			for (int i = arr2.length - 1; i >= 0; i --) {
				for (int j = arr1.length - 1; j >= 0; j--) {
					sum[sumIndex] = arr2[i] + arr1[j] + sum[sumIndex];
					if(sum[sumIndex] >= 10) {
						int temp = sum[sumIndex];
						sum[sumIndex] = temp % 10;
						sum[sumIndex-1] = temp / 10;
					}
					sumIndex--;
					i--;
				}
				if (i < 0) {
					break;
				}
				sum[sumIndex] = sum[sumIndex] + arr2[i];
				if(sum[sumIndex] >= 10) {
					int temp = sum[sumIndex];
					sum[sumIndex] = temp % 10;
					sum[sumIndex-1] = temp / 10;
				}
				sumIndex--;
			}
		}
		
		
		return sum;
	}

	public static void main(String[] args) {
		int[] arr1 = {6,2,4,3,2};
		int[] arr2 = {7,5,6};
		
		int[] sum = sum(arr1,arr2);
		print(sum);

	}

}
