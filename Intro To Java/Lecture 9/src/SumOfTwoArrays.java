
public class SumOfTwoArrays {
	
	public static int[] sumOfTwoArrays(int[] arr1, int[] arr2) {
		int n;
		int k = arr1.length;
		if (arr1.length > arr2.length) {
			n = k + 1;
		}
		else {
			n = arr2.length + 1;
		}
		int[] sum = new int[n];
		
		
		int i = arr1.length - 1;
		int j = arr2.length - 1;
		int carry = 0;
		while (n >= 1) {
			if (n-1 == 0) {
				sum[n-1] = carry;
			}
			if (i < 0) {
				while (j >= 0) {
					sum[n - 1] = (arr2[j] + carry) % 10;
					carry = (arr2[j] + carry)/10;
					n--;
					j--;
				}
				break;
			}
			else if ( j < 0) {
				while (i >= 0) {
					sum[n-1] = (arr1[i] + carry) % 10;
					carry = (arr1[i] + carry)/10;
					n--;
					i--;
				}
				break;
			}
			else {
			sum[n - 1] = (arr1[i] + arr2[j] + carry) % 10;
			carry = (arr1[i] + arr2[j] + carry) / 10;
			n--;
			i--;
			j--;
			}
		}
		
		return sum;
	}

	public static void main(String[] args) {
		int[] arr1 = {8,5,2};
		int[] arr2 = {1,3};
		int[] n = sumOfTwoArrays(arr1,arr2);
		
		for(int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
		}

	}

}
