package practice;

public class PrintSubsetsSumToK {
		
	public static void printSubsetsSumTokHelper(int[] input, int start,int[] out, int k) {
		if(start == input.length) {
			if(k == 0) {
				for(int i : out) {
					System.out.print(i + " ");
				}
				System.out.println();
				return;
			} else {
				return;
			}
			}
	int[] newout = new int[out.length + 1];	
	int i = 0;
	for(;i < out.length;i++) {
		newout[i] = out[i];
	}
		newout[i] = input[start];
		printSubsetsSumTokHelper(input, start + 1, out, k);
		printSubsetsSumTokHelper(input, start + 1, newout, k - input[start]);
	}
	
	public static void printsubs(int[] input, int k) {
		int[] output = new int[0];
		printSubsetsSumTokHelper(input, 0, output, k);
	}

	public static void main(String[] args) {
		int[] arr = {5,12,3,17,1,18,15,3,17};
		printsubs(arr,6);

	}

}
