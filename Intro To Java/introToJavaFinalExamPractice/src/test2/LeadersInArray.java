package test2;

public class LeadersInArray {
	
	public static void leaders(int [] input) {
		for (int i = 0; i < input.length - 1; i++) {
			if (input[i] > input[i +1]) {
				for (int j = i + 1; j < input.length; j++) {
					if (input[j] > input[i]) {
						break;
					}
					else {
						if (j == input.length - 1) {
							System.out.print(input[i] + " ");
						}
					}
				}
			}
		}
		System.out.print(input[input.length - 1]);
		
	}
	

	public static void main(String[] args) {
		int[] arr = {13,17,5,4,6};
		leaders(arr);

	}

}
