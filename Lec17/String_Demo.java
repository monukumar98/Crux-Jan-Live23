package Lec17;

public class String_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		String str1 = new String("hello");
		String str2 = "hello";
		String str3 = new String("hello");
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str.length());
		System.out.println(str.charAt(2));
		String s1 = "hey";
		String s2 = "Bye";
		// s1 = s1 + s2;
		s1 = s1.concat(s2);
		//System.out.println(str.intern() == str1);
		System.out.println(s1);

	}

}
