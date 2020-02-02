
public class MergeTwoSortedArrays {
	
	public static int[] merge(int[] arr1, int[] arr2) {
		int size = arr1.length + arr2.length;
		int[] merged = new int[size];
		int i = 0;
		int j = 0;
		int k = 0;
		while ( k < size) {
			if (i >= arr1.length) {
				merged[k] = arr2[j];
				k++;
				j++;
				i++;
				continue;
			}
			else if (j >= arr2.length) {
				merged[k] = arr1[i];
				k++;
				j++;
				i++;
				continue;
			}
			else {
				if(arr1[i] > arr2[j]) {
					merged[k] = arr2[j];
					j++;
					k++;
				}
				else if (arr1[i] < arr2[j]) {
					merged[k] = arr1[i];
					i++;
					k++;
				}
				else {
					merged[k] = arr1[i];
					merged[k + 1] = arr2[j];
					k = k + 2;
					i++;
					j++;
				}
			}
		}
		for(int f = 0; f < size; f++) {
			System.out.print(merged[f] + " ");
		}
		return merged;
	}

	public static void main(String[] args) {
		int[] arr1 = {1,3,4,7,11};
		int[] arr2 = {2,4,6,13};
		merge(arr1,arr2);

	}

}
