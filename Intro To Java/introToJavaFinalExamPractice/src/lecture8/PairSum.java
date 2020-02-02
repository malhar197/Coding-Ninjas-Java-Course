package lecture8;

public class PairSum {
	
	public static void pairsum(int[] input, int x) {
		for (int i = 0; i < input.length; i++) {
			for (int j = i; j < input.length; j++) {
				if (j == i) {
					continue;
				}
				if (input[i] + input[j] == x) {
					if( input[i] < input[j]) {
						System.out.println(input[i] + " " + input[j]);
					}
					else {
						System.out.println(input[j] + " " + input[i]);
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {1,3,6,2,5,4,3,2,4};
		pairsum(arr,7);

	}

}
