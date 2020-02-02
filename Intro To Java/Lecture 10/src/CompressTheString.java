
public class CompressTheString {
	
	public static String compress(String inputString) {
		String output = "";
		for(int i = 0; i < inputString.length();i++) {
			int count = 1;
			for (int j = i; j < inputString.length(); j++) {
				if( j == i) {
					continue;
				}
				if(inputString.charAt(j) != inputString.charAt(i)) {
					break;
				}
				count++;
			}
			if (i != 0 && inputString.charAt(i) == inputString.charAt(i - 1)) {
				continue;
			}
			if (count == 1) {
				output = output.concat(inputString.substring(i,i+1));
			}
			else {
				output = output.concat(inputString.substring(i,i+1)) + count;
			}
		}
		
		return output;
}	
	

	public static void main(String[] args) {
		String s = "maallu";
		String b = compress(s);
		System.out.println(b);

	}

}
