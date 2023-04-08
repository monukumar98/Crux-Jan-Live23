package Lec22;

public class SubSequnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
		String ans = "";
		PrintSubSeqnue(ques, ans);

	}

	public static void PrintSubSeqnue(String ques, String ans) {
		// TODO Auto-generated method stub
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

		char ch = ques.charAt(0);
		PrintSubSeqnue(ques.substring(1), ans);
		PrintSubSeqnue(ques.substring(1), ans + ch);

	}

}
