package Lec17;

public class Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "hello";
		String str2 = "helol";
		System.out.println(equals(str1, str2));

	}

	public static boolean equals(String s1, String s2) {
		if (s1 == s2) {
			return true;

		}
		if (s1.length() != s2.length()) {
			return false;
		}
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				return false;
			}
		}
		return true;
	}

}
