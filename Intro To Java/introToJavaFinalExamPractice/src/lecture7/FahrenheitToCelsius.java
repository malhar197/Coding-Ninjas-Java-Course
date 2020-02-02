package lecture7;

public class FahrenheitToCelsius {
	
	public static void fahtocel(int start, int end, int step) {
		for (int i = start; i <= end; i = i + step) {
			int c = (5 *(i - 32))/9;
			System.out.println(i + " " + c);
		}
	}

	public static void main(String[] args) {
		fahtocel(0,100,20);

	}

}
