package practice;

public class ReturnStringPermutations {
	
	public static String[] returnperms(String s) {
		if(s.length() == 0) {
			String ans[] = {""};
			return ans;
		}
		String[] smallans = returnperms(s.substring(1));
		String[] ans = new String[s.length()*smallans.length];
		int k = 0;
		for(int i = 0; i < smallans.length; i++) {
			String str = smallans[i];
			for(int j = 0; j <= str.length();j++) {
				ans[k] = str.substring(0, j) + s.charAt(0) + str.substring(j);
				k++;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		String s = "chod";
		String[] str = returnperms(s);
		for(int i = 0; i < str.length;i++) {
			System.out.println(str[i]);
		}
	}

}
