
public class SecondLargest {
	
	public static int secondlargest(int[] arr) {
		int largest = arr[0];
		int slargest = Integer.MIN_VALUE;
		int i = 0;
		
		while ( i < arr.length) {
			if (arr[i] > largest) {
				slargest = largest;
				largest = arr[i];
			}
			else {
				if (arr[i] > slargest && arr[i] != largest) {
					slargest = arr[i];
				}
			}
			i++;
		}
		return slargest;
	}

	public static void main(String[] args) {
		int[] arr = {7,10,9,1,2,3,4,5,6,8};
		System.out.println(secondlargest(arr));

	}

}
