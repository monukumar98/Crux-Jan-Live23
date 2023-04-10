package Lec25;

import java.util.*;

public class Key_paid {
	static String[] code = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "23";
		List<String> ll = new ArrayList<>();
		Printanswer(ques, "", ll);
		System.out.println(ll);
	}

	public static void Printanswer(String ques, String ans, List<String> ll) {
		// TODO Auto-generated method stub
		if (ques.length() == 0) {
			// System.out.print(ans + " ");
			ll.add(ans);
			return;
		}
		char ch = ques.charAt(0);// 2
		String press = code[ch - 48];// abc
		for (int i = 0; i < press.length(); i++) {
			Printanswer(ques.substring(1), ans + press.charAt(i), ll);
		}

	}

}
