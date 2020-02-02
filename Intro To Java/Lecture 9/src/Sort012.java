
public class Sort012 {

	public static void sort012(int[] arr) {
		int nz = 0;
		int nt = arr.length - 1;
		int i = 0;
		while (i < arr.length) {
			if (arr[i] == 0 ) {
				arr[i] = arr[nz];
				arr[nz] = 0;
				nz++;
				i++;
				continue;
			}
			if (arr[i] == 2 && i < nt) {
				arr[i] = arr[nt];
				arr[nt] = 2;
				nt--;
				continue;
			}
			i++;
		}
	}
	public static void main(String[] args) {
		int[] arr = {0,1,2,0,2,0,1};
		sort012(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
