package practice;

public class TowerOfHanoi {
	
	public static void towerOfHanoi(int n, char source, char auxiliary, char destination) {
		if (n == 0) {
			return;
		}
		towerOfHanoi(n - 1, source, destination, auxiliary);
		System.out.println(source + " " + destination);
		towerOfHanoi(n - 1, auxiliary, source, destination);
	}

	public static void main(String[] args) {
		towerOfHanoi(2, 'a', 'b', 'c');

	}

}
