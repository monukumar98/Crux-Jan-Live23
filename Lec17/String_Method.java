package Lec17;

public class String_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		String str1 = new String("hello");
		String str2 = "hello";
		String str3 = new String("hello");
//		int a = 9;
//		int b = 9;
//		System.out.println(a == b);
		System.out.println(str == str1);
		System.out.println(str2 == str);// yaha pe same Address hai
		System.out.println(str3 == str1);
		System.out.println(str2 == str1);
		System.out.println(str.equals(str2));// both Content same hai
		String s = "hellobyeokayhey";
		System.out.println(s.substring(0, 5));
		System.out.println(s.substring(5));
		System.out.println(s.substring(2, 2));

	}

}
