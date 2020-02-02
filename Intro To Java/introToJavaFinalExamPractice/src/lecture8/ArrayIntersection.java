package lecture8;

public class ArrayIntersection {
	
	public static void intersections(int[] input1, int[] input2) {
		for (int i = 0; i < input1.length; i++) {
			for (int j = 0; j < input2.length; j++) {
				if (input1[i] == input2[j]) {
					System.out.println(input1[i]);
					input2[j] = Integer.MIN_VALUE;
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr1 = {2,6,8,4,3};
		int[] arr2 = {1,2,3,4,2};
		
		intersections(arr1,arr2);

	}

}
