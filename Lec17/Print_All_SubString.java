package Lec17;

public class Print_All_SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "nitin";
		PrintSUbString(s);

	}

	public static void PrintSUbString(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));
			}
		}
	}

}
